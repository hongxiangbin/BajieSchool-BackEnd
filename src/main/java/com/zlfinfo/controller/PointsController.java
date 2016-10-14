package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.service.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/8/26.
 */
@Controller
public class PointsController extends BaseController {

    @Autowired
    private PointsService pointsService;

    @RequestMapping(value = "/points/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Object showPoints(@PathVariable String username, HttpServletResponse httpServletResponse) {
        Integer integer = pointsService.selectPoint(username);

        return null != integer ? renderSuccess(integer, httpServletResponse) : renderError("积分查询失败!", httpServletResponse);
    }

}
