package com.zlfinfo.mapper;

import com.zlfinfo.model.UserStudy;
import org.apache.ibatis.annotations.Param;

public interface UserStudyMapper {
    int deleteByPrimaryKey(@Param("stdId") Integer stdId, @Param("username") String username);

    int insert(UserStudy record);

    int insertSelective(UserStudy record);

    UserStudy selectByPrimaryKey(@Param("stdId") Integer stdId, @Param("username") String username);

    int updateByPrimaryKeySelective(UserStudy record);

    int updateByPrimaryKey(UserStudy record);
}