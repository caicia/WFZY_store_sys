package com.WFZY.pojo;

import java.util.Date;

public class Goodsclassify {
    private Integer goodsclassifyid;

    private Integer goodsclassifyparentid;

    private Integer goodsclassifygrade;

    private String goodsclassifyname;

    private String goodsclassifyparentname;

    private Integer goodsclassifysort;

    private Byte dataflag;

    private Date createtime;

    public Integer getGoodsclassifyid() {
        return goodsclassifyid;
    }

    public void setGoodsclassifyid(Integer goodsclassifyid) {
        this.goodsclassifyid = goodsclassifyid;
    }

    public Integer getGoodsclassifyparentid() {
        return goodsclassifyparentid;
    }

    public void setGoodsclassifyparentid(Integer goodsclassifyparentid) {
        this.goodsclassifyparentid = goodsclassifyparentid;
    }

    public Integer getGoodsclassifygrade() {
        return goodsclassifygrade;
    }

    public void setGoodsclassifygrade(Integer goodsclassifygrade) {
        this.goodsclassifygrade = goodsclassifygrade;
    }

    public String getGoodsclassifyname() {
        return goodsclassifyname;
    }

    public void setGoodsclassifyname(String goodsclassifyname) {
        this.goodsclassifyname = goodsclassifyname == null ? null : goodsclassifyname.trim();
    }

    public String getGoodsclassifyparentname() {
        return goodsclassifyparentname;
    }

    public void setGoodsclassifyparentname(String goodsclassifyparentname) {
        this.goodsclassifyparentname = goodsclassifyparentname == null ? null : goodsclassifyparentname.trim();
    }

    public Integer getGoodsclassifysort() {
        return goodsclassifysort;
    }

    public void setGoodsclassifysort(Integer goodsclassifysort) {
        this.goodsclassifysort = goodsclassifysort;
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