package com.zlfinfo.service;

import com.zlfinfo.model.Agenda;

import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface AgendaService {

    List<Agenda> selectAgendaByUsername(String username);

    Integer updateAgendaShow(Integer agId, String username);

    int insertAgenda(Agenda agenda);
}
