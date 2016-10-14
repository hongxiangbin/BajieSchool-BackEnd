package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Points;
import com.zlfinfo.model.Study;
import com.zlfinfo.service.PointsService;
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
    @Autowired
    private PointsService pointsService;

    @RequestMapping(value = "/study/{type}", method = RequestMethod.POST)
    @ResponseBody
    public Object showStudyByType(@PathVariable Integer type, String username, HttpServletResponse
            httpServletResponse) {
        List<Study> studyList = studyService.selectStudyByTypeNUser(type, username);
        return null != studyList ? renderSuccess(studyList, httpServletResponse) : renderError("学习列表查询失败",
                httpServletResponse);
    }

    @RequestMapping(value = "/study/addstuqu", method = RequestMethod.POST)
    @ResponseBody
    public Object addNewStudy(@RequestParam Integer typeId, @RequestParam String
            stdTitle, @RequestParam String stdContent, HttpServletResponse httpServletResponse) {
        Study study = new Study();
        study.setTypeId(typeId);
        study.setStdTitle(stdTitle);
        study.setStdContent(stdContent);
        study.setStdLike(0);
        study.setStdComment(0);
        study.setStdTime(new Date());
//        pointsService.updatePoints(new Points(u))

        return 0 != studyService.insert(study) ? renderSuccess("学习问题发表成功!", httpServletResponse) : renderError
                ("学习问题发表失败!", httpServletResponse);
    }
    @RequestMapping(value = "/study/updlike", method = RequestMethod.POST)
    @ResponseBody
    public Object updlike(@RequestParam Integer id, HttpServletResponse
            httpServletResponse) {
        Study study = new Study();
        if(id!=null){
            study = studyService.selectByPrimaryKey(id);
        }
        if(null!=study){
            study.setStdId(id);
            study.setStdLike(study.getStdLike()+1);
            studyService.updateByPrimaryKeySelective(study);
            return renderSuccess("更新成功", httpServletResponse);
        }else{
            return renderError("更新失败", httpServletResponse);
        }
    }
}
