package com.zlfinfo.service;

import com.zlfinfo.model.StudyReply;

import java.util.List;

/**
 * Created by Administrator on 2016/8/29.
 */
public interface StudyReplyService {

    List<StudyReply> selectAllStudyReply();

    List<StudyReply> selectStudyReplyByStudy(Integer stdId, String username);

    int insertStudyReply(StudyReply studyReply);
}
