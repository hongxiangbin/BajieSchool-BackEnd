package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.UserQuestionMapper;
import com.zlfinfo.model.UserQuestion;
import com.zlfinfo.service.UserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/27.
 */
@Service
public class UserQuestionServiceImpl implements UserQuestionService {

    @Autowired
    private UserQuestionMapper userQuestionMapper;

    @Override
    public int insertUserQuestion(UserQuestion question) {
        return userQuestionMapper.insertUserQuestion(question);
    }
}
