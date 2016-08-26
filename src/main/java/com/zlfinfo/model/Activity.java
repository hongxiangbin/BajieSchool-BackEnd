package com.zlfinfo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Activity implements Serializable {

    public Activity() {
    }

    private Integer actId;

    private Integer actType;

    private String actTitle;

    private String actContent;

    private String actImg;
   /* @DateTimeFormat(pattern="yyyy-MM-dd")*/
    private Date actTime;

    private Integer actLike;

    private Integer actComment;

    private Integer actFollow;

    private Integer actJoin;

    private Integer actSignup;

    private String actPlace;

    private String reserve1;

    private String reserve2;

    public Activity(Integer actId, Integer actType, String actTitle, String actContent, String actImg, Date actTime, String actPlace) {
        this.actId = actId;
        this.actType = actType;
        this.actTitle = actTitle;
        this.actContent = actContent;
        this.actImg = actImg;
        this.actTime = actTime;
        this.actPlace = actPlace;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public Integer getActType() {
        return actType;
    }

    public void setActType(Integer actType) {
        this.actType = actType;
    }

    public String getActTitle() {
        return actTitle;
    }

    public void setActTitle(String actTitle) {
        this.actTitle = actTitle;
    }

    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent;
    }

    public String getActImg() {
        return actImg;
    }

    public void setActImg(String actImg) {
        this.actImg = actImg;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8", locale = "zh")
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
        this.actPlace = actPlace;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

   /* public static long getSerialVersionUID() {
        return serialVersionUID;
    }*/

    @Override
    public String toString() {
        return "Activity{" +
                "actId='" + actId + '\'' +
                ", actType='" + actType + '\'' +
                ", actTitle='" + actTitle + '\'' +
                ", actContent='" + actContent + '\'' +
                ", actImg='" + actImg + '\'' +
                ", actTime=" + actTime +
                ", actLike=" + actLike +
                ", actComment=" + actComment +
                ", actFollow=" + actFollow +
                ", actJoin=" + actJoin +
                ", actSignup=" + actSignup +
                ", actPlace='" + actPlace + '\'' +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                '}';
    }
}