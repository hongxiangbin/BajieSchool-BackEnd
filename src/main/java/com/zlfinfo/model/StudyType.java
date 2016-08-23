package com.zlfinfo.model;

/**
 * Created by Administrator on 2016/8/23.
 */
public class StudyType {

    private String typeId;
    private String typeName;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "StudyType{" +
                "typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
