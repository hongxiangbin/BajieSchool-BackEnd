package com.zlfinfo.mapper;

import com.zlfinfo.model.UserQuestion;

public interface UserQuestionMapper {
    int insert(UserQuestion record);

    int insertSelective(UserQuestion record);
}