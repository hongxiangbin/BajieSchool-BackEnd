package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    private Integer queId;

    private String queTitle;

    private String queTags;

    private String queContent;

    private String queImg;

    private Integer queLike;

    private Integer queComment;

    private Date queTime;

    private static final long serialVersionUID = 1L;

    public Question() {
    }

    public Question(Integer queId, String queTitle, String queTags, String queContent, String queImg, Date queTime) {
        this.queId = queId;
        this.queTitle = queTitle;
        this.queTags = queTags;
        this.queContent = queContent;
        this.queImg = queImg;
        this.queTime = queTime;
    }

    public Question(Integer queId, String queTitle, String queTags, String queContent, String queImg, Integer
            queLike, Integer queComment, Date queTime) {
        this.queId = queId;
        this.queTitle = queTitle;
        this.queTags = queTags;
        this.queContent = queContent;
        this.queImg = queImg;
        this.queLike = queLike;
        this.queComment = queComment;
        this.queTime = queTime;
    }

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
        this.queTitle = queTitle;
    }

    public String getQueTags() {
        return queTags;
    }

    public void setQueTags(String queTags) {
        this.queTags = queTags;
    }

    public String getQueContent() {
        return queContent;
    }

    public void setQueContent(String queContent) {
        this.queContent = queContent;
    }

    public String getQueImg() {
        return queImg;
    }

    public void setQueImg(String queImg) {
        this.queImg = queImg;
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