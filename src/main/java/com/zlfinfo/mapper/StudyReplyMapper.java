package com.zlfinfo.mapper;

import com.zlfinfo.model.StudyReply;
import org.apache.ibatis.annotations.Param;

public interface StudyReplyMapper {
    int deleteByPrimaryKey(@Param("stdId") String stdId, @Param("username") String username);

    int insert(StudyReply record);

    int insertSelective(StudyReply record);

    StudyReply selectByPrimaryKey(@Param("stdId") String stdId, @Param("username") String username);

    int updateByPrimaryKeySelective(StudyReply record);

    int updateByPrimaryKey(StudyReply record);
}