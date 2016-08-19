package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class Answer implements Serializable {
    private String ansId;

    private String queId;

    private String username;

    private String ansContent;

    private Integer ansLike;

    private Integer ansComment;

    private Date ansTime;

    private static final long serialVersionUID = 1L;

    public String getAnsId() {
        return ansId;
    }

    public void setAnsId(String ansId) {
        this.ansId = ansId == null ? null : ansId.trim();
    }

    public String getQueId() {
        return queId;
    }

    public void setQueId(String queId) {
        this.queId = queId == null ? null : queId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAnsContent() {
        return ansContent;
    }

    public void setAnsContent(String ansContent) {
        this.ansContent = ansContent == null ? null : ansContent.trim();
    }

    public Integer getAnsLike() {
        return ansLike;
    }

    public void setAnsLike(Integer ansLike) {
        this.ansLike = ansLike;
    }

    public Integer getAnsComment() {
        return ansComment;
    }

    public void setAnsComment(Integer ansComment) {
        this.ansComment = ansComment;
    }

    public Date getAnsTime() {
        return ansTime;
    }

    public void setAnsTime(Date ansTime) {
        this.ansTime = ansTime;
    }
}