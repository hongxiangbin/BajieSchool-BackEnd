package com.zlfinfo.mapper;

import com.zlfinfo.model.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityMapper {
    int deleteByPrimaryKey(String actId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(String actId);

    List<Activity> selectAllActivity();

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    List<Activity> selectActivityByUserNType(@Param("username") String username, @Param("type") String type);
}