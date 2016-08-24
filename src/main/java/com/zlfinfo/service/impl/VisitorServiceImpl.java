package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.VisitorMapper;
import com.zlfinfo.model.Visitor;
import com.zlfinfo.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
@Service
public class VisitorServiceImpl implements VisitorService {
    @Autowired
    private VisitorMapper visitorMapper;

    @Override
    public int addVisit(Visitor visitor) {
        return visitorMapper.insertVisitor(visitor);
    }

    @Override
    public List<Visitor> selectVisitors(String username, Date startdate, Date enddate) {
        return visitorMapper.selectAllVisitor(username, startdate, enddate);
    }
}
