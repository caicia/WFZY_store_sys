package com.WFZY.pojo;

import java.math.BigDecimal;

public class Ordergoods {
    private Integer ordergoodsid;

    private Integer orderid;

    private Integer goodsid;

    private Integer goodsnum;

    private BigDecimal goodsprice;

    private String goodsname;

    private String goodsimg;

    public Integer getOrdergoodsid() {
        return ordergoodsid;
    }

    public void setOrdergoodsid(Integer ordergoodsid) {
        this.ordergoodsid = ordergoodsid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public BigDecimal getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(BigDecimal goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg == null ? null : goodsimg.trim();
    }
}