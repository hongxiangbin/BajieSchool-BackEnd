package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.PointsMapper;
import com.zlfinfo.service.PointsService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/26.
 */
@Service
public class PointsServiceImpl implements PointsService {

    private PointsMapper pointsMapper;

    @Override
    public Integer selectPoints(String username) {
        return pointsMapper.selectPoints(username);
    }
}
