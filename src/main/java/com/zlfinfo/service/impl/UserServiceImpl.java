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
 * Created by Administrator on 2016/8/22.
 */
@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    public UserMapper userMapper;

    @Override
    public User findUserByUsername(String username) {
        return userMapper.selectByPrimaryKey(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public int updatePassword(String username, String password) {
        return userMapper.updatePassword(username, password);
    }

    @Override
    public User selectStudyUser(Integer stdId) {
        return userMapper.selectStudyUser(stdId);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }
}
