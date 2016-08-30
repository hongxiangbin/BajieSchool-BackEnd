package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.UserStudyMapper;
import com.zlfinfo.model.UserStudy;
import com.zlfinfo.service.UserStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/30.
 */
@Service
public class UserStudyServiceImpl implements UserStudyService {

    @Autowired
    private UserStudyMapper userStudyMapper;

    @Override
    public int insertUserStudy(UserStudy userStudy) {
        return userStudyMapper.insert(userStudy);
    }
}
