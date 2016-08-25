package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class StudyReply implements Serializable {
    private Integer stdId;

    private String username;

    private String stdReContent;

    private Date stdReTime;

    private Integer stdReLike;

    private static final long serialVersionUID = 1L;

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
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