package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.StudyTypeMapper;
import com.zlfinfo.model.StudyType;
import com.zlfinfo.service.StudyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
@Service
public class StudyTypeServiceImpl implements StudyTypeService {
    @Autowired
    private StudyTypeMapper studyTypeMapper;

    @Override
    public List<StudyType> selectStudyTypesByUsername(String username) {
        return studyTypeMapper.selectStudyTypesByUsername(username);
    }

    @Override
    public List<StudyType> selectUnchosenStudyTypes(String username) {
        return studyTypeMapper.selectUnchosenStudyTypes(username);
    }

    @Override
    public List<StudyType> selectAllStudyTypes() {
        return studyTypeMapper.selectAllStudyTypes();
    }
}
