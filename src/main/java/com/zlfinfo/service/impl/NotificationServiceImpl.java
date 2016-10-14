package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.NotificationMapper;
import com.zlfinfo.model.Notification;
import com.zlfinfo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 29140 on 2016/10/14.
 */
@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationMapper notificationMapper;

    @Override
    public List<Notification> selectNotifications(String username) {
        return notificationMapper.selectByUsername(username);
    }
}
