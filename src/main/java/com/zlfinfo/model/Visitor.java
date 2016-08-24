package com.zlfinfo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Administrator on 2016/8/24.
 */
public class Visitor {
    private String username;
    private String visitor;
    private Date date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8", locale = "zh")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd", timezone = "GMT+8", locale = "zh")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "username='" + username + '\'' +
                ", visitor='" + visitor + '\'' +
                ", date=" + date +
                '}';
    }
}
