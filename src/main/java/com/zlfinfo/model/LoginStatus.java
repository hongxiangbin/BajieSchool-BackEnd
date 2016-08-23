package com.zlfinfo.model;

import java.util.Date;

/**
 * Created by Administrator on 2016/8/22.
 */
public class LoginStatus {

    private String username;
    private int status;
    private Date logintime;

    public LoginStatus(String username, int status, Date logintime) {
        this.username = username;
        this.status = status;
        this.logintime = logintime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    @Override
    public String toString() {
        return "LoginStatus{" +
                "username='" + username + '\'' +
                ", status=" + status +
                ", logintime=" + logintime +
                '}';
    }

}