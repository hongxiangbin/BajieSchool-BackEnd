package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.service.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/8/26.
 */
@Controller
public class PointsController extends BaseController {

    @Autowired
    private PointsService pointsService;

    @RequestMapping(value = "/points", method = RequestMethod.POST)
    @ResponseBody
    public Object showPoints(@RequestParam String username, HttpServletResponse httpServletResponse) {
        Integer points = pointsService.selectPoints(username);
        return null != points ? renderSuccess(points, httpServletResponse) : renderError("积分查询失败", httpServletResponse);
    }

}
