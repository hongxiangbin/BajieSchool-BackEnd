package com.zlfinfo.model;

import java.util.List;

/**
 * Created by Administrator on 2016/8/29.
 */
public class UserStudyReply {
    private Study study;
    private User user;
    private List<StudyReply> studyReplyList;

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<StudyReply> getStudyReplyList() {
        return studyReplyList;
    }

    public void setStudyReplyList(List<StudyReply> studyReplyList) {
        this.studyReplyList = studyReplyList;
    }
}
