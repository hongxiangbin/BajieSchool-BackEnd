package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.University;
import com.zlfinfo.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/8/22.
 */
@Controller
public class UniversityController extends BaseController {

    @Autowired
    private UniversityService universityService;

    @RequestMapping(value = "/university", method = RequestMethod.GET)
    @ResponseBody
    public Object showAllUniversity(HttpServletResponse httpServletResponse) {
        List<University> universityList = universityService.selectAllUniversity();
        if (null != universityList && universityList.size() > 0) {
            return renderSuccess(universityList, httpServletResponse);
        } else {
            return renderError("学校列表获取失败", httpServletResponse);
        }
    }

}
