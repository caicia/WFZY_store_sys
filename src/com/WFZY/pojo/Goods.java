package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Integer goodsid;

    private Integer shopid;

    private Integer goodsclassifyid;

    private String goodssn;

    private String productno;

    private String goodsname;

    private String goodsimg;

    private Byte goodsstatus;

    private Date saletime;

    private Integer visitnum;

    private Integer appraisenum;

    private BigDecimal marketprice;

    private BigDecimal shopprice;

    private Integer salenum;

    private Integer goodsstock;

    private Byte issale;

    private Byte isbest;

    private Byte ishot;

    private Byte isnew;

    private Byte isrecom;

    private Byte dataflag;

    private Date createtime;

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

    public Integer getGoodsclassifyid() {
        return goodsclassifyid;
    }

    public void setGoodsclassifyid(Integer goodsclassifyid) {
        this.goodsclassifyid = goodsclassifyid;
    }

    public String getGoodssn() {
        return goodssn;
    }

    public void setGoodssn(String goodssn) {
        this.goodssn = goodssn == null ? null : goodssn.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
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

    public Byte getGoodsstatus() {
        return goodsstatus;
    }

    public void setGoodsstatus(Byte goodsstatus) {
        this.goodsstatus = goodsstatus;
    }

    public Date getSaletime() {
        return saletime;
    }

    public void setSaletime(Date saletime) {
        this.saletime = saletime;
    }

    public Integer getVisitnum() {
        return visitnum;
    }

    public void setVisitnum(Integer visitnum) {
        this.visitnum = visitnum;
    }

    public Integer getAppraisenum() {
        return appraisenum;
    }

    public void setAppraisenum(Integer appraisenum) {
        this.appraisenum = appraisenum;
    }

    public BigDecimal getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(BigDecimal marketprice) {
        this.marketprice = marketprice;
    }

    public BigDecimal getShopprice() {
        return shopprice;
    }

    public void setShopprice(BigDecimal shopprice) {
        this.shopprice = shopprice;
    }

    public Integer getSalenum() {
        return salenum;
    }

    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    public Integer getGoodsstock() {
        return goodsstock;
    }

    public void setGoodsstock(Integer goodsstock) {
        this.goodsstock = goodsstock;
    }

    public Byte getIssale() {
        return issale;
    }

    public void setIssale(Byte issale) {
        this.issale = issale;
    }

    public Byte getIsbest() {
        return isbest;
    }

    public void setIsbest(Byte isbest) {
        this.isbest = isbest;
    }

    public Byte getIshot() {
        return ishot;
    }

    public void setIshot(Byte ishot) {
        this.ishot = ishot;
    }

    public Byte getIsnew() {
        return isnew;
    }

    public void setIsnew(Byte isnew) {
        this.isnew = isnew;
    }

    public Byte getIsrecom() {
        return isrecom;
    }

    public void setIsrecom(Byte isrecom) {
        this.isrecom = isrecom;
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