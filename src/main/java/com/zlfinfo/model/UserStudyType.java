package com.zlfinfo.model;

/**
 * Created by Administrator on 2016/8/23.
 */
public class UserStudyType {
    private String username;
    private Integer studyType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getStudyType() {
        return studyType;
    }

    public void setStudyType(Integer studyType) {
        this.studyType = studyType;
    }

    @Override
    public String toString() {
        return "UserStudyType{" +
                "username='" + username + '\'' +
                ", studyType='" + studyType + '\'' +
                '}';
    }
}
