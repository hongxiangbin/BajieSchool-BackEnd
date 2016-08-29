package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.UserStudyTypeMapper;
import com.zlfinfo.model.UserStudyType;
import com.zlfinfo.service.UserStudyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
@Service
public class UserStudyTypeServiceImpl implements UserStudyTypeService {

    @Autowired
    private UserStudyTypeMapper userStudyTypeMapper;


    @Override
    public List<UserStudyType> selectAllUserStudyType(String username) {
        return userStudyTypeMapper.selectAllUserStudyType(username);
    }
    @Override
    public int insertBatch(List<UserStudyType> ustlist,String username) {
        userStudyTypeMapper.deletebyUsername(username);
        userStudyTypeMapper.insertBatch(ustlist);
        return 0;
    }
}
