package com.zlfinfo.mapper;

import com.zlfinfo.model.Notification;

public interface NotificationMapper {
    int deleteByPrimaryKey(String noId);

    int insert(Notification record);

    int insertSelective(Notification record);

    Notification selectByPrimaryKey(String noId);

    int updateByPrimaryKeySelective(Notification record);

    int updateByPrimaryKey(Notification record);
}