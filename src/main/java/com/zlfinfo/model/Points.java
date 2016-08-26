package com.zlfinfo.model;

import java.util.Date;

/**
 * Created by Administrator on 2016/8/26.
 */
public class Points {

    private String username;
    private Integer point;
    private Date date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Points{" +
                "username='" + username + '\'' +
                ", point=" + point +
                ", date=" + date +
                '}';
    }
}
