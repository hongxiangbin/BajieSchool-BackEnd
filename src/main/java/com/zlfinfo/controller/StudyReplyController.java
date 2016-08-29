package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.StudyReply;
import com.zlfinfo.service.StudyReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/study/replys/{stdId}", method = RequestMethod.GET)
    @ResponseBody
    public Object showReplyByStudy(@PathVariable Integer stdId, HttpServletResponse httpServletResponse) {
        List<StudyReply> studyReplyList = studyReplyService.selectStudyReplyByStudy(stdId);

        return null != studyReplyList ? renderSuccess(studyReplyList, httpServletResponse) : renderError("回答列表加载失败",
                httpServletResponse);
    }
}
