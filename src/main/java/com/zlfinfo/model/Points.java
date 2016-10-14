package com.zlfinfo.model;

import java.io.Serializable;

public class Points implements Serializable {
    private String username;

    private Integer point;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Points(String username, Integer point, String remark) {
        this.username = username;
        this.point = point;
        this.remark = remark;
    }

    public Points() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}