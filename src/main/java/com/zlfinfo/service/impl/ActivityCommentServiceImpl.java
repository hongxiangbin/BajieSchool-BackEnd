package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.ActivityCommentMapper;
import com.zlfinfo.model.ActivityComment;
import com.zlfinfo.service.ActivityCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/31.
 */
@Service
public class ActivityCommentServiceImpl implements ActivityCommentService {

    @Autowired
    private ActivityCommentMapper activityCommentMapper;

    @Override
    public List<ActivityComment> selectActComByActId(Integer actId, String username) {
        return activityCommentMapper.selectActivityCommentByActId(actId, username);
    }

    @Override
    public int insertSelective(ActivityComment activityComment) {
        return activityCommentMapper.insertSelective(activityComment);
    }

    @Override
    public int updateLike() {
        return activityCommentMapper.updateLike();
    }

}