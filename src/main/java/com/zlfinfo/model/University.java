package com.zlfinfo.model;

/**
 * Created by Administrator on 2016/8/22.
 */
public class University {
    private Integer univId;
    private String univName;

    public Integer getUnivId() {
        return univId;
    }

    public void setUnivId(Integer univId) {
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
