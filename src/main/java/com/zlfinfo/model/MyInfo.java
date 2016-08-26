package com.zlfinfo.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/26.
 */
public class MyInfo implements Serializable {

    private Integer points;
    private Integer agendaNum;
    private Integer notificationNum;
    private Integer collectionNum;

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getAgendaNum() {
        return agendaNum;
    }

    public void setAgendaNum(Integer agendaNum) {
        this.agendaNum = agendaNum;
    }

    public Integer getNotificationNum() {
        return notificationNum;
    }

    public void setNotificationNum(Integer notificationNum) {
        this.notificationNum = notificationNum;
    }

    public Integer getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }

    @Override
    public String toString() {
        return "MyInfo{" +
                "points=" + points +
                ", agendaNum=" + agendaNum +
                ", notificationNum=" + notificationNum +
                ", collectionNum=" + collectionNum +
                '}';
    }
}
