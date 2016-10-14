package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.PointsMapper;
import com.zlfinfo.model.Points;
import com.zlfinfo.service.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 29140 on 2016/10/14.
 */
@Service
public class PointsServiceImpl implements PointsService {

    @Autowired
    private PointsMapper pointsMapper;

    @Override
    public Integer selectPoint(String username) {
        return pointsMapper.selectPoints(username);
    }

    @Override
    public Integer updatePoints(Points points) {
        return pointsMapper.updatePoints(points);
    }

    @Override
    public int insertPoints(Points points) {
        return pointsMapper.insertSelective(points);
    }
}
