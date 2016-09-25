package com.zlfinfo.mapper;

import com.zlfinfo.model.Answer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnswerMapper {
    int insert(Answer record);

    int insertSelective(Answer record);

    List<Answer> selectAnswer(Integer queId);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKey(Answer record);

    int addCommentNum(Integer ansId);
}