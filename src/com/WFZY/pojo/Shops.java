package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Shops {
    private Integer shopid;

    private Integer shopclassifyid;

    private String shopsn;

    private Integer userid;

    private Byte isself;

    private String shopname;

    private String shopkeeper;

    private String shoptelephone;

    private String shopimg;

    private String shopwangwang;

    private String shopaddress;

    private Integer bankid;

    private Byte isinvoice;

    private String invoiceremarks;

    private Date servicestarttime;

    private Date serviceendtime;

    private Byte shopative;

    private Byte shopstatus;

    private String statusdesc;

    private Byte dataflag;

    private Date createtime;

    private BigDecimal shopmoney;

    private BigDecimal lockmoney;

    private Integer nosettledordernum;

    private String shopapplyreason;

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getShopclassifyid() {
        return shopclassifyid;
    }

    public void setShopclassifyid(Integer shopclassifyid) {
        this.shopclassifyid = shopclassifyid;
    }

    public String getShopsn() {
        return shopsn;
    }

    public void setShopsn(String shopsn) {
        this.shopsn = shopsn == null ? null : shopsn.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getIsself() {
        return isself;
    }

    public void setIsself(Byte isself) {
        this.isself = isself;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getShopkeeper() {
        return shopkeeper;
    }

    public void setShopkeeper(String shopkeeper) {
        this.shopkeeper = shopkeeper == null ? null : shopkeeper.trim();
    }

    public String getShoptelephone() {
        return shoptelephone;
    }

    public void setShoptelephone(String shoptelephone) {
        this.shoptelephone = shoptelephone == null ? null : shoptelephone.trim();
    }

    public String getShopimg() {
        return shopimg;
    }

    public void setShopimg(String shopimg) {
        this.shopimg = shopimg == null ? null : shopimg.trim();
    }

    public String getShopwangwang() {
        return shopwangwang;
    }

    public void setShopwangwang(String shopwangwang) {
        this.shopwangwang = shopwangwang == null ? null : shopwangwang.trim();
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress == null ? null : shopaddress.trim();
    }

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public Byte getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(Byte isinvoice) {
        this.isinvoice = isinvoice;
    }

    public String getInvoiceremarks() {
        return invoiceremarks;
    }

    public void setInvoiceremarks(String invoiceremarks) {
        this.invoiceremarks = invoiceremarks == null ? null : invoiceremarks.trim();
    }

    public Date getServicestarttime() {
        return servicestarttime;
    }

    public void setServicestarttime(Date servicestarttime) {
        this.servicestarttime = servicestarttime;
    }

    public Date getServiceendtime() {
        return serviceendtime;
    }

    public void setServiceendtime(Date serviceendtime) {
        this.serviceendtime = serviceendtime;
    }

    public Byte getShopative() {
        return shopative;
    }

    public void setShopative(Byte shopative) {
        this.shopative = shopative;
    }

    public Byte getShopstatus() {
        return shopstatus;
    }

    public void setShopstatus(Byte shopstatus) {
        this.shopstatus = shopstatus;
    }

    public String getStatusdesc() {
        return statusdesc;
    }

    public void setStatusdesc(String statusdesc) {
        this.statusdesc = statusdesc == null ? null : statusdesc.trim();
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

    public BigDecimal getShopmoney() {
        return shopmoney;
    }

    public void setShopmoney(BigDecimal shopmoney) {
        this.shopmoney = shopmoney;
    }

    public BigDecimal getLockmoney() {
        return lockmoney;
    }

    public void setLockmoney(BigDecimal lockmoney) {
        this.lockmoney = lockmoney;
    }

    public Integer getNosettledordernum() {
        return nosettledordernum;
    }

    public void setNosettledordernum(Integer nosettledordernum) {
        this.nosettledordernum = nosettledordernum;
    }

    public String getShopapplyreason() {
        return shopapplyreason;
    }

    public void setShopapplyreason(String shopapplyreason) {
        this.shopapplyreason = shopapplyreason == null ? null : shopapplyreason.trim();
    }
}