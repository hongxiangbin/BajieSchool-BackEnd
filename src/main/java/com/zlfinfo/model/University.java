package com.zlfinfo.model;

/**
 * Created by Administrator on 2016/8/22.
 */
public class University {
    private String univId;
    private String univName;

    public University(String univId, String univName) {
        this.univId = univId;
        this.univName = univName;
    }

    public String getUnivId() {
        return univId;
    }

    public void setUnivId(String univId) {
        this.univId = univId;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    @Override
    public String toString() {
        return "University{" +
                "univId='" + univId + '\'' +
                ", univName='" + univName + '\'' +
                '}';
    }
}
