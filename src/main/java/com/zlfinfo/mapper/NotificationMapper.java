package com.zlfinfo.mapper;

import com.zlfinfo.model.Notification;

import java.util.List;

public interface NotificationMapper {

    List<Notification> selectByUsername(String username);

    int deleteByPrimaryKey(Integer noId);

    int insert(Notification record);

    int insertSelective(Notification record);

    Notification selectByPrimaryKey(Integer noId);

    int updateByPrimaryKeySelective(Notification record);

    int updateByPrimaryKey(Notification record);
}