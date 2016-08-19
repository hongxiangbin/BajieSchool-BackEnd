package com.zlfinfo.model;

import java.io.Serializable;

public class Notification implements Serializable {
    private String noId;

    private String noContent;

    private String type;

    private String noUrl;

    private static final long serialVersionUID = 1L;

    public String getNoId() {
        return noId;
    }

    public void setNoId(String noId) {
        this.noId = noId == null ? null : noId.trim();
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
}