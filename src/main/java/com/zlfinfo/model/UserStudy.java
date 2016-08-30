package com.zlfinfo.model;

import java.io.Serializable;

public class UserStudy implements Serializable {
    private Integer stdId;

    private String username;

    private Integer flag;

    private static final long serialVersionUID = 1L;

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
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

    @Override
    public String toString() {
        return "UserStudy{" +
                "stdId=" + stdId +
                ", username='" + username + '\'' +
                ", flag=" + flag +
                '}';
    }
}