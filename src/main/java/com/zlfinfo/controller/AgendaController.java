package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Agenda;
import com.zlfinfo.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
@Controller
public class AgendaController extends BaseController {

    @Autowired
    private AgendaService agendaService;

    @RequestMapping(value = "/agenda/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Object showAllAgenda(@PathVariable String username, HttpServletResponse httpServletResponse) {
        List<Agenda> agendaList = agendaService.selectAgendaByUsername(username);
        return null != agendaList ? renderSuccess(agendaList, httpServletResponse) : renderError("日程查询失败",
                httpServletResponse);
    }


}
