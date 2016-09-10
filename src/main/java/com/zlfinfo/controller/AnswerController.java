package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Answer;
import com.zlfinfo.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/9/10.
 */
@Controller
public class AnswerController extends BaseController {

    @Autowired
    private AnswerService answerService;

    @RequestMapping(value = "/answer/{queId}", method = RequestMethod.GET)
    @ResponseBody
    public Object showAnswers(@PathVariable Integer queId, HttpServletResponse httpServletResponse) {
        List<Answer> answerList = answerService.selectAnswer(queId);
        return null != answerList ? renderSuccess(answerList, httpServletResponse) : renderError("答案查询失败",
                httpServletResponse);
    }

}
