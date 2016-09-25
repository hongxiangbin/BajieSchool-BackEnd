package com.zlfinfo.service;

import com.zlfinfo.model.AnswerComment;

import java.util.List;

/**
 * Created by Administrator on 2016/9/25.
 */
public interface AnswerCommentService {

    List<AnswerComment> selectAnswerComments(Integer ansId);

    int likeAnsComm(Integer ansCommId);
}
