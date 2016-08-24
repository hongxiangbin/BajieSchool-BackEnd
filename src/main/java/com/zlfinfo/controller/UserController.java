package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.User;
import com.zlfinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/8/22.
 */
@Controller
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 根据username查用户
     *
     * @param username 用户名称
     * @return
     */
    @RequestMapping(value = "/login/{username}", method = RequestMethod.POST)
    @ResponseBody
    public Object login(@PathVariable String username, @RequestParam String password, HttpServletResponse response) {
        User user = userService.findUserByUsername(username);
        if (null != user) {
            logger.debug(user + "--------------------------------" + password);
            if (password.trim().equals(user.getPassword())) {
                return renderSuccess(response);
            } else {
                return renderError("用户名或密码错误", response);
            }

        } else {
            return renderError("用户名或密码错误", response);
        }
    }


    /**
     * 修改密码
     */
    @RequestMapping(value = "/chpassword", method = RequestMethod.POST)
    @ResponseBody
    public Object chPassword(@RequestParam String username, String password, HttpServletResponse httpServletResponse) {
        int i = userService.updatePassword(username, password);
        if (i != 0) {
            return renderSuccess("修改成功", httpServletResponse);
        } else {
            return renderError("修改失败", httpServletResponse);
        }
    }


    /**
     * 查询所有用户
     *
     * @deprecated
     */
    @Deprecated
    @RequestMapping(value = "/showallusers", method = RequestMethod.GET)
    @ResponseBody
    public Object getAllUsers(HttpServletResponse response) {
        return renderSuccess(userService.findAllUsers(), response);
    }

    @RequestMapping(value = "/checkname/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Object checkUserExist(@PathVariable String username, HttpServletResponse httpServletResponse) {
        User user = userService.findUserByUsername(username);
        return null == user ? renderSuccess("YES", httpServletResponse) :
                renderError("NO", httpServletResponse);
    }

}
