package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.UserQuestion;
import com.zlfinfo.service.UserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/8/27.
 */
@Controller
public class UserQuestionController extends BaseController {

    @Autowired
    private UserQuestionService userQuestionService;

    @RequestMapping(value = "/userque/add", method = RequestMethod.POST)
    @ResponseBody
    public Object addUserQue(UserQuestion userQuestion, HttpServletResponse httpServletResponse) {

        return null;
    }
}
