package com.zlfinfo.service;

import com.zlfinfo.model.User;

import java.util.List;

/**
 * Created by Administrator on 2016/8/22.
 */
public interface UserService {

    User findUserByUsername(String username);

    List<User> findAllUsers();

    int updatePassword(String username, String password);

    User selectStudyUser(Integer stdId);

    int insert(User use);

    int insertSelective(User use);

}