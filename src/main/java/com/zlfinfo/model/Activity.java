package com.zlfinfo.model;

import java.io.Serializable;
import java.util.Date;

public class Activity implements Serializable {
    private String actId;

    private String actType;

    private String actTitle;

    private String actContent;

    private String actImg;

    private Date actTime;

    private Integer actLike;

    private Integer actComment;

    private Integer actFollow;

    private Integer actJoin;

    private Integer actSignup;

    private String actPlace;

    private String reserve1;

    private String reserve2;

    private static final long serialVersionUID = 1L;

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType == null ? null : actType.trim();
    }

    public String getActTitle() {
        return actTitle;
    }

    public void setActTitle(String actTitle) {
        this.actTitle = actTitle == null ? null : actTitle.trim();
    }

    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent == null ? null : actContent.trim();
    }

    public String getActImg() {
        return actImg;
    }

    public void setActImg(String actImg) {
        this.actImg = actImg == null ? null : actImg.trim();
    }

    public Date getActTime() {
        return actTime;
    }

    public void setActTime(Date actTime) {
        this.actTime = actTime;
    }

    public Integer getActLike() {
        return actLike;
    }

    public void setActLike(Integer actLike) {
        this.actLike = actLike;
    }

    public Integer getActComment() {
        return actComment;
    }

    public void setActComment(Integer actComment) {
        this.actComment = actComment;
    }

    public Integer getActFollow() {
        return actFollow;
    }

    public void setActFollow(Integer actFollow) {
        this.actFollow = actFollow;
    }

    public Integer getActJoin() {
        return actJoin;
    }

    public void setActJoin(Integer actJoin) {
        this.actJoin = actJoin;
    }

    public Integer getActSignup() {
        return actSignup;
    }

    public void setActSignup(Integer actSignup) {
        this.actSignup = actSignup;
    }

    public String getActPlace() {
        return actPlace;
    }

    public void setActPlace(String actPlace) {
        this.actPlace = actPlace == null ? null : actPlace.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }
}