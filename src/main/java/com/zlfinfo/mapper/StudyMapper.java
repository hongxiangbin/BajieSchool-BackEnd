package com.zlfinfo.mapper;

import com.zlfinfo.model.Study;

public interface StudyMapper {
    int deleteByPrimaryKey(String stdId);

    int insert(Study record);

    int insertSelective(Study record);

    Study selectByPrimaryKey(String stdId);

    int updateByPrimaryKeySelective(Study record);

    int updateByPrimaryKey(Study record);
}