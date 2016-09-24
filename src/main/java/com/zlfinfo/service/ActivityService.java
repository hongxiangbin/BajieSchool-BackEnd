package com.zlfinfo.service;

import com.zlfinfo.model.Activity;
import com.zlfinfo.model.User;
import com.zlfinfo.model.UserActivity;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface ActivityService {
    int insert(Activity act);

    int insertuserActivity(UserActivity userActivity);

    List<Activity> selectAllActivity();

    List<Activity> selectActivityByUserNType(Integer type);

    List<Activity> selectMineActivity(String username, Integer launFlag);

    List<Activity> selectJoinActivity(String username);

    int updateByPrimaryKeySelective(Activity act);

    Activity selectByPrimaryKey(Integer actId);

    int addCommentNum(Integer actId);

    int addJoinNum(Integer actId);

}