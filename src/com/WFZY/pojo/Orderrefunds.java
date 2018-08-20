package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orderrefunds {
    private Integer orderrefundsid;

    private Integer orderid;

    private Integer refundto;

    private String refundtradeno;

    private String refundremark;

    private Date refundtime;

    private Integer refundreson;

    private String refundotherreson;

    private BigDecimal backmoney;

    private String shoprejectreason;

    private Byte refundstatus;

    private Date createtime;

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

    public Integer getRefundto() {
        return refundto;
    }

    public void setRefundto(Integer refundto) {
        this.refundto = refundto;
    }

    public String getRefundtradeno() {
        return refundtradeno;
    }

    public void setRefundtradeno(String refundtradeno) {
        this.refundtradeno = refundtradeno == null ? null : refundtradeno.trim();
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

    public Integer getRefundreson() {
        return refundreson;
    }

    public void setRefundreson(Integer refundreson) {
        this.refundreson = refundreson;
    }

    public String getRefundotherreson() {
        return refundotherreson;
    }

    public void setRefundotherreson(String refundotherreson) {
        this.refundotherreson = refundotherreson == null ? null : refundotherreson.trim();
    }

    public BigDecimal getBackmoney() {
        return backmoney;
    }

    public void setBackmoney(BigDecimal backmoney) {
        this.backmoney = backmoney;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}