package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Visitor;
import com.zlfinfo.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
@Controller
public class VisitorController extends BaseController {

    @Autowired
    private VisitorService visitorService;

    @RequestMapping(value = "/visitor/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Object showAllVisitors(@PathVariable String username, HttpServletResponse httpServletResponse) {
        long DAY_IN_MS = 1000 * 60 * 60 * 24;
        Date enddate = new Date();
        Date startdate = new Date(System.currentTimeMillis() - (7 * DAY_IN_MS));
        logger.debug("StartDate : " + startdate + "; EndDate : " + enddate);

        List<Visitor> visitorList = visitorService.selectVisitors(username, startdate, enddate);
        return null != visitorList ? renderSuccess(visitorList, httpServletResponse) : renderError("访客查询失败",
                httpServletResponse);
    }

}
