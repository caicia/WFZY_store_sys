package com.WFZY.pojo;

public class Shoppingcarts {
    private Integer shoppingcarts;

    private Integer userid;

    private Byte ischeck;

    private Integer goodsid;

    private Integer cartnum;

    private String goodsremark;

    private Integer shopid;

    public Integer getShoppingcarts() {
        return shoppingcarts;
    }

    public void setShoppingcarts(Integer shoppingcarts) {
        this.shoppingcarts = shoppingcarts;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getIscheck() {
        return ischeck;
    }

    public void setIscheck(Byte ischeck) {
        this.ischeck = ischeck;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getCartnum() {
        return cartnum;
    }

    public void setCartnum(Integer cartnum) {
        this.cartnum = cartnum;
    }

    public String getGoodsremark() {
        return goodsremark;
    }

    public void setGoodsremark(String goodsremark) {
        this.goodsremark = goodsremark == null ? null : goodsremark.trim();
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }
}