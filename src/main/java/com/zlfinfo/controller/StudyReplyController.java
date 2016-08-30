package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.StudyReply;
import com.zlfinfo.service.StudyReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
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

    /**
     * 学习帖子留言
     *
     * @return
     */
    @RequestMapping(value = "/addreply", method = RequestMethod.POST)
    @ResponseBody
    public Object addStudyReply(@RequestParam String username, @RequestParam Integer stdId, @RequestParam String
            stdReContent, HttpServletResponse httpServletResponse) {
        StudyReply studyReply = new StudyReply(stdId, username, stdReContent, new Date(), 0);
        System.out.println(studyReply);
        int i = studyReplyService.insertStudyReply(studyReply);

        return i == 0 ? renderSuccess("新增回复成功!", httpServletResponse) : renderError("新增回复失败!", httpServletResponse);
    }
}
