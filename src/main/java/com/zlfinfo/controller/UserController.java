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
    public Object getAllUsers(){
        return renderSuccess(userService.findUsers());
    }

    /**
     * 根据id查用户
     * @param id 用户id
     * @return
     */
    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Object getUser(@PathVariable Long id){
        User user = userService.findUserById(id);
        return renderSuccess(user);
    }

    /**
     * 创建用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public Object createUser(User user){
        userService.addUser(user);
        return renderSuccess();
    }

    /**
     * 更新{id}用户信息
     * @param id
     * @param user
     * @return {object}
     */
    @RequestMapping(value = "/users/{id}",method = RequestMethod.PATCH)
    @ResponseBody
    public Object updateUser(@PathVariable Long id,User user){
        user.setId(id);
        userService.updateUser(user);
        return renderSuccess();
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return renderSuccess();
    }

}
