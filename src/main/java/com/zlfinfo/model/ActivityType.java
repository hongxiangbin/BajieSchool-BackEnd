package com.zlfinfo.model;

/**
 * Created by Administrator on 2016/8/23.
 */
public class ActivityType {

    private Integer actTypeId;
    private String actTypeName;

    public Integer getActTypeId() {
        return actTypeId;
    }

    public void setActTypeId(Integer actTypeId) {
        this.actTypeId = actTypeId;
    }

    public String getActTypeName() {
        return actTypeName;
    }

    public void setActTypeName(String actTypeName) {
        this.actTypeName = actTypeName;
    }

    @Override
    public String toString() {
        return "ActivityType{" +
                "actTypeId=" + actTypeId +
                ", actTypeName=" + actTypeName +
                '}';
    }
}
