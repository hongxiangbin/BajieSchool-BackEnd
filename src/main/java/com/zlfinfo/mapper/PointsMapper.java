package com.zlfinfo.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2016/8/26.
 */
public interface PointsMapper {

    Integer selectPoints(@Param("username") String username);
}
