package com.WFZY.pojo;

public class Message {
    private Integer messageid;

    private Integer saccepterid;

    private Integer uaccepterid;

    private Integer ssendid;

    private Integer usendid;

    private String context;

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public Integer getSaccepterid() {
        return saccepterid;
    }

    public void setSaccepterid(Integer saccepterid) {
        this.saccepterid = saccepterid;
    }

    public Integer getUaccepterid() {
        return uaccepterid;
    }

    public void setUaccepterid(Integer uaccepterid) {
        this.uaccepterid = uaccepterid;
    }

    public Integer getSsendid() {
        return ssendid;
    }

    public void setSsendid(Integer ssendid) {
        this.ssendid = ssendid;
    }

    public Integer getUsendid() {
        return usendid;
    }

    public void setUsendid(Integer usendid) {
        this.usendid = usendid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}