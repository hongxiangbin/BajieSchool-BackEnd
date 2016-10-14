package com.zlfinfo.service;

import com.zlfinfo.model.Points;

/**
 * Created by 29140 on 2016/10/14.
 */
public interface PointsService {

    Integer selectPoint(String username);

    Integer updatePoints(Points points);

    int insertPoints(Points points);
}
