package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.UserStudyType;
import com.zlfinfo.service.UserStudyTypeService;
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
public class UserStudyTypeController extends BaseController {

    @Autowired
    private UserStudyTypeService userStudyTypeService;

    @RequestMapping(value = "/stutype/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Object showStudyTypes(@PathVariable String username, HttpServletResponse httpServletResponse) {
        List<UserStudyType> userStudyTypeList = userStudyTypeService.selectAllUserStudyType(username);
        if (null != userStudyTypeList) {
            if (userStudyTypeList.size() > 0) {
                return renderSuccess(userStudyTypeList, httpServletResponse);
            } else {
                return renderError("类型为空", httpServletResponse);
            }
        } else {
            return renderError("学习类型获取失败", httpServletResponse);
        }

    }

}
