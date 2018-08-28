package com.WFZY.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Goodsactivity extends GoodsactivityKey {
    private Byte goodstype;

    private Date createtime;

    private Date endtime;

    private Integer storknum;

    private Integer salenum;

    private Byte ishandle;

    private BigDecimal applyprice;
    
    private String goodsname;

    public Byte getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Byte goodstype) {
        this.goodstype = goodstype;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getStorknum() {
        return storknum;
    }

    public void setStorknum(Integer storknum) {
        this.storknum = storknum;
    }

    public Integer getSalenum() {
        return salenum;
    }

    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    public Byte getIshandle() {
        return ishandle;
    }

    public void setIshandle(Byte ishandle) {
        this.ishandle = ishandle;
    }

    public BigDecimal getApplyprice() {
        return applyprice;
    }

    public void setApplyprice(BigDecimal applyprice) {
        this.applyprice = applyprice;
    }
    
    public String getgoodsName() {
		// TODO Auto-generated method stub
		return goodsname;
	}
    
	public void setgoodsName(String goodsname) {
		// TODO Auto-generated method stub
		this.goodsname = goodsname == null ? null : goodsname.trim();
	}
}