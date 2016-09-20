package com.zlfinfo.model;

import java.io.Serializable;

public class UserActivity implements Serializable {
    private Integer actId;

    private String username;

    private Integer likeFlag;

    private Integer launFlag;

    private Integer commFlag;

    private Integer joinFlag;

    private Integer favFlag;

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

    public Integer getLikeFlag() {
        return likeFlag;
    }

    public void setLikeFlag(Integer likeFlag) {
        this.likeFlag = likeFlag;
    }

    public Integer getLaunFlag() {
        return launFlag;
    }

    public void setLaunFlag(Integer launFlag) {
        this.launFlag = launFlag;
    }

    public Integer getCommFlag() {
        return commFlag;
    }

    public void setCommFlag(Integer commFlag) {
        this.commFlag = commFlag;
    }

    public Integer getJoinFlag() {
        return joinFlag;
    }

    public void setJoinFlag(Integer joinFlag) {
        this.joinFlag = joinFlag;
    }

    public Integer getFavFlag() {
        return favFlag;
    }

    public void setFavFlag(Integer favFlag) {
        this.favFlag = favFlag;
    }
}