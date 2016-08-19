package com.zlfinfo.mapper;

import com.zlfinfo.model.Question;

public interface QuestionMapper {
    int deleteByPrimaryKey(String queId);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(String queId);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}