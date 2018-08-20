package com.WFZY.pojo;

import java.util.Date;

public class Users {
    private Integer userid;

    private String loginname;

    private String loginpwd;

    private Byte usertype;

    private Byte usersex;

    private String username;

    private String userrealname;

    private Date userbrithday;

    private String userphoto;

    private String usergrade;

    private String userqq;

    private String userphone;

    private String useremail;

    private String usersignature;

    private String userremark;

    private String userdomicile;

    private String loginlastip;

    private Date loginlasttime;

    private Byte userstatus;

    private Byte userdataflag;

    private String loginnumber;

    private Date createtime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public Byte getUsersex() {
        return usersex;
    }

    public void setUsersex(Byte usersex) {
        this.usersex = usersex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname == null ? null : userrealname.trim();
    }

    public Date getUserbrithday() {
        return userbrithday;
    }

    public void setUserbrithday(Date userbrithday) {
        this.userbrithday = userbrithday;
    }

    public String getUserphoto() {
        return userphoto;
    }

    public void setUserphoto(String userphoto) {
        this.userphoto = userphoto == null ? null : userphoto.trim();
    }

    public String getUsergrade() {
        return usergrade;
    }

    public void setUsergrade(String usergrade) {
        this.usergrade = usergrade == null ? null : usergrade.trim();
    }

    public String getUserqq() {
        return userqq;
    }

    public void setUserqq(String userqq) {
        this.userqq = userqq == null ? null : userqq.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUsersignature() {
        return usersignature;
    }

    public void setUsersignature(String usersignature) {
        this.usersignature = usersignature == null ? null : usersignature.trim();
    }

    public String getUserremark() {
        return userremark;
    }

    public void setUserremark(String userremark) {
        this.userremark = userremark == null ? null : userremark.trim();
    }

    public String getUserdomicile() {
        return userdomicile;
    }

    public void setUserdomicile(String userdomicile) {
        this.userdomicile = userdomicile == null ? null : userdomicile.trim();
    }

    public String getLoginlastip() {
        return loginlastip;
    }

    public void setLoginlastip(String loginlastip) {
        this.loginlastip = loginlastip == null ? null : loginlastip.trim();
    }

    public Date getLoginlasttime() {
        return loginlasttime;
    }

    public void setLoginlasttime(Date loginlasttime) {
        this.loginlasttime = loginlasttime;
    }

    public Byte getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Byte userstatus) {
        this.userstatus = userstatus;
    }

    public Byte getUserdataflag() {
        return userdataflag;
    }

    public void setUserdataflag(Byte userdataflag) {
        this.userdataflag = userdataflag;
    }

    public String getLoginnumber() {
        return loginnumber;
    }

    public void setLoginnumber(String loginnumber) {
        this.loginnumber = loginnumber == null ? null : loginnumber.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}