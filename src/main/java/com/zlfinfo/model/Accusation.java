package com.zlfinfo.model;

import java.util.Date;

/**
 * Created by Administrator on 2016/8/23.
 */
public class Accusation {
    private String informant;
    private String against;
    private String content;
    private Date date;

    public Accusation() {
    }

    public Accusation(String informant, String against, String content, Date date) {
        this.informant = informant;
        this.against = against;
        this.content = content;
        this.date = date;
    }

    public String getInformant() {
        return informant;
    }

    public void setInformant(String informant) {
        this.informant = informant;
    }

    public String getAgainst() {
        return against;
    }

    public void setAgainst(String against) {
        this.against = against;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Accusation{" +
                "informant='" + informant + '\'' +
                ", against='" + against + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
