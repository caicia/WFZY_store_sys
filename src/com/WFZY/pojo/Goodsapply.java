package com.WFZY.pojo;

import java.util.Date;

public class Goodsapply {
    private Integer applyid;

    private Integer goodsid;

    private Integer shopid;

    private Byte applytype;

    private Byte ishandle;

    private Date puttime;

    private Date endtime;

    private String stext;

    public Integer getApplyid() {
        return applyid;
    }

    public void setApplyid(Integer applyid) {
        this.applyid = applyid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Byte getApplytype() {
        return applytype;
    }

    public void setApplytype(Byte applytype) {
        this.applytype = applytype;
    }

    public Byte getIshandle() {
        return ishandle;
    }

    public void setIshandle(Byte ishandle) {
        this.ishandle = ishandle;
    }

    public Date getPuttime() {
        return puttime;
    }

    public void setPuttime(Date puttime) {
        this.puttime = puttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getStext() {
        return stext;
    }

    public void setStext(String stext) {
        this.stext = stext == null ? null : stext.trim();
    }
}