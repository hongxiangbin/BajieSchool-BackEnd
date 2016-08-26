package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Question;
import com.zlfinfo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
@Controller
public class QuestionController extends BaseController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/quora/{username}/{flag}", method = RequestMethod.GET)
    @ResponseBody
    public Object showUserQuora(@PathVariable String username, @PathVariable int flag, HttpServletResponse
            httpServletResponse) {
        List<Question> questionList = questionService.selectQuestionByUser(username, flag);
        return null != questionList ? renderSuccess(questionList, httpServletResponse) : renderError("问题列表查询失败",
                httpServletResponse);
    }


    @RequestMapping(value = "/quora/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Object showUserQuora(@PathVariable String username, HttpServletResponse
            httpServletResponse) {
        List<Question> questionList = questionService.selectUserAllQuora(username);
        return null != questionList ? renderSuccess(questionList, httpServletResponse) : renderError("问题列表查询失败",
                httpServletResponse);
    }

    @RequestMapping(value = "/quora/ask", method = RequestMethod.POST)
    @ResponseBody
    public Object ask(@RequestParam String queTitle, @RequestParam String queTags, @RequestParam String queContent,
                      @RequestParam String queImg, @RequestParam String username, HttpServletResponse
                              httpServletResponse) {
        Question question = new Question(queTitle, queContent, queImg, queImg, new Date());
        return 0 != questionService.addQuestion(question, username) ? renderSuccess("提问成功！", httpServletResponse) :
                renderError("提问失败！", httpServletResponse);

    }

}
