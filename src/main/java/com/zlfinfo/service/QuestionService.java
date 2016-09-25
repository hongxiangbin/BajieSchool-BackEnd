package com.zlfinfo.service;

import com.zlfinfo.model.Question;
import com.zlfinfo.model.UserQuestion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface QuestionService {

    List<Question> selectQuestionByUser(String username, Integer flag);

    List<Question> selectUserAllQuora(String username);

    int addQuestion(Question question);

    int addUserque(UserQuestion userQuestion);

    Question selectByPrimaryKey(Integer queId);

    int updateByPrimaryKeySelective(Question record);

    int addCommNum(@Param("queId") Integer queId);
}
