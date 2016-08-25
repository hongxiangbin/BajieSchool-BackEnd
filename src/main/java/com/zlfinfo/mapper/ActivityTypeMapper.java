package com.zlfinfo.mapper;

import com.zlfinfo.model.ActivityType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface ActivityTypeMapper {

    List<ActivityType> selectAllActType();

    List<ActivityType> selectActTypeByUser(@Param("username") String username);

}