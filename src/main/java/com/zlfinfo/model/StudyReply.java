package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class StudyReply implements Serializable {
    private Integer stdId;

    private Integer stdReId;

    private String username;

    private String avatar;

    private String stdReContent;

    private Date stdReTime;

    private Integer stdReLike;

    public StudyReply() {
    }

    public StudyReply(Integer stdId, String username, String stdReContent, Date stdReTime, Integer
            stdReLike) {
        this.stdId = stdId;
        this.username = username;
        this.stdReContent = stdReContent;
        this.stdReTime = stdReTime;
        this.stdReLike = stdReLike;
    }

    private static final long serialVersionUID = 1L;

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public Integer getStdReId() {
        return stdReId;
    }

    public void setStdReId(Integer stdReId) {
        this.stdReId = stdReId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getStdReContent() {
        return stdReContent;
    }

    public void setStdReContent(String stdReContent) {
        this.stdReContent = stdReContent == null ? null : stdReContent.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getStdReTime() {
        return stdReTime;
    }

    public void setStdReTime(Date stdReTime) {
        this.stdReTime = stdReTime;
    }

    public Integer getStdReLike() {
        return stdReLike;
    }

    public void setStdReLike(Integer stdReLike) {
        this.stdReLike = stdReLike;
    }
}