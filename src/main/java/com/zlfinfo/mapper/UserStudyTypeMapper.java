package com.zlfinfo.mapper;

import com.zlfinfo.model.UserStudyType;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface UserStudyTypeMapper {

    List<UserStudyType> selectAllUserStudyType(String username);


}