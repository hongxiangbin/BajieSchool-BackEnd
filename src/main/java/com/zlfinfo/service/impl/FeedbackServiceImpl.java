package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.FeedbackMapper;
import com.zlfinfo.model.Feedback;
import com.zlfinfo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/23.
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackMapper feedbackMapper;


    @Override
    public int sendFeedback(Feedback feedback) {
        return feedbackMapper.insertFeedback(feedback);
    }
}
