package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    private Integer queId;

    private String queTitle;

    private String queContent;

    private String queImg;

    private int queLike;

    private int queComment;

    private Date queTime;

    private static final long serialVersionUID = 1L;

    public Integer getQueId() {
        return queId;
    }

    public void setQueId(Integer queId) {
        this.queId = queId;
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

    public int getQueLike() {
        return queLike;
    }

    public void setQueLike(int queLike) {
        this.queLike = queLike;
    }

    public int getQueComment() {
        return queComment;
    }

    public void setQueComment(int queComment) {
        this.queComment = queComment;
    }

    public Date getQueTime() {
        return queTime;
    }

    public void setQueTime(Date queTime) {
        this.queTime = queTime;
    }
}