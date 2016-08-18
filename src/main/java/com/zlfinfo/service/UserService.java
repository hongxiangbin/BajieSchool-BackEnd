package com.zlfinfo.service;

import com.zlfinfo.model.User;

import java.util.List;

/**
 * Created by Administrator on 2016/8/18.
 */
public interface UserService {

    //根据登录名查用户
    User findUserByLoginName(String username);

    //根据id查用户
    User findUserById(Long id);

    //查询所有用户
    List<User> findUsers();

    //创建用户
    int addUser(User user);

    //更新用户
    int updateUser(User user);

    //根据id删除用户
    int deleteUser(Long id);
}
