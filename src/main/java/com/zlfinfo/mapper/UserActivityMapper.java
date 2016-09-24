package com.zlfinfo.mapper;

import com.zlfinfo.model.UserActivity;
import org.apache.ibatis.annotations.Param;

public interface UserActivityMapper {
    int insertSelective(UserActivity record);

    UserActivity selectUserActivity(@Param("actId") Integer actId, @Param("username") String username);

    int updateByPrimaryKeySelective(UserActivity userActivity);
}