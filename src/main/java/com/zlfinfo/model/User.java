package com.zlfinfo.model;

import java.io.Serializable;

public class User implements Serializable {
    private String username;

    private String noId;

    private String password;

    private String sex;

    private String cellphone;

    private String avatar;

    private String motto;

    private Integer university;

    private String institution;

    private String enrollYear;

    private String level;

    private String qq;

    private String wechat;

    private String weibo;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String schoolname;
    public User() {
    }

    public User(String username, String avatar, String motto) {
        this.username = username;
        this.avatar = avatar;
        this.motto = motto;
    }
/*
    public User(String username, String password, String sex, String cellphone, Integer university, String
            institution, String enrollYear, String level) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.cellphone = cellphone;
        this.university = university;
        this.institution = institution;
        this.enrollYear = enrollYear;
        this.level = level;
    }*/

    public User(String username, String noId, String password, String sex, String cellphone, String avatar, String
            motto, Integer university, String institution, String enrollYear, String level, String qq, String wechat,
                String weibo, String reserve1, String reserve2) {
        this.username = username;
        this.noId = noId;
        this.password = password;
        this.sex = sex;
        this.cellphone = cellphone;
        this.avatar = avatar;
        this.motto = motto;
        this.university = university;
        this.institution = institution;
        this.enrollYear = enrollYear;
        this.level = level;
        this.qq = qq;
        this.wechat = wechat;
        this.weibo = weibo;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
    }

    private static final long serialVersionUID = 1L;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNoId() {
        return noId;
    }

    public void setNoId(String noId) {
        this.noId = noId == null ? null : noId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }


    public Integer getUniversity() {
        return university;
    }

    public void setUniversity(Integer university) {
        this.university = university;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution == null ? null : institution.trim();
    }

    public String getEnrollYear() {
        return enrollYear;
    }

    public void setEnrollYear(String enrollYear) {
        this.enrollYear = enrollYear == null ? null : enrollYear.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
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

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", noId='" + noId + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", avatar='" + avatar + '\'' +
                ", motto='" + motto + '\'' +
                ", university=" + university +
                ", institution='" + institution + '\'' +
                ", enrollYear='" + enrollYear + '\'' +
                ", level='" + level + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", weibo='" + weibo + '\'' +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                ", reserve3='" + reserve3 + '\'' +
                ", schoolname='" + schoolname + '\'' +
                '}';
    }
}