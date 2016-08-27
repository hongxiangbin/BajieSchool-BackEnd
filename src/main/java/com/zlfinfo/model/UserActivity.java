package com.zlfinfo.model;

import java.io.Serializable;

public class UserActivity implements Serializable {
    private Integer actId;

    private String username;

    private Integer flag;

    private static final long serialVersionUID = 1L;

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}