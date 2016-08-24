package com.zlfinfo.mapper;

import com.zlfinfo.model.Visitor;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface VisitorMapper {

    int insertVisitor(Visitor visitor);

    List<Visitor> selectAllVisitor(@Param("username") String username, @Param("startdate") Date startdate, @Param("enddate") Date enddate);
}
