package com.zlfinfo.mapper;

import com.zlfinfo.model.User;

import java.util.List;

public interface UserMapper {

    List<User> selectJoinUser(Integer actId);

    int deleteByPrimaryKey(String username);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updatePassword(String username, String password);

    User selectStudyUser(Integer stdId);

    List<User> findAllUsers();
}