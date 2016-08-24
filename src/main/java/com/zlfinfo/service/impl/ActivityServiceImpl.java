package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.ActivityMapper;
import com.zlfinfo.mapper.UserMapper;
import com.zlfinfo.model.Activity;
import com.zlfinfo.model.User;
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

    @Override
    public int insert(Activity act) {
        return actMapper.insert(act);
    }

    @Override
    public List<Activity> selectAllActivity() {
        return actMapper.selectAllActivity();
    }

    @Override
    public List<Activity> selectActivityByUserNType(String username, String type) {
        return actMapper.selectActivityByUserNType(username, type);
    }
}
