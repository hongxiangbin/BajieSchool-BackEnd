package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.UserActivityMapper;
import com.zlfinfo.model.UserActivity;
import com.zlfinfo.service.UserActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/20.
 */
@Service
public class UserActivityServiceImpl implements UserActivityService {

    @Autowired
    private UserActivityMapper userActivityMapper;

    @Override
    public UserActivity selectUserActivity(Integer actId, String username) {
        return userActivityMapper.selectUserActivity(actId, username);
    }

    @Override
    public int updateByPrimaryKeySelective(UserActivity userActivity) {
        return userActivityMapper.updateByPrimaryKeySelective(userActivity);
    }

    @Override
    public int insertSelective(UserActivity userActivity) {
        return userActivityMapper.insertSelective(userActivity);
    }

}