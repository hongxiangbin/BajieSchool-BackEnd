package com.zlfinfo.mapper;

import com.zlfinfo.model.ActivityCommentComment;
import org.apache.ibatis.annotations.Param;

public interface ActivityCommentCommentMapper {
    int deleteByPrimaryKey(@Param("aCCId") String aCCId, @Param("actComId") Integer actComId, @Param("username") String username);

    int insert(ActivityCommentComment record);

    int insertSelective(ActivityCommentComment record);

    ActivityCommentComment selectByPrimaryKey(@Param("aCCId") Integer aCCId, @Param("actComId") String actComId, @Param("username") String username);

    int updateByPrimaryKeySelective(ActivityCommentComment record);

    int updateByPrimaryKey(ActivityCommentComment record);
}