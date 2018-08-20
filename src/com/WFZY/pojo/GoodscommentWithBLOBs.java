package com.WFZY.pojo;

public class GoodscommentWithBLOBs extends Goodscomment {
    private String content;

    private String shopreply;

    private String images;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getShopreply() {
        return shopreply;
    }

    public void setShopreply(String shopreply) {
        this.shopreply = shopreply == null ? null : shopreply.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }
}