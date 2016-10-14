package com.zlfinfo.mapper;

import com.zlfinfo.model.Points;

public interface PointsMapper {

    Integer selectPoints(String username);

    Integer updatePoints(Points points);

    int insert(Points record);

    int insertSelective(Points record);
}