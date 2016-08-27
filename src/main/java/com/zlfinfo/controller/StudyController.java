package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Study;
import com.zlfinfo.model.UserStudy;
import com.zlfinfo.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/8/25.
 */
@Controller
public class StudyController extends BaseController {
    @Autowired
    private StudyService studyService;

    @RequestMapping(value = "/study/{type}", method = RequestMethod.POST)
    @ResponseBody
    public Object showStudyByType(@PathVariable Integer type, String username, HttpServletResponse
            httpServletResponse) {
        List<Study> studyList = studyService.selectStudyByTypeNUser(type, username);
        return null != studyList ? renderSuccess(studyList, httpServletResponse) : renderError("学习列表查询失败",
                httpServletResponse);
    }
    @RequestMapping(value = "/addstuqu", method = RequestMethod.POST)
    @ResponseBody
    public Object addstuqu(@RequestParam(required = false) Integer stdId, @RequestParam(required = false) String stdTitle,
                           @RequestParam Integer typeId, @RequestParam(required = false) String stdContent, @RequestParam String username, HttpServletResponse response) {
        Study study = new Study(stdId, typeId, stdTitle, stdContent,new Date());
        Integer stuid = studyService.insert(study);
        if (stuid == 0) {
            return renderError("保存失败", response);
        } else {
            UserStudy userStudy = new UserStudy();
            userStudy.setStdId(stuid);
            userStudy.setUsername(username);
            userStudy.setFlag(0);
            studyService.insertUserStudy(userStudy);
            return renderSuccess("保存成功", response);
        }
    }
}
