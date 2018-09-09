package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orderrefunds {
    private Integer orderrefundsid;

    private Integer orderid;

    private Integer userid;

    private Integer shopid;

    private String refundotherreson;

    private Date createtime;

    private BigDecimal backmoney;

    private String refundremark;

    private Date refundtime;

    private String shoprejectreason;

    private Byte refundstatus;

    public Integer getOrderrefundsid() {
        return orderrefundsid;
    }

    public void setOrderrefundsid(Integer orderrefundsid) {
        this.orderrefundsid = orderrefundsid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getRefundotherreson() {
        return refundotherreson;
    }

    public void setRefundotherreson(String refundotherreson) {
        this.refundotherreson = refundotherreson == null ? null : refundotherreson.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getBackmoney() {
        return backmoney;
    }

    public void setBackmoney(BigDecimal backmoney) {
        this.backmoney = backmoney;
    }

    public String getRefundremark() {
        return refundremark;
    }

    public void setRefundremark(String refundremark) {
        this.refundremark = refundremark == null ? null : refundremark.trim();
    }

    public Date getRefundtime() {
        return refundtime;
    }

    public void setRefundtime(Date refundtime) {
        this.refundtime = refundtime;
    }

    public String getShoprejectreason() {
        return shoprejectreason;
    }

    public void setShoprejectreason(String shoprejectreason) {
        this.shoprejectreason = shoprejectreason == null ? null : shoprejectreason.trim();
    }

    public Byte getRefundstatus() {
        return refundstatus;
    }

    public void setRefundstatus(Byte refundstatus) {
        this.refundstatus = refundstatus;
    }
}