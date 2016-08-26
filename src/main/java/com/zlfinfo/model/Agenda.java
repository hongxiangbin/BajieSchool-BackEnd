package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class Agenda implements Serializable {
    private Integer agId;

    private String username;

    private String agTitle;

    private String agRemark;

    private Date agTime;

    private Date agRemind;

    private Integer agShow;

    private static final long serialVersionUID = 1L;

    public Agenda() {
    }

    public Agenda(String username, String agTitle, String agRemark, Date agTime, Date agRemind) {
        this.username = username;
        this.agTitle = agTitle;
        this.agRemark = agRemark;
        this.agTime = agTime;
        this.agRemind = agRemind;
    }

    public Integer getAgId() {
        return agId;
    }

    public void setAgId(Integer agId) {
        this.agId = agId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAgTitle() {
        return agTitle;
    }

    public void setAgTitle(String agTitle) {
        this.agTitle = agTitle;
    }

    public String getAgRemark() {
        return agRemark;
    }

    public void setAgRemark(String agRemark) {
        this.agRemark = agRemark;
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

    public Integer getAgShow() {
        return agShow;
    }

    public void setAgShow(Integer agShow) {
        this.agShow = agShow;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "agId=" + agId +
                ", username='" + username + '\'' +
                ", agTitle='" + agTitle + '\'' +
                ", agRemark='" + agRemark + '\'' +
                ", agTime=" + agTime +
                ", agRemind=" + agRemind +
                ", agShow=" + agShow +
                '}';
    }
}