package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.AgendaMapper;
import com.zlfinfo.model.Agenda;
import com.zlfinfo.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    private AgendaMapper agendaMapper;

    @Override
    public List<Agenda> selectAgendaByUsername(String username) {
        return agendaMapper.selectAgendaByUsername(username);
    }
}
