package com.zlfinfo.service;

import com.zlfinfo.model.Visitor;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface VisitorService {

    int addVisit(Visitor visitor);

    List<Visitor> selectVisitors(String username, Date startdate, Date enddate);

}
