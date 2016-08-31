package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.ActivityComment;
import com.zlfinfo.service.ActivityCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/8/31.
 */
@Controller
public class ActivityCommentController extends BaseController {

    @Autowired
    private ActivityCommentService activityCommentService;

    @RequestMapping(value = "/actcom", method = RequestMethod.POST)
    @ResponseBody
    public Object showActCom(@RequestParam Integer actId, @RequestParam String username, HttpServletResponse
            httpServletResponse) {
        List<ActivityComment> activityCommentList = activityCommentService.selectActComByActId(actId, username);

        return null != activityCommentList ? renderSuccess(activityCommentList, httpServletResponse) : renderError
                ("活动评论加载失败...", httpServletResponse);
    }



}
