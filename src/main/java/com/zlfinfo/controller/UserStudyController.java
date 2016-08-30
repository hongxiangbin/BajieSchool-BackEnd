package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.UserStudy;
import com.zlfinfo.service.UserStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/8/30.
 */
@Controller
public class UserStudyController extends BaseController {

    @Autowired
    private UserStudyService userStudyService;

    @RequestMapping(value = "/addus", method = RequestMethod.POST)
    @ResponseBody
    public Object addUserStudy(@RequestParam Integer stdId, @RequestParam String username, @RequestParam Integer
            flag, HttpServletResponse httpServletResponse) {
        UserStudy userStudy = new UserStudy();
        userStudy.setStdId(stdId);
        userStudy.setUsername(username);
        userStudy.setFlag(flag);

        logger.debug(userStudy + "=========================");
        int i = userStudyService.insertUserStudy(userStudy);

        return i == 0 ? renderSuccess("UserStudy新增成功！", httpServletResponse) : renderError("UserStudy新增失败！",
                httpServletResponse);
    }

}
