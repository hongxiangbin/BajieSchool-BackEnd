package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class Study implements Serializable {
    private Integer stdId;

    private Integer typeId;

    private String stdTitle;

    private String stdContent;

    private Integer stdLike;

    private Integer stdComment;

    private Date stdTime;

    private static final long serialVersionUID = 1L;

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getStdTitle() {
        return stdTitle;
    }

    public void setStdTitle(String stdTitle) {
        this.stdTitle = stdTitle == null ? null : stdTitle.trim();
    }

    public String getStdContent() {
        return stdContent;
    }

    public void setStdContent(String stdContent) {
        this.stdContent = stdContent == null ? null : stdContent.trim();
    }

    public Integer getStdLike() {
        return stdLike;
    }

    public void setStdLike(Integer stdLike) {
        this.stdLike = stdLike;
    }

    public Integer getStdComment() {
        return stdComment;
    }

    public void setStdComment(Integer stdComment) {
        this.stdComment = stdComment;
    }

    public Date getStdTime() {
        return stdTime;
    }

    public void setStdTime(Date stdTime) {
        this.stdTime = stdTime;
    }
}