package com.zlfinfo.service;

import com.zlfinfo.model.Question;

import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface QuestionService {

    List<Question> selectQuestionByUser(String username, int flag);

    List<Question> selectUserAllQuora(String username);
}
