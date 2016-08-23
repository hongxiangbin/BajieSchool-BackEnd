package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Feedback;
import com.zlfinfo.service.FeedbackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/23.
 */
@Controller
public class FeedbackController extends BaseController {

    @Autowired
    private FeedbackService feedbackService;

    private static Logger logger = LoggerFactory.getLogger(FeedbackController.class);

    @RequestMapping(value = "/feedback", method = RequestMethod.POST)
    @ResponseBody
    public Object sendFeedback(@RequestParam String username, @RequestParam String content, @RequestParam(required = false) String qq,
                               @RequestParam(required = false) String wechat, @RequestParam(required = false) String email, HttpServletResponse
                                       httpServletResponse) {

        Feedback feedback = new Feedback(username, content, new Date(), qq, wechat, email, "", "");
        int i = feedbackService.sendFeedback(feedback);
        return i > 0 ? renderSuccess("反馈提交成功!", httpServletResponse) : renderError("反馈提交失败!", httpServletResponse);
    }

}
