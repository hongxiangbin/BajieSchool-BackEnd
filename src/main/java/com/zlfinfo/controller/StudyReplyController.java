package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.StudyReply;
import com.zlfinfo.service.StudyReplyService;
import com.zlfinfo.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @Autowired
    private StudyService studyService;

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

        int j = studyService.addCommentNum(studyReply.getStdId());

        return i > 0 && j > 0 ? renderSuccess("新增回复成功!", httpServletResponse) : renderError("新增回复失败!",
                httpServletResponse);
    }

    @RequestMapping(value = "/stdreply/like", method = RequestMethod.GET)
    @ResponseBody
    public Object likeStdReply(@RequestParam Integer stdReId, HttpServletResponse httpServletResponse) {
        int i = studyReplyService.addLikeNum(stdReId);

        return i > 0 ? renderSuccess("点赞成功!", httpServletResponse) : renderError("点赞失败!", httpServletResponse);
    }
}