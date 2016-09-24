package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.ActivityComment;
import com.zlfinfo.service.ActivityCommentService;
import com.zlfinfo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/8/31.
 */
@Controller
public class ActivityCommentController extends BaseController {

    @Autowired
    private ActivityCommentService activityCommentService;

    @Autowired
    private ActivityService activityService;

    @RequestMapping(value = "/actcom", method = RequestMethod.POST)
    @ResponseBody
    public Object showActCom(@RequestParam Integer actId, @RequestParam String username, HttpServletResponse
            httpServletResponse) {
        List<ActivityComment> activityCommentList = activityCommentService.selectActComByActId(actId, username);

        return null != activityCommentList ? renderSuccess(activityCommentList, httpServletResponse) : renderError
                ("活动评论加载失败...", httpServletResponse);
    }

    @RequestMapping(value = "/actcom/like", method = RequestMethod.GET)
    @ResponseBody
    public Object addLike(HttpServletResponse httpServletResponse) {
        int i = activityCommentService.updateLike();
        return i > 0 ? renderSuccess("活动评论点赞成功!", httpServletResponse) : renderError("活动评论点赞失败!", httpServletResponse);
    }

    @RequestMapping(value = "/actcom/add", method = RequestMethod.POST)
    @ResponseBody
    public Object addComment(@RequestParam Integer actId, @RequestParam String username, @RequestParam String
            actComContent, HttpServletResponse httpServletResponse) {
        ActivityComment activityComment = new ActivityComment(actId, username, actComContent, new Date(), 0);
        int i = activityCommentService.insertSelective(activityComment);
        int j = activityService.addCommentNum(activityComment.getActId());

        return i > 0 && j > 0 ? renderSuccess("评论添加成功！", httpServletResponse) : renderError("评论添加失败!",
                httpServletResponse);
    }

}
