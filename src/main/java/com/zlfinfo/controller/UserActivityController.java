package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.UserActivity;
import com.zlfinfo.service.UserActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/9/20.
 */
@Controller
public class UserActivityController extends BaseController {

    @Autowired
    private UserActivityService userActivityService;

    @RequestMapping(value = "/useract/{username}/{actId}", method = RequestMethod.GET)
    @ResponseBody
    public Object isLike(@PathVariable String username, @PathVariable Integer actId, HttpServletResponse
            httpServletResponse) {
        UserActivity userActivity = userActivityService.selectUserActivity(actId, username);
        if (null != userActivity) {
            return renderSuccess(userActivity, httpServletResponse);
        } else {
            return renderError("useractivity查询失败!", httpServletResponse);
        }
    }

}
