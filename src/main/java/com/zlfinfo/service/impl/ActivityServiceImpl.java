package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.ActivityMapper;
import com.zlfinfo.mapper.UserActivityMapper;
import com.zlfinfo.mapper.UserMapper;
import com.zlfinfo.model.Activity;
import com.zlfinfo.model.User;
import com.zlfinfo.model.UserActivity;
import com.zlfinfo.service.ActivityService;
import com.zlfinfo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    public ActivityMapper actMapper;
    @Autowired
    public UserActivityMapper userActivityMapper;
    @Override
    public int insert(Activity act) {
        Integer num = actMapper.insert(act);
        if(num==1){
            return act.getActId();
        }else{
            return 0;
        }
    }
    @Override
    public int insertuserActivity(UserActivity userActivity) {
        userActivityMapper.insert(userActivity);
        return 0;
    }
    @Override
    public List<Activity> selectAllActivity() {
        return actMapper.selectAllActivity();
    }

    @Override
    public List<Activity> selectActivityByUserNType(String username, Integer type) {
        return actMapper.selectActivityByUserNType(username, type);
    }

    @Override
    public List<Activity> selectMineActivity(String username, Integer flag) {
        return actMapper.selectMineActivity(username, flag);
    }

    @Override
    public int updateByPrimaryKeySelective(Activity act) {
        return actMapper.updateByPrimaryKeySelective(act);
    }

    @Override
    public Activity selectByPrimaryKey(Integer actId) {
        return actMapper.selectByPrimaryKey(actId);
    }
}
