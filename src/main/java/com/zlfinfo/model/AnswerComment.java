package com.zlfinfo.model;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/10.
 */
public class AnswerComment {
    private Integer ansId;
    private String username;
    private String content;
    private Date time;
    private Integer like;

    public AnswerComment() {
    }

    public AnswerComment(Integer ansId, String username, String content, Date time, Integer like) {
        this.ansId = ansId;
        this.username = username;
        this.content = content;
        this.time = time;
        this.like = like;
    }

    public Integer getAnsId() {
        return ansId;
    }

    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "AnswerComment{" +
                "ansId=" + ansId +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", like=" + like +
                '}';
    }
}
