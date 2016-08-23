package com.zlfinfo.model;

/**
 * Created by Administrator on 2016/8/23.
 */
public class UserStudyType {
    private String username;
    private String studyType;

    public UserStudyType(String username, String studyType) {
        this.username = username;
        this.studyType = studyType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
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
