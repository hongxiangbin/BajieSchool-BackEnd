package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.ActivityTypeMapper;
import com.zlfinfo.model.ActivityType;
import com.zlfinfo.service.ActivityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
@Service
public class ActivityTypeServiceImpl implements ActivityTypeService {

    @Autowired
    private ActivityTypeMapper activityTypeMapper;

    @Override
    public List<ActivityType> selectAllActType() {
        return activityTypeMapper.selectAllActType();
    }

    @Override
    public List<ActivityType> selectActTypeByUser(String username) {
        return activityTypeMapper.selectActTypeByUser(username);
    }
}
