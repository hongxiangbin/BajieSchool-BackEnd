package com.zlfinfo.mapper;

import com.zlfinfo.model.Answer;
import org.apache.ibatis.annotations.Param;

public interface AnswerMapper {
    int deleteByPrimaryKey(@Param("ansId") Integer ansId, @Param("queId") Integer queId, @Param("username") String username);

    int insert(Answer record);

    int insertSelective(Answer record);

    Answer selectByPrimaryKey(@Param("ansId") Integer ansId, @Param("queId") Integer queId, @Param("username") String username);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKey(Answer record);
}