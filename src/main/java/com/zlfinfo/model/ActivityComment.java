package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class ActivityComment implements Serializable {
    private String actComId;

    private String username;

    private String actComContent;

    private Date actComTime;

    private Integer actComLike;

    private static final long serialVersionUID = 1L;

    public String getActComId() {
        return actComId;
    }

    public void setActComId(String actComId) {
        this.actComId = actComId == null ? null : actComId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getActComContent() {
        return actComContent;
    }

    public void setActComContent(String actComContent) {
        this.actComContent = actComContent == null ? null : actComContent.trim();
    }

    public Date getActComTime() {
        return actComTime;
    }

    public void setActComTime(Date actComTime) {
        this.actComTime = actComTime;
    }

    public Integer getActComLike() {
        return actComLike;
    }

    public void setActComLike(Integer actComLike) {
        this.actComLike = actComLike;
    }
}