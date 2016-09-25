package com.zlfinfo.mapper;

import com.zlfinfo.model.AnswerComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnswerCommentMapper {
    int insert(AnswerComment record);

    int insertSelective(AnswerComment record);

    List<AnswerComment> selectByPrimaryKey(@Param("ansId") Integer ansId);

    int updateByPrimaryKeySelective(AnswerComment record);

    int updateByPrimaryKey(AnswerComment record);

    int addLikeNum(@Param("ansCommId") Integer ansCommId);
}