package com.WFZY.pojo;

import java.util.Date;

public class Admins {
    private Integer adminid;

    private String adminphone;

    private String adminpwd;

    private String adminemail;

    private Byte admintype;

    private Byte adminstatus;

    private Byte issuperadmin;

    private Date logintime;

    private String loginip;

    private Date createtime;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminphone() {
        return adminphone;
    }

    public void setAdminphone(String adminphone) {
        this.adminphone = adminphone == null ? null : adminphone.trim();
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }

    public String getAdminemail() {
        return adminemail;
    }

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail == null ? null : adminemail.trim();
    }

    public Byte getAdmintype() {
        return admintype;
    }

    public void setAdmintype(Byte admintype) {
        this.admintype = admintype;
    }

    public Byte getAdminstatus() {
        return adminstatus;
    }

    public void setAdminstatus(Byte adminstatus) {
        this.adminstatus = adminstatus;
    }

    public Byte getIssuperadmin() {
        return issuperadmin;
    }

    public void setIssuperadmin(Byte issuperadmin) {
        this.issuperadmin = issuperadmin;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}