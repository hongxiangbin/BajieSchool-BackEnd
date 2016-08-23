package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.AccusationMapper;
import com.zlfinfo.model.Accusation;
import com.zlfinfo.service.AccusationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/23.
 */
@Service
public class AccusationServiceImpl implements AccusationService {

    @Autowired
    private AccusationMapper accusationMapper;

    @Override
    public int against(Accusation accusation) {
        return accusationMapper.insertAccusation(accusation);
    }
}
