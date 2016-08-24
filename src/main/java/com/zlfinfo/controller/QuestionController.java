package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Question;
import com.zlfinfo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
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

}
