package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.AnswerMapper;
import com.zlfinfo.model.Answer;
import com.zlfinfo.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/10.
 */
@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public List<Answer> selectAnswer(Integer queId) {
        return answerMapper.selectAnswer(queId);
    }
}
