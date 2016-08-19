package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class ActivityCommentComment implements Serializable {
    private String aCCId;

    private String actComId;

    private String username;

    private String aCCContent;

    private Date aCCTime;

    private static final long serialVersionUID = 1L;

    public String getaCCId() {
        return aCCId;
    }

    public void setaCCId(String aCCId) {
        this.aCCId = aCCId == null ? null : aCCId.trim();
    }

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

    public String getaCCContent() {
        return aCCContent;
    }

    public void setaCCContent(String aCCContent) {
        this.aCCContent = aCCContent == null ? null : aCCContent.trim();
    }

    public Date getaCCTime() {
        return aCCTime;
    }

    public void setaCCTime(Date aCCTime) {
        this.aCCTime = aCCTime;
    }
}