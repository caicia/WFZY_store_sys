package com.WFZY.pojo;

public class GoodsWithBLOBs extends Goods {
    private String goodsdesc;

    private String gallery;

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc == null ? null : goodsdesc.trim();
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery == null ? null : gallery.trim();
    }
}