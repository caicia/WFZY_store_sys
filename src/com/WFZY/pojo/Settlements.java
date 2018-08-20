package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Settlements {
    private Integer settlementid;

    private String settlementno;

    private Byte settlementtype;

    private Integer shopid;

    private String accname;

    private String accno;

    private String accuser;

    private String areaname;

    private BigDecimal settlementmoney;

    private Byte settlementstatus;

    private Date settlementtime;

    private String remarks;

    private Date createtime;

    public Integer getSettlementid() {
        return settlementid;
    }

    public void setSettlementid(Integer settlementid) {
        this.settlementid = settlementid;
    }

    public String getSettlementno() {
        return settlementno;
    }

    public void setSettlementno(String settlementno) {
        this.settlementno = settlementno == null ? null : settlementno.trim();
    }

    public Byte getSettlementtype() {
        return settlementtype;
    }

    public void setSettlementtype(Byte settlementtype) {
        this.settlementtype = settlementtype;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname == null ? null : accname.trim();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public String getAccuser() {
        return accuser;
    }

    public void setAccuser(String accuser) {
        this.accuser = accuser == null ? null : accuser.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public BigDecimal getSettlementmoney() {
        return settlementmoney;
    }

    public void setSettlementmoney(BigDecimal settlementmoney) {
        this.settlementmoney = settlementmoney;
    }

    public Byte getSettlementstatus() {
        return settlementstatus;
    }

    public void setSettlementstatus(Byte settlementstatus) {
        this.settlementstatus = settlementstatus;
    }

    public Date getSettlementtime() {
        return settlementtime;
    }

    public void setSettlementtime(Date settlementtime) {
        this.settlementtime = settlementtime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}