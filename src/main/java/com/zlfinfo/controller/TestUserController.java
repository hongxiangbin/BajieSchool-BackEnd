package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.TestUser;
import com.zlfinfo.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/8/18.
 */
@Controller
public class TestUserController extends BaseController {

    @Autowired
    private TestUserService testUserService;

    /**
     * 查询所有用户
     *
     * @return {object}
     */
    @RequestMapping(value = "/testusers", method = RequestMethod.GET)
    @ResponseBody
    public Object getAllUsers(HttpServletResponse response) {
        return renderSuccess(testUserService.findUsers(), response);
    }

    /**
     * 根据id查用户
     *
     * @param id 用户id
     * @return
     */
    @RequestMapping(value = "/testusers/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getUser(@PathVariable Long id, HttpServletResponse response) {
        TestUser testUser = testUserService.findUserById(id);
        return renderSuccess(testUser, response);
    }

    /**
     * 创建用户
     *
     * @param testUser
     * @return
     */
    @RequestMapping(value = "/testusers", method = RequestMethod.POST)
    @ResponseBody
    public Object createUser(TestUser testUser, HttpServletResponse response) {
        testUserService.addUser(testUser);
        return renderSuccess(response);
    }

    /**
     * 更新{id}用户信息
     *
     * @param id
     * @param testUser
     * @return {object}
     */
    @RequestMapping(value = "/testusers/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Object updateUser(@PathVariable Long id, TestUser testUser, HttpServletResponse response) {
        testUser.setId(id);
        testUserService.updateUser(testUser);
        return renderSuccess(response);
    }

    @RequestMapping(value = "/testusers/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteUser(@PathVariable Long id, HttpServletResponse response) {
        testUserService.deleteUser(id);
        return renderSuccess(response);
    }

}
