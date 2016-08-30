package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.StudyReply;
import com.zlfinfo.service.StudyReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/8/29.
 */
@Controller
public class StudyReplyController extends BaseController {

    @Autowired
    private StudyReplyService studyReplyService;

    @RequestMapping(value = "/study/replys", method = RequestMethod.GET)
    @ResponseBody
    public Object showAllReply(HttpServletResponse httpServletResponse) {
        List<StudyReply> studyReplyList = studyReplyService.selectAllStudyReply();

        return null != studyReplyList ? renderSuccess(studyReplyList, httpServletResponse) : renderError("回答列表加载失败",
                httpServletResponse);
    }

    @RequestMapping(value = "/study/replys", method = RequestMethod.POST)
    @ResponseBody
    public Object showReplyByStudy(@RequestParam Integer stdId, @RequestParam String username, HttpServletResponse
            httpServletResponse) {
        List<StudyReply> studyReplyList = studyReplyService.selectStudyReplyByStudy(stdId, username);

        return null != studyReplyList ? renderSuccess(studyReplyList, httpServletResponse) : renderError("回答列表加载失败",
                httpServletResponse);
    }
}
