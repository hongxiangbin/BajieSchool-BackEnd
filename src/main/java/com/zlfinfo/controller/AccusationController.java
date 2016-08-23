package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Accusation;
import com.zlfinfo.model.Feedback;
import com.zlfinfo.service.AccusationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/23.
 */
@Controller
public class AccusationController extends BaseController {

    @Autowired
    private AccusationService accusationService;

    @RequestMapping(value = "/against", method = RequestMethod.POST)
    @ResponseBody
    public Object sendFeedback(@RequestParam String informant, @RequestParam String against, @RequestParam String
            content, HttpServletResponse httpServletResponse) {
        Accusation accusation = new Accusation(informant, against, content, new Date());
        int i = accusationService.against(accusation);
        return i > 0 ? renderSuccess("举报提交成功!", httpServletResponse) : renderError("举报提交失败!", httpServletResponse);
    }
}
