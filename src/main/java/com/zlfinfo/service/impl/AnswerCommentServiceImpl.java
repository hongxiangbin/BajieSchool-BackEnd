package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.AnswerCommentMapper;
import com.zlfinfo.model.AnswerComment;
import com.zlfinfo.service.AnswerCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/25.
 */
@Service
public class AnswerCommentServiceImpl implements AnswerCommentService {

    @Autowired
    private AnswerCommentMapper answerCommentMapper;

    @Override
    public List<AnswerComment> selectAnswerComments(Integer ansId) {
        return answerCommentMapper.selectByPrimaryKey(ansId);
    }

    @Override
    public int likeAnsComm(Integer ansCommId) {
        return answerCommentMapper.addLikeNum(ansCommId);
    }
}
