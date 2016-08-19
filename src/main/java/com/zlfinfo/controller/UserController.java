package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.User;
import com.zlfinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/8/18.
 */
@Controller
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return {object}
     */
    @RequestMapping(value="/users",method = RequestMethod.GET)
    @ResponseBody
    public Object getAllUsers(HttpServletResponse response){
        return renderSuccess(userService.findUsers(),response);
    }

    /**
     * 根据id查用户
     * @param id 用户id
     * @return
     */
    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Object getUser(@PathVariable Long id,HttpServletResponse response){
        User user = userService.findUserById(id);
        return renderSuccess(user,response);
    }

    /**
     * 创建用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public Object createUser(User user,HttpServletResponse response){
        userService.addUser(user);
        return renderSuccess(response);
    }

    /**
     * 更新{id}用户信息
     * @param id
     * @param user
     * @return {object}
     */
    @RequestMapping(value = "/users/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public Object updateUser(@PathVariable Long id,User user,HttpServletResponse response){
        user.setId(id);
        userService.updateUser(user);
        return renderSuccess(response);
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteUser(@PathVariable Long id,HttpServletResponse response){
        userService.deleteUser(id);
        return renderSuccess(response);
    }

}
