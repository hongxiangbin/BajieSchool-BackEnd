package com.zlfinfo.model;

import java.io.Serializable;

public class Notification implements Serializable {
    private Integer noId;

    private String noContent;

    private String type;

    private String noUrl;

    private String username;

    private Integer isRead;

    private static final long serialVersionUID = 1L;

    public Integer getNoId() {
        return noId;
    }

    public void setNoId(Integer noId) {
        this.noId = noId;
    }

    public String getNoContent() {
        return noContent;
    }

    public void setNoContent(String noContent) {
        this.noContent = noContent == null ? null : noContent.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNoUrl() {
        return noUrl;
    }

    public void setNoUrl(String noUrl) {
        this.noUrl = noUrl == null ? null : noUrl.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }
}