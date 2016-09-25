package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.AnswerComment;
import com.zlfinfo.service.AnswerCommentService;
import com.zlfinfo.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/9/25.
 */
@Controller
public class AnswerCommentController extends BaseController {

    @Autowired
    private AnswerCommentService answerCommentService;
    @Autowired
    private AnswerService answerService;

    @RequestMapping(value = "/anscomm/{ansId}", method = RequestMethod.GET)
    @ResponseBody
    public Object showAllAnsComm(@PathVariable Integer ansId, HttpServletResponse httpServletResponse) {
        List<AnswerComment> answerCommentList = answerCommentService.selectAnswerComments(ansId);

        return null != answerCommentList ? renderSuccess(answerCommentList, httpServletResponse) : renderError
                ("问答评论加载失败！", httpServletResponse);
    }


    @RequestMapping(value = "/anscomm/like", method = RequestMethod.GET)
    @ResponseBody
    public Object likeAnsComm(@RequestParam Integer ansCommId, HttpServletResponse httpServletResponse) {
        int i = answerCommentService.likeAnsComm(ansCommId);

        return i > 0 ? renderSuccess("点赞成功!", httpServletResponse) : renderError("点赞失败!", httpServletResponse);
    }
}
