package com.WFZY.pojo;

import java.util.Date;

public class Shopclassify {
    private Integer shopclassifyid;

    private Integer parentid;

    private String shopclassifyname;

    private Integer shopclassifysort;

    private Byte dataflag;

    private Date createtime;

    public Integer getShopclassifyid() {
        return shopclassifyid;
    }

    public void setShopclassifyid(Integer shopclassifyid) {
        this.shopclassifyid = shopclassifyid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getShopclassifyname() {
        return shopclassifyname;
    }

    public void setShopclassifyname(String shopclassifyname) {
        this.shopclassifyname = shopclassifyname == null ? null : shopclassifyname.trim();
    }

    public Integer getShopclassifysort() {
        return shopclassifysort;
    }

    public void setShopclassifysort(Integer shopclassifysort) {
        this.shopclassifysort = shopclassifysort;
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