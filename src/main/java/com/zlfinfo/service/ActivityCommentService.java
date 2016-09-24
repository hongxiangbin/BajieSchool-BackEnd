package com.zlfinfo.service;

import com.zlfinfo.model.ActivityComment;

import java.util.List;

/**
 * Created by Administrator on 2016/8/31.
 */
public interface ActivityCommentService {

    List<ActivityComment> selectActComByActId(Integer actId, String username);

    int insertSelective(ActivityComment activityComment);

    int updateLike();
}
