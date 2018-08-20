package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer orderid;

    private String orderno;

    private Integer shopid;

    private Integer userid;

    private Byte orderstatus;

    private BigDecimal goodsmoney;

    private Byte delivertype;

    private BigDecimal delivermoney;

    private BigDecimal totalmoney;

    private BigDecimal realtotalmoney;

    private Byte paytype;

    private Integer payfrom;

    private Byte ispay;

    private String username;

    private String useraddress;

    private String userphone;

    private Byte isinvoice;

    private String orderremarks;

    private Byte ordersrc;

    private Byte isrefund;

    private Byte isappraise;

    private Integer cancelreason;

    private Integer rejectreason;

    private String rejectotherreason;

    private Byte isclosed;

    private String orderunique;

    private Integer settlementid;

    private Date receivetime;

    private Date deliverytime;

    private String expressno;

    private Integer expressid;

    private String tradeno;

    private Byte dataflag;

    private Date createtime;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Byte orderstatus) {
        this.orderstatus = orderstatus;
    }

    public BigDecimal getGoodsmoney() {
        return goodsmoney;
    }

    public void setGoodsmoney(BigDecimal goodsmoney) {
        this.goodsmoney = goodsmoney;
    }

    public Byte getDelivertype() {
        return delivertype;
    }

    public void setDelivertype(Byte delivertype) {
        this.delivertype = delivertype;
    }

    public BigDecimal getDelivermoney() {
        return delivermoney;
    }

    public void setDelivermoney(BigDecimal delivermoney) {
        this.delivermoney = delivermoney;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public BigDecimal getRealtotalmoney() {
        return realtotalmoney;
    }

    public void setRealtotalmoney(BigDecimal realtotalmoney) {
        this.realtotalmoney = realtotalmoney;
    }

    public Byte getPaytype() {
        return paytype;
    }

    public void setPaytype(Byte paytype) {
        this.paytype = paytype;
    }

    public Integer getPayfrom() {
        return payfrom;
    }

    public void setPayfrom(Integer payfrom) {
        this.payfrom = payfrom;
    }

    public Byte getIspay() {
        return ispay;
    }

    public void setIspay(Byte ispay) {
        this.ispay = ispay;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public Byte getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(Byte isinvoice) {
        this.isinvoice = isinvoice;
    }

    public String getOrderremarks() {
        return orderremarks;
    }

    public void setOrderremarks(String orderremarks) {
        this.orderremarks = orderremarks == null ? null : orderremarks.trim();
    }

    public Byte getOrdersrc() {
        return ordersrc;
    }

    public void setOrdersrc(Byte ordersrc) {
        this.ordersrc = ordersrc;
    }

    public Byte getIsrefund() {
        return isrefund;
    }

    public void setIsrefund(Byte isrefund) {
        this.isrefund = isrefund;
    }

    public Byte getIsappraise() {
        return isappraise;
    }

    public void setIsappraise(Byte isappraise) {
        this.isappraise = isappraise;
    }

    public Integer getCancelreason() {
        return cancelreason;
    }

    public void setCancelreason(Integer cancelreason) {
        this.cancelreason = cancelreason;
    }

    public Integer getRejectreason() {
        return rejectreason;
    }

    public void setRejectreason(Integer rejectreason) {
        this.rejectreason = rejectreason;
    }

    public String getRejectotherreason() {
        return rejectotherreason;
    }

    public void setRejectotherreason(String rejectotherreason) {
        this.rejectotherreason = rejectotherreason == null ? null : rejectotherreason.trim();
    }

    public Byte getIsclosed() {
        return isclosed;
    }

    public void setIsclosed(Byte isclosed) {
        this.isclosed = isclosed;
    }

    public String getOrderunique() {
        return orderunique;
    }

    public void setOrderunique(String orderunique) {
        this.orderunique = orderunique == null ? null : orderunique.trim();
    }

    public Integer getSettlementid() {
        return settlementid;
    }

    public void setSettlementid(Integer settlementid) {
        this.settlementid = settlementid;
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getExpressno() {
        return expressno;
    }

    public void setExpressno(String expressno) {
        this.expressno = expressno == null ? null : expressno.trim();
    }

    public Integer getExpressid() {
        return expressid;
    }

    public void setExpressid(Integer expressid) {
        this.expressid = expressid;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno == null ? null : tradeno.trim();
    }

    public Byte getDataflag() {
        return dataflag;
    }

    public void setDataflag(Byte dataflag) {
        this.dataflag = dataflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}