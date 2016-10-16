package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.commons.constant.PointsAddNumber;
import com.zlfinfo.model.*;
import com.zlfinfo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/22.
 */
@Controller
public class ActivityController extends BaseController {

    @Autowired
    private ActivityService actService;
    @Autowired
    private ActivityTypeService activityTypeService;
    @Autowired
    private BannerService bannerService;
    @Autowired
    private LoginStatusService loginStatusService;
    @Autowired
    private UserActivityService userActivityService;
    @Autowired
    private PointsService pointsService;

    /**
     * 发布活动
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/addact", method = RequestMethod.POST)
    @ResponseBody
    public Object addact(@RequestParam(required = false) Integer actId, @RequestParam(required = false) Integer actType,
                         @RequestParam String actTitle, @RequestParam(required = false) String actContent,
                         @RequestParam(required = false) String actImg,
                         @RequestParam(required = false) Date actTime, @RequestParam(required = false) String
                                 actPlace, @RequestParam String username, HttpServletResponse response) {
        Activity act = new Activity(actId, actType, actTitle, actContent, actImg, actTime, actPlace);
        Integer actid = actService.insert(act);
        if (actid == 0) {
            return renderError("保存失败", response);
        } else {
            UserActivity userActivity = new UserActivity();
            userActivity.setActId(actid);
            userActivity.setUsername(username);
            userActivity.setLaunFlag(0);
            actService.insertuserActivity(userActivity);
            Points points = new Points(username, pointsService.selectPoint(username) + PointsAddNumber.POINT_LAUNCH_ACTIVITY, "发起活动+20");
            pointsService.updatePoints(points);
            return renderSuccess("保存成功", response);
        }
    }

    /**
     * 查询所有活动
     *
     * @param httpServletResponse
     * @return
     * @deprecated
     */
    @Deprecated
    @RequestMapping(value = "/allact", method = RequestMethod.GET)
    @ResponseBody
    public Object showAllActivity(HttpServletResponse httpServletResponse) {
        List<Activity> activityList = actService.selectAllActivity();
        if (null != activityList) {
            return renderSuccess(activityList, httpServletResponse);
        } else {
            return renderError("活动查询失败", httpServletResponse);
        }
    }

    @RequestMapping(value = "/activity", method = RequestMethod.POST)
    @ResponseBody
    public Object showActivity(@RequestParam String username, @RequestParam Integer type, HttpServletResponse
            httpServletResponse) {
        List<Activity> activityList = actService.selectActivityByUserNType(type);
        return null != activityList ? renderSuccess(activityList, httpServletResponse) : renderError("活动查询失败",
                httpServletResponse);
    }

    @RequestMapping(value = "/activityALL", method = RequestMethod.POST)
    @ResponseBody
    public Object showActivityALL(@RequestParam String username, @RequestParam Integer type, HttpServletResponse
            httpServletResponse) {
        Map resultMap = new HashMap();
        int ls = loginStatusService.selectStatusByUsername(username);
        if (ls == 0) {
            List<Activity> activityList = actService.selectActivityByUserNType(type);
            List<ActivityType> activityTypeList = activityTypeService.selectAllActType();
            List<Banner> bannerList = bannerService.selectAllBanner();
            resultMap.put("Activity", activityList);
            resultMap.put("ActivityType", activityTypeList);
            resultMap.put("Banner", bannerList);
            return null != activityList ? renderSuccess(resultMap, httpServletResponse) : renderError("活动查询失败",
                    httpServletResponse);
        } else {
            return renderError("用户状态为登出", httpServletResponse);
        }
    }

    @RequestMapping(value = "/activity/join", method = RequestMethod.GET)
    @ResponseBody
    public Object selectJoinAct(@RequestParam String username, HttpServletResponse
            httpServletResponse) {
        List<Activity> activityList = actService.selectJoinActivity(username);
        return null != activityList ? renderSuccess(activityList, httpServletResponse) : renderError("参加活动列表查询失败",
                httpServletResponse);
    }

    @RequestMapping(value = "/activity/mine", method = RequestMethod.GET)
    @ResponseBody
    public Object selectMyActivity(@RequestParam String username, @RequestParam Integer launFlag, HttpServletResponse
            httpServletResponse) {
        List<Activity> publishedList = actService.selectMineActivity(username, launFlag);
        return null != publishedList ? renderSuccess(publishedList, httpServletResponse) : renderError("发起活动列表查询失败",
                httpServletResponse);
    }

    @RequestMapping(value = "/activity/updlike", method = RequestMethod.POST)
    @ResponseBody
    public Object updateLike(@RequestParam("actId") Integer actId, @RequestParam("username") String username,
                             HttpServletResponse httpServletResponse) {
        Activity activity = actService.selectByPrimaryKey(actId);
        activity.setActLike(activity.getActLike() + 1);
        int i = actService.updateByPrimaryKeySelective(activity);

        UserActivity userActivity = new UserActivity();
        userActivity.setActId(actId);
        userActivity.setLikeFlag(1);
        userActivity.setUsername(username);
        UserActivity userActivity1 = userActivityService.selectUserActivity(actId, username);
        if (null == userActivity1) {
            userActivityService.insertSelective(userActivity);
        } else {
            userActivityService.updateByPrimaryKeySelective(userActivity);
        }

        return i > 0 ? renderSuccess("点赞+1成功!", httpServletResponse) : renderError("点赞+1失败!", httpServletResponse);
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    @ResponseBody
    public Object join(@RequestParam Integer actId, @RequestParam String username,
                       HttpServletResponse httpServletResponse) {
        int i = 0;
        UserActivity userActivity = new UserActivity();
        userActivity.setActId(actId);
        userActivity.setJoinFlag(1);
        userActivity.setUsername(username);
        UserActivity userAct = userActivityService.selectUserActivity(actId, username);
        if (null == userAct) {
            userActivityService.insertSelective(userActivity);
            i = actService.addJoinNum(actId);
        } else if (1 != userAct.getJoinFlag()) {
            userActivityService.updateByPrimaryKeySelective(userActivity);
            i = actService.addJoinNum(actId);
        }

        return i > 0 ? renderSuccess("参加人数+1成功!", httpServletResponse) : renderError("参加人数+1失败!", httpServletResponse);
    }

}