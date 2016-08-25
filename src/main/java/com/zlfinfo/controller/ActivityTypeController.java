package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Activity;
import com.zlfinfo.model.ActivityType;
import com.zlfinfo.service.ActivityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
@Controller
public class ActivityTypeController extends BaseController {
    @Autowired
    private ActivityTypeService activityTypeService;

    @RequestMapping(value = "/acttype", method = RequestMethod.GET)
    @ResponseBody
    public Object showActTypes(HttpServletResponse httpServletResponse) {
        List<ActivityType> activityTypeList = activityTypeService.selectAllActType();
        if (null != activityTypeList) {
            return renderSuccess(activityTypeList, httpServletResponse);
        } else {
            return renderError("活动类型返回失败", httpServletResponse);
        }
    }

    @RequestMapping(value = "/acttype", method = RequestMethod.GET)
    @ResponseBody
    public Object showUserActTypes(String username, HttpServletResponse httpServletResponse) {
        List<ActivityType> activityTypeList = activityTypeService.selectActTypeByUser(username);
        return null != activityTypeList ? renderSuccess(activityTypeList, httpServletResponse) : renderError
                ("返回用户关注活动类型失败", httpServletResponse);

    }

}
