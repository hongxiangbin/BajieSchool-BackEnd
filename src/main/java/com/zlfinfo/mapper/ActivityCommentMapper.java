package com.zlfinfo.mapper;

import com.zlfinfo.model.ActivityComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityCommentMapper {

    int insert(ActivityComment record);

    int insertSelective(ActivityComment record);

    int updateLike();

    List<ActivityComment> selectActivityCommentByActId(@Param("actId") Integer actId, @Param("username") String
            username);
}