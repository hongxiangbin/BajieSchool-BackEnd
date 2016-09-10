package com.zlfinfo.mapper;

import com.zlfinfo.model.AnswerComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/9/10.
 */
public interface AnswerCommentMapper {

    List<AnswerComment> selectAnswerComment();
}
