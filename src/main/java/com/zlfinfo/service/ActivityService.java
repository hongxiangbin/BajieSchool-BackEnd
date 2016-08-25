package com.zlfinfo.service;

import com.zlfinfo.model.Activity;
import com.zlfinfo.model.User;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface ActivityService {
    int insert(Activity act);

    List<Activity> selectAllActivity();

    List<Activity> selectActivityByUserNType(String username, Integer type);

    List<Activity> selectMineActivity(String username, Integer type);

}