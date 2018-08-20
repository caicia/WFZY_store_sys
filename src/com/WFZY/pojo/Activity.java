package com.WFZY.pojo;

import java.util.Date;

public class Activity {
    private Integer activityId;

    private String title;

    private Integer activitytype;

    private Date createtime;

    private Date starttime;

    private Date endtime;

    private Byte activitystatus;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(Integer activitytype) {
        this.activitytype = activitytype;
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

    public Byte getActivitystatus() {
        return activitystatus;
    }

    public void setActivitystatus(Byte activitystatus) {
        this.activitystatus = activitystatus;
    }
}