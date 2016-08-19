package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    private String queId;

    private String queTitle;

    private String queContent;

    private String queImg;

    private Integer queLike;

    private Integer queComment;

    private Date queTime;

    private static final long serialVersionUID = 1L;

    public String getQueId() {
        return queId;
    }

    public void setQueId(String queId) {
        this.queId = queId == null ? null : queId.trim();
    }

    public String getQueTitle() {
        return queTitle;
    }

    public void setQueTitle(String queTitle) {
        this.queTitle = queTitle == null ? null : queTitle.trim();
    }

    public String getQueContent() {
        return queContent;
    }

    public void setQueContent(String queContent) {
        this.queContent = queContent == null ? null : queContent.trim();
    }

    public String getQueImg() {
        return queImg;
    }

    public void setQueImg(String queImg) {
        this.queImg = queImg == null ? null : queImg.trim();
    }

    public Integer getQueLike() {
        return queLike;
    }

    public void setQueLike(Integer queLike) {
        this.queLike = queLike;
    }

    public Integer getQueComment() {
        return queComment;
    }

    public void setQueComment(Integer queComment) {
        this.queComment = queComment;
    }

    public Date getQueTime() {
        return queTime;
    }

    public void setQueTime(Date queTime) {
        this.queTime = queTime;
    }
}