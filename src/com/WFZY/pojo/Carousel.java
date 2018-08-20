package com.WFZY.pojo;

import java.util.Date;

public class Carousel {
    private Integer carouselid;

    private String title;

    private Date createtime;

    private Date starttime;

    private Date endtime;

    private Integer carouselType;

    private Byte carouselstatus;

    public Integer getCarouselid() {
        return carouselid;
    }

    public void setCarouselid(Integer carouselid) {
        this.carouselid = carouselid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getCarouselType() {
        return carouselType;
    }

    public void setCarouselType(Integer carouselType) {
        this.carouselType = carouselType;
    }

    public Byte getCarouselstatus() {
        return carouselstatus;
    }

    public void setCarouselstatus(Byte carouselstatus) {
        this.carouselstatus = carouselstatus;
    }
}