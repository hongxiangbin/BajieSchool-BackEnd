package com.zlfinfo.service;

import com.zlfinfo.model.Answer;

import java.util.List;

/**
 * Created by Administrator on 2016/9/10.
 */
public interface AnswerService {

    List<Answer> selectAnswer(Integer queId);
}
