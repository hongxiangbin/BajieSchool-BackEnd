package com.zlfinfo.mapper;

import com.zlfinfo.model.User;

import java.util.List;

/**
 * Created by Administrator on 2016/8/18.
 */
public interface UserMapper {

    int deleteById(Long id);

    int insert(User user);

    int update(User user);

    User findByLoginName(String username);

    User findById(Long id);

    List<User> findAll();

}
