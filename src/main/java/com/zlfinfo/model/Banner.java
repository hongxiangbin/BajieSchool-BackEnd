package com.zlfinfo.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/24.
 */
public class Banner implements Serializable {
    private String href;
    private String img;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
