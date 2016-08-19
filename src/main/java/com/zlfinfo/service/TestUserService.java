package com.zlfinfo.service;

import com.zlfinfo.model.TestUser;

import java.util.List;

/**
 * Created by Administrator on 2016/8/18.
 */
public interface TestUserService {

    //根据登录名查用户
    TestUser findUserByLoginName(String username);

    //根据id查用户
    TestUser findUserById(Long id);

    //查询所有用户
    List<TestUser> findUsers();

    //创建用户
    int addUser(TestUser testUser);

    //更新用户
    int updateUser(TestUser testUser);

    //根据id删除用户
    int deleteUser(Long id);
}
