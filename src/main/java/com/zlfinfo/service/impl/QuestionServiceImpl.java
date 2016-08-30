package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.QuestionMapper;
import com.zlfinfo.mapper.UserQuestionMapper;
import com.zlfinfo.model.Question;
import com.zlfinfo.model.UserQuestion;
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
    @Autowired
    private UserQuestionMapper userQuestionMapper;
    @Override
    public List<Question> selectQuestionByUser(String username, Integer flag) {
        return questionMapper.selectQuestionByUser(username, flag);
    }

    @Override
    public List<Question> selectUserAllQuora(String username) {
        return questionMapper.selectUserAllQuora(username);
    }

    @Override
    public int addQuestion(Question question) {
         Integer num = questionMapper.insert(question);
        if(num==1){
            System.out.println(question.getQueId());
            return question.getQueId();
        }else{
            return 0;
        }
    }
    @Override
    public int addUserque(UserQuestion userQuestion) {
        userQuestionMapper.insert(userQuestion);
        return 0;
    }
    @Override
    public int updateByPrimaryKeySelective(Question que) {
        return questionMapper.updateByPrimaryKeySelective(que);
    }
    @Override
    public Question selectByPrimaryKey(Integer queId) {
        return questionMapper.selectByPrimaryKey(queId);
    }
}
