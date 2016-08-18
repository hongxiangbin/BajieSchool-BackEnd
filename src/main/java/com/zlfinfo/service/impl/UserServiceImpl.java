package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.UserMapper;
import com.zlfinfo.model.User;
import com.zlfinfo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/18.
 */
@Service
public class UserServiceImpl implements UserService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    public UserMapper userMapper;

    @Override
    public User findUserByLoginName(String username) {
        return userMapper.findByLoginName(username);
    }

    @Override
    public User findUserById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findUsers() {
        return userMapper.findAll();
    }

    @Override
    public int addUser(User user) {
        userMapper.insert(user);
        return 0;
    }

    @Override
    public int updateUser(User user) {
        userMapper.update(user);
        return 0;
    }

    @Override
    public int deleteUser(Long id) {
        userMapper.deleteById(id);
        return 0;
    }
}
