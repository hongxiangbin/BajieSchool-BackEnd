package com.zlfinfo.mapper;

import com.zlfinfo.model.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer actId);

    List<Activity> selectAllActivity();

    List<Activity> selectJoinActivity(@Param("username") String username);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    List<Activity> selectActivityByUserNType(@Param("type") Integer type);

    List<Activity> selectMineActivity(@Param("username") String username, @Param("launFlag") Integer launFlag);

    //    评论数量+1
    int addCommentNum(Integer actId);

    //    参加数量+1
    int addJoinNum(Integer actId);

}