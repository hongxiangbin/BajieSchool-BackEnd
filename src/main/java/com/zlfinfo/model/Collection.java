package com.zlfinfo.model;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/17.
 */
public class Collection {

    private Integer id;
    private String username;
    private String type;
    private String title;
    private Date date;
    private String content;
    private String isShow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", content='" + content + '\'' +
                ", isShow='" + isShow + '\'' +
                '}';
    }
}
