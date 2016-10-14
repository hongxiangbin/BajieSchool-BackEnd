package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.commons.constant.PointsAddNumber;
import com.zlfinfo.model.Answer;
import com.zlfinfo.model.Points;
import com.zlfinfo.service.AnswerService;
import com.zlfinfo.service.PointsService;
import com.zlfinfo.service.QuestionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/9/10.
 */
@Controller
public class AnswerController extends BaseController {

    @Autowired
    private AnswerService answerService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private PointsService pointsService;

    @RequestMapping(value = "/answer/{queId}", method = RequestMethod.GET)
    @ResponseBody
    public Object showAnswers(@PathVariable Integer queId, HttpServletResponse httpServletResponse) {
        List<Answer> answerList = answerService.selectAnswer(queId);
        return null != answerList ? renderSuccess(answerList, httpServletResponse) : renderError("答案查询失败",
                httpServletResponse);
    }

    @RequestMapping(value = "/answer/add", method = RequestMethod.POST)
    @ResponseBody
    public Object answer(@Param("queId") Integer queId, @Param("username") String username, @Param("ansContent")
            String ansContent, HttpServletResponse httpServletResponse) {
        Answer answer = new Answer();
        answer.setQueId(queId);
        answer.setUsername(username);
        answer.setAnsContent(ansContent);
        answer.setAnsLike(0);
        answer.setAnsTime(new Date());
        answer.setAnsComment(0);

        int i = answerService.insertAnswer(answer);
        int j = questionService.addCommNum(queId);
        pointsService.updatePoints(new Points(username, pointsService.selectPoint(username) + PointsAddNumber.POINT_ANSWER_QUESTION, "回答问题+5"));

        return i > 0 && j > 0 ? renderSuccess("回答成功!", httpServletResponse) : renderError("回答失败!", httpServletResponse);
    }

}
