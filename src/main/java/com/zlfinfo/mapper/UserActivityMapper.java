package com.zlfinfo.mapper;

import com.zlfinfo.model.UserActivity;
import org.apache.ibatis.annotations.Param;

public interface UserActivityMapper {
    int deleteByPrimaryKey(@Param("actId") Integer actId, @Param("username") String username);

    int insert(UserActivity record);

    int insertSelective(UserActivity record);

    UserActivity selectByPrimaryKey(@Param("actId") Integer actId, @Param("username") String username);

    int updateByPrimaryKeySelective(UserActivity record);

    int updateByPrimaryKey(UserActivity record);
}