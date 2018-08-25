package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer orderid;

    private String orderno;

    private Integer userid;

    private Integer shopid;

    private String shopname;

    private Integer goodsid;

    private String goodsname;

    private Integer goodscount;

    private Integer goodsprice;

    private String goodsremarks;

    private String orderremarks;

    private Byte orderstatus;

    private BigDecimal goodsmoney;

    private Byte delivertype;

    private BigDecimal delivermoney;

    private BigDecimal totalmoney;

    private BigDecimal realtotalmoney;

    private Byte paytype;

    private Byte ispay;

    private String receivedname;

    private String receivedaddress;

    private String receivedphone;

    private Byte isinvoice;

    private Byte isrefund;

    private Byte isappraise;

    private String cancelreason;

    private String rejectreason;

    private Byte isclosed;

    private Byte settlementid;

    private Date receivetime;

    private Date deliverytime;

    private String expressno;

    private Integer expressid;

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

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }

    public Integer getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Integer goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodsremarks() {
        return goodsremarks;
    }

    public void setGoodsremarks(String goodsremarks) {
        this.goodsremarks = goodsremarks == null ? null : goodsremarks.trim();
    }

    public String getOrderremarks() {
        return orderremarks;
    }

    public void setOrderremarks(String orderremarks) {
        this.orderremarks = orderremarks == null ? null : orderremarks.trim();
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

    public Byte getIspay() {
        return ispay;
    }

    public void setIspay(Byte ispay) {
        this.ispay = ispay;
    }

    public String getReceivedname() {
        return receivedname;
    }

    public void setReceivedname(String receivedname) {
        this.receivedname = receivedname == null ? null : receivedname.trim();
    }

    public String getReceivedaddress() {
        return receivedaddress;
    }

    public void setReceivedaddress(String receivedaddress) {
        this.receivedaddress = receivedaddress == null ? null : receivedaddress.trim();
    }

    public String getReceivedphone() {
        return receivedphone;
    }

    public void setReceivedphone(String receivedphone) {
        this.receivedphone = receivedphone == null ? null : receivedphone.trim();
    }

    public Byte getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(Byte isinvoice) {
        this.isinvoice = isinvoice;
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

    public String getCancelreason() {
        return cancelreason;
    }

    public void setCancelreason(String cancelreason) {
        this.cancelreason = cancelreason == null ? null : cancelreason.trim();
    }

    public String getRejectreason() {
        return rejectreason;
    }

    public void setRejectreason(String rejectreason) {
        this.rejectreason = rejectreason == null ? null : rejectreason.trim();
    }

    public Byte getIsclosed() {
        return isclosed;
    }

    public void setIsclosed(Byte isclosed) {
        this.isclosed = isclosed;
    }

    public Byte getSettlementid() {
        return settlementid;
    }

    public void setSettlementid(Byte settlementid) {
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