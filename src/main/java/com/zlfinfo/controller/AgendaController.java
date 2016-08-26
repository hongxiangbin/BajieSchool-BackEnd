package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Agenda;
import com.zlfinfo.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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


    @RequestMapping(value = "/agenda/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteAgenda(@RequestParam Integer agId, @RequestParam String username, HttpServletResponse
            httpServletResponse) {
        Integer number = agendaService.updateAgendaShow(agId, username);
        return null != number ? renderSuccess(number, httpServletResponse) : renderError("日程删除失败", httpServletResponse);
    }

    @RequestMapping(value = "/agenda/add", method = RequestMethod.POST)
    @ResponseBody
    public Object addAgenda(@RequestParam String username, @RequestParam String agTitle, @RequestParam String agDate,
                            @RequestParam String agRemark, @RequestParam String agRemind, HttpServletResponse
                                    httpServletResponse) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date startDate = (Date) formatter.parse(agDate);
        Date ringDate = (Date) formatter.parse(agRemind);
        Agenda agenda = new Agenda(username, agTitle, agRemark, startDate, ringDate);
        logger.debug(agenda + "===================================");
        int num = agendaService.insertAgenda(agenda);
        return num > 0 ? renderSuccess("日程新增成功!", httpServletResponse) : renderError("日程新增失败！", httpServletResponse);
    }
}