package com.zlfinfo.service;

import com.zlfinfo.model.Notification;

import java.util.List;

/**
 * Created by 29140 on 2016/10/14.
 */
public interface NotificationService {

    List<Notification> selectNotifications(String username);
}
