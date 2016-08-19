package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.TestUserMapper;
import com.zlfinfo.model.TestUser;
import com.zlfinfo.service.TestUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/18.
 */
@Service
public class TestUserServiceImpl implements TestUserService {

    private static Logger LOGGER = LoggerFactory.getLogger(TestUserServiceImpl.class);

    @Autowired
    public TestUserMapper testUserMapper;

    @Override
    public TestUser findUserByLoginName(String username) {
        return testUserMapper.findByLoginName(username);
    }

    @Override
    public TestUser findUserById(Long id) {
        return testUserMapper.findById(id);
    }

    @Override
    public List<TestUser> findUsers() {
        return testUserMapper.findAll();
    }

    @Override
    public int addUser(TestUser testUser) {
        testUserMapper.insert(testUser);
        return 0;
    }

    @Override
    public int updateUser(TestUser testUser) {
        testUserMapper.update(testUser);
        return 0;
    }

    @Override
    public int deleteUser(Long id) {
        testUserMapper.deleteById(id);
        return 0;
    }
}
