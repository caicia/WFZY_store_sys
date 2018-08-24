package com.WFZY.pojo;

import java.util.Date;

public class Goodslimitacitivty {
    private Integer goodsid;

    private Date limittime;

    private Integer limitstock;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Date getLimittime() {
        return limittime;
    }

    public void setLimittime(Date limittime) {
        this.limittime = limittime;
    }

    public Integer getLimitstock() {
        return limitstock;
    }

    public void setLimitstock(Integer limitstock) {
        this.limitstock = limitstock;
    }
}