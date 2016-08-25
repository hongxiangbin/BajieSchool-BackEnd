package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Activity;
import com.zlfinfo.model.User;
import com.zlfinfo.service.ActivityService;
import com.zlfinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/8/22.
 */
@Controller
public class ActivityController extends BaseController {

    @Autowired
    private ActivityService actService;

    /**
     * 发布活动
     *
     * @param act
     * @return
     */
    @RequestMapping(value = "/addact", method = RequestMethod.POST)
    @ResponseBody
    public Object addact(@PathVariable Activity act, HttpServletResponse response) {
        System.out.println(act);
        actService.insert(act);
        return renderSuccess("保存成功", response);
    }

    /**
     * 查询所有活动
     *
     * @param httpServletResponse
     * @return
     * @deprecated
     */
    @Deprecated
    @RequestMapping(value = "/showallact", method = RequestMethod.GET)
    @ResponseBody
    public Object showAllActivity(HttpServletResponse httpServletResponse) {
        List<Activity> activityList = actService.selectAllActivity();
        if (null != activityList) {
            return renderSuccess(activityList, httpServletResponse);
        } else {
            return renderError("活动查询失败", httpServletResponse);
        }
    }

    @RequestMapping(value = "/{username}/activity/{type}", method = RequestMethod.GET)
    @ResponseBody
    public Object showActivity(@PathVariable String username, @PathVariable Integer type, HttpServletResponse
            httpServletResponse) {
        List<Activity> activityList = actService.selectActivityByUserNType(username, type);
        return null != activityList ? renderSuccess(activityList, httpServletResponse) : renderError("活动查询失败",
                httpServletResponse);
    }


    @RequestMapping(value = "/activity/launch/{username}/{flag}", method = RequestMethod.GET)
    @ResponseBody
    public Object showMineAct(@PathVariable String username, @PathVariable int flag, HttpServletResponse
            httpServletResponse) {
        List<Activity> activityList = actService.selectMineActivity(username, flag);
        return null != activityList ? renderSuccess(activityList, httpServletResponse) : renderError("发起活动列表查询失败",
                httpServletResponse);
    }

}
