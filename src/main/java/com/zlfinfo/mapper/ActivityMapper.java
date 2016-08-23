package com.zlfinfo.mapper;

import com.zlfinfo.model.Activity;

import java.util.List;

public interface ActivityMapper {
    int deleteByPrimaryKey(String actId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(String actId);

    List<Activity> selectAllActivity();

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}