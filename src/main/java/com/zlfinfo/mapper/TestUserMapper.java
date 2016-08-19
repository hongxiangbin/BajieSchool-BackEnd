package com.zlfinfo.mapper;

import com.zlfinfo.model.TestUser;

import java.util.List;

/**
 * Created by Administrator on 2016/8/18.
 */
public interface TestUserMapper {

    int deleteById(Long id);

    int insert(TestUser testUser);

    int update(TestUser testUser);

    TestUser findByLoginName(String username);

    TestUser findById(Long id);

    List<TestUser> findAll();

}
