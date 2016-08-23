package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.StudyType;
import com.zlfinfo.service.StudyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
@Controller
public class StudyTypeController extends BaseController {

    @Autowired
    private StudyTypeService studyTypeService;

    @RequestMapping(value = "/studytype/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Object showUserStudyType(@PathVariable String username, HttpServletResponse httpServletResponse) {
        List<StudyType> studyTypeList = studyTypeService.selectStudyTypesByUsername(username);
        if (null != studyTypeList) {
            return renderSuccess(studyTypeList, httpServletResponse);
        } else {
            return renderError("用户学习TAB返回失败", httpServletResponse);
        }

    }

    @RequestMapping(value = "/studyalltype", method = RequestMethod.GET)
    @ResponseBody
    public Object showAllType(HttpServletResponse httpServletResponse) {
        List<StudyType> studyTypeList = studyTypeService.selectAllStudyTypes();
        if (null != studyTypeList) {
            return renderSuccess(studyTypeList, httpServletResponse);
        } else {
            return renderError("学习模块返回失败", httpServletResponse);
        }

    }


    @RequestMapping(value = "/unchosentypes/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Object showUserUnStudyType(@PathVariable String username, HttpServletResponse httpServletResponse) {
        List<StudyType> studyTypeList = studyTypeService.selectUnchosenStudyTypes(username);
        if (null != studyTypeList) {
            return renderSuccess(studyTypeList, httpServletResponse);
        } else {
            return renderError("用户学习TAB返回失败", httpServletResponse);
        }

    }

}
