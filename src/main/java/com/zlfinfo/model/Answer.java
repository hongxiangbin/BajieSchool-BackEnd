package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class Answer implements Serializable {
    private Integer ansId;

    private Integer queId;

    private String username;

    private String avatar;

    private String ansContent;

    private Integer ansLike;

    private Integer ansComment;

    private Date ansTime;

    private static final long serialVersionUID = 1L;

    public Answer() {
    }

    public Answer(Integer ansId, Integer queId, String username, String avatar, String ansContent, Integer ansLike,
                  Integer ansComment, Date ansTime) {
        this.ansId = ansId;
        this.queId = queId;
        this.username = username;
        this.avatar = avatar;
        this.ansContent = ansContent;
        this.ansLike = ansLike;
        this.ansComment = ansComment;
        this.ansTime = ansTime;
    }

    public Answer(Integer ansId, Integer queId, String username, String ansContent, Integer ansLike, Integer
            ansComment, Date ansTime) {
        this.ansId = ansId;
        this.queId = queId;
        this.username = username;
        this.ansContent = ansContent;
        this.ansLike = ansLike;
        this.ansComment = ansComment;
        this.ansTime = ansTime;
    }

    public Integer getAnsId() {
        return ansId;
    }

    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    public Integer getQueId() {
        return queId;
    }

    public void setQueId(Integer queId) {
        this.queId = queId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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