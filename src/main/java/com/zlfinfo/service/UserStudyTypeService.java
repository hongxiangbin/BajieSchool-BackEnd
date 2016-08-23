package com.zlfinfo.service;

import com.zlfinfo.model.UserStudyType;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface UserStudyTypeService {

    List<UserStudyType> selectAllUserStudyType(String username);

}