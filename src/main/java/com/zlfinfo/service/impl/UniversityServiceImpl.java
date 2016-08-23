package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.UniversityMapper;
import com.zlfinfo.model.University;
import com.zlfinfo.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/22.
 */
@Service
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityMapper universityMapper;

    @Override
    public List<University> selectAllUniversity() {
        return universityMapper.selectAllUniversity();
    }

    @Override
    public University selectUniversity() {
        return universityMapper.selectUniversity();
    }
}
