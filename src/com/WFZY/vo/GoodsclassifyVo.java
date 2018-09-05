package com.WFZY.vo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.WFZY.pojo.Goodsclassify;

public class GoodsclassifyVo {
	
	private Integer goodsclassifyid;

    private Integer goodsclassifyparentid;
    
    private Integer goodsclassifygrade;

	private String goodsclassifyname;
	
	private String goodsclassifyparentname;

	private Integer goodsclassifysort;

    private Byte dataflag;

    private Date createtime;
	
	private Integer childcount;

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
		this.goodsclassifyname = goodsclassifyname;
	}

	public String getGoodsclassifyparentname() {
		return goodsclassifyparentname;
	}

	public void setGoodsclassifyparentname(String goodsclassifyparentname) {
		this.goodsclassifyparentname = goodsclassifyparentname;
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

	public Integer getChildcount() {
		return childcount;
	}

	public void setChildcount(Integer childcount) {
		this.childcount = childcount;
	}

	@Override
	public String toString() {
		return "GoodsclassifyVo [goodsclassifyid=" + goodsclassifyid + ", goodsclassifyparentid="
				+ goodsclassifyparentid + ", goodsclassifygrade=" + goodsclassifygrade + ", goodsclassifyname="
				+ goodsclassifyname + ", goodsclassifyparentname=" + goodsclassifyparentname + ", goodsclassifysort="
				+ goodsclassifysort + ", dataflag=" + dataflag + ", createtime=" + createtime + ", childcount="
				+ childcount + "]";
	}
	
    
    

	

	
}