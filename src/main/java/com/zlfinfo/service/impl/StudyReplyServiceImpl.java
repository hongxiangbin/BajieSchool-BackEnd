package com.zlfinfo.service.impl;

import com.zlfinfo.mapper.StudyReplyMapper;
import com.zlfinfo.model.StudyReply;
import com.zlfinfo.service.StudyReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/29.
 */
@Service
public class StudyReplyServiceImpl implements StudyReplyService {

    @Autowired
    private StudyReplyMapper studyReplyMapper;

    @Override
    public List<StudyReply> selectAllStudyReply() {
        return studyReplyMapper.selectAllStudyReply();
    }

    @Override
    public List<StudyReply> selectStudyReplyByStudy(Integer stdId, String username) {
        return studyReplyMapper.selectStudyReplyByStudy(stdId, username);
    }

    @Override
    public int insertStudyReply(StudyReply studyReply) {
        return studyReplyMapper.insert(studyReply);
    }
}
