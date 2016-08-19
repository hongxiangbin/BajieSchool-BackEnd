package com.zlfinfo.mapper;

import com.zlfinfo.model.ActivityComment;
import org.apache.ibatis.annotations.Param;

public interface ActivityCommentMapper {
    int deleteByPrimaryKey(@Param("actComId") String actComId, @Param("username") String username);

    int insert(ActivityComment record);

    int insertSelective(ActivityComment record);

    ActivityComment selectByPrimaryKey(@Param("actComId") String actComId, @Param("username") String username);

    int updateByPrimaryKeySelective(ActivityComment record);

    int updateByPrimaryKey(ActivityComment record);
}