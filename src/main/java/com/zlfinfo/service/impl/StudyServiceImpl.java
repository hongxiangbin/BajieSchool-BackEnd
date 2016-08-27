package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.StudyMapper;
import com.zlfinfo.mapper.UserStudyMapper;
import com.zlfinfo.model.Study;
import com.zlfinfo.model.UserStudy;
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
    @Autowired
    private UserStudyMapper userStudyMapper;
    @Override
    public int insert(Study study) {
        Integer num = studyMapper.insert(study);
        if(num==1){
            return study.getStdId();
        }else{
            return 0;
        }
    }
    @Override
    public int insertUserStudy(UserStudy userStudy) {
         return userStudyMapper.insert(userStudy);
    }
    @Override
    public List<Study> selectStudyByTypeNUser(Integer type, String username) {
        return studyMapper.selectStudyByTypeNUser(type, username);
    }
}
