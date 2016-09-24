package com.zlfinfo.mapper;

import com.zlfinfo.model.Study;
import com.zlfinfo.model.StudyReply;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface StudyMapper {
    int deleteByPrimaryKey(Integer stdId);

    int insert(Study record);

    int insertSelective(Study record);

    Study selectByPrimaryKey(Integer stdId);

    int updateByPrimaryKeySelective(Study record);

    int updateByPrimaryKey(Study record);

    List<Study> selectStudyByTypeNUser(@Param("type") Integer type, @Param("username") String username);

    int addCommentNum(@Param("stdId") Integer stdId);

}