package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.QuestionMapper;
import com.zlfinfo.model.Question;
import com.zlfinfo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<Question> selectQuestionByUser(String username, int flag) {
        return questionMapper.selectQuestionByUser(username, flag);
    }

    @Override
    public List<Question> selectUserAllQuora(String username) {
        return questionMapper.selectUserAllQuora(username);
    }
}
