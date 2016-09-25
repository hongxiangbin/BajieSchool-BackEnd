package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class AnswerComment implements Serializable {
    private Integer ansCommId;

    private Integer ansId;

    private String ansCommUsername;

    private String ansCommContent;

    private Date ansCommTime;

    private Integer ansCommLike;

    private String avatar;

    private static final long serialVersionUID = 1L;

    public AnswerComment() {
    }

    public AnswerComment(Integer ansCommId, Integer ansId, String ansCommUsername, String ansCommContent, Date
            ansCommTime, Integer ansCommLike, String avatar) {
        this.ansCommId = ansCommId;
        this.ansId = ansId;
        this.ansCommUsername = ansCommUsername;
        this.ansCommContent = ansCommContent;
        this.ansCommTime = ansCommTime;
        this.ansCommLike = ansCommLike;
        this.avatar = avatar;
    }

    public Integer getAnsCommId() {
        return ansCommId;
    }

    public void setAnsCommId(Integer ansCommId) {
        this.ansCommId = ansCommId;
    }

    public Integer getAnsId() {
        return ansId;
    }

    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    public String getAnsCommUsername() {
        return ansCommUsername;
    }

    public void setAnsCommUsername(String ansCommUsername) {
        this.ansCommUsername = ansCommUsername == null ? null : ansCommUsername.trim();
    }

    public String getAnsCommContent() {
        return ansCommContent;
    }

    public void setAnsCommContent(String ansCommContent) {
        this.ansCommContent = ansCommContent == null ? null : ansCommContent.trim();
    }

    public Date getAnsCommTime() {
        return ansCommTime;
    }

    public void setAnsCommTime(Date ansCommTime) {
        this.ansCommTime = ansCommTime;
    }

    public Integer getAnsCommLike() {
        return ansCommLike;
    }

    public void setAnsCommLike(Integer ansCommLike) {
        this.ansCommLike = ansCommLike;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}