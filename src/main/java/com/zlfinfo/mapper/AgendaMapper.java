package com.zlfinfo.mapper;

import com.zlfinfo.model.Agenda;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgendaMapper {

    int insertAgenda(Agenda record);

    Agenda selectByPrimaryKey(@Param("agId") Integer agId, @Param("username") String username);

    int updateByPrimaryKey(Agenda record);

    List<Agenda> selectAgendaByUsername(String username);

    Integer updateAgendaShow(@Param("agId") Integer agId, @Param("username") String username);
}