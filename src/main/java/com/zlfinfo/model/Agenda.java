package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class Agenda implements Serializable {
    private String agId;

    private String username;

    private String agTitle;

    private String agRemark;

    private Date agTime;

    private Date agRemind;

    private static final long serialVersionUID = 1L;

    public String getAgId() {
        return agId;
    }

    public void setAgId(String agId) {
        this.agId = agId == null ? null : agId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAgTitle() {
        return agTitle;
    }

    public void setAgTitle(String agTitle) {
        this.agTitle = agTitle == null ? null : agTitle.trim();
    }

    public String getAgRemark() {
        return agRemark;
    }

    public void setAgRemark(String agRemark) {
        this.agRemark = agRemark == null ? null : agRemark.trim();
    }

    public Date getAgTime() {
        return agTime;
    }

    public void setAgTime(Date agTime) {
        this.agTime = agTime;
    }

    public Date getAgRemind() {
        return agRemind;
    }

    public void setAgRemind(Date agRemind) {
        this.agRemind = agRemind;
    }
}