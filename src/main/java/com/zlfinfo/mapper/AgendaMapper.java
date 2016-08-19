package com.zlfinfo.mapper;

import com.zlfinfo.model.Agenda;
import org.apache.ibatis.annotations.Param;

public interface AgendaMapper {
    int deleteByPrimaryKey(@Param("agId") String agId, @Param("username") String username);

    int insert(Agenda record);

    int insertSelective(Agenda record);

    Agenda selectByPrimaryKey(@Param("agId") String agId, @Param("username") String username);

    int updateByPrimaryKeySelective(Agenda record);

    int updateByPrimaryKey(Agenda record);
}