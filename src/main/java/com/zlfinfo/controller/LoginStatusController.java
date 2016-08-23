package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.LoginStatus;
import com.zlfinfo.service.LoginStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/22.
 */
@Controller
public class LoginStatusController extends BaseController {

    @Autowired
    private LoginStatusService loginStatusService;

    @RequestMapping(value = "/status/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Object chStatus(@PathVariable String username, HttpServletResponse httpServletResponse) {
        logger.debug(username + "==============================");
        int loginStatus = loginStatusService.selectStatusByUsername(username);

        if (0 == loginStatus) {
            loginStatusService.updateStatus(new LoginStatus(username, 1, new Date()));
        } else if (1 == loginStatus) {
            loginStatusService.updateStatus(new LoginStatus(username, 0, new Date()));
        }
        return renderSuccess("登录状态修改成功", httpServletResponse);
    }

}