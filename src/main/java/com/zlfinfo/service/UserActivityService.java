package com.zlfinfo.service;

import com.zlfinfo.model.UserActivity;

/**
 * Created by Administrator on 2016/9/20.
 */
public interface UserActivityService {

    UserActivity selectUserActivity(Integer actId, String username);

    int updateByPrimaryKeySelective(UserActivity userActivity);

    int insertSelective(UserActivity userActivity);
}
