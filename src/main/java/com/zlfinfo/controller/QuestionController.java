package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Question;
import com.zlfinfo.model.UserQuestion;
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
    public Object ask(@RequestParam(required = false)  Integer queId,@RequestParam(required = false)  String queTitle, @RequestParam(required = false)  String queTags, @RequestParam(required = false)  String queContent,
                      @RequestParam(required = false)  String queImg, @RequestParam String username, HttpServletResponse
                              httpServletResponse) {
        Question question = new Question(queId,queTitle,queTags, queContent, queImg, new Date());
        Integer qid=questionService.addQuestion(question);
        String msg="提问成功！";
        Integer status =0;
        if(qid==0){
            msg="提问失败！";
            status = 1;
        }else{
            UserQuestion userQuestion = new UserQuestion();
            userQuestion.setUsername(username);
            userQuestion.setQueId(qid);
            userQuestion.setFlag(0);
            questionService.addUserque(userQuestion);
        }
        return render(msg,status, httpServletResponse);
    }
    @RequestMapping(value = "/quora/updlike", method = RequestMethod.POST)
    @ResponseBody
    public Object updlike(@RequestParam Integer id, HttpServletResponse
            httpServletResponse) {
        System.out.println(id);
        Question question = new Question();
        if(id!=null){
            question = questionService.selectByPrimaryKey(id);
        }
        if(null!=question){
            question.setQueId(id);
            question.setQueLike(question.getQueLike()+1);
            questionService.updateByPrimaryKeySelective(question);
            return renderSuccess("更新成功", httpServletResponse);
        }else{
            return renderError("更新失败", httpServletResponse);
        }
    }
}
