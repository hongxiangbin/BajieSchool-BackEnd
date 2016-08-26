package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.StudyMapper;
import com.zlfinfo.model.Study;
import com.zlfinfo.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/25.
 */
@Service
public class StudyServiceImpl implements StudyService {

    @Autowired
    private StudyMapper studyMapper;

    @Override
    public List<Study> selectStudyByTypeNUser(Integer type, String username) {
        return studyMapper.selectStudyByTypeNUser(type, username);
    }
}
