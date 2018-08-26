package com.WFZY.pojo;

import java.util.Date;

public class Goodsapply {
    private Integer goodsapplyid;

    private Byte goodstype;

    private Integer goodsid;

    private Integer shopid;

    private Date createtime;

    private Date starttime;

    private Date endtime;

    private Integer storknum;

    private Byte ishandle;

    private String applytext;

    public Integer getGoodsapplyid() {
        return goodsapplyid;
    }

    public void setGoodsapplyid(Integer goodsapplyid) {
        this.goodsapplyid = goodsapplyid;
    }

    public Byte getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Byte goodstype) {
        this.goodstype = goodstype;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getStorknum() {
        return storknum;
    }

    public void setStorknum(Integer storknum) {
        this.storknum = storknum;
    }

    public Byte getIshandle() {
        return ishandle;
    }

    public void setIshandle(Byte ishandle) {
        this.ishandle = ishandle;
    }

    public String getApplytext() {
        return applytext;
    }

    public void setApplytext(String applytext) {
        this.applytext = applytext == null ? null : applytext.trim();
    }
}