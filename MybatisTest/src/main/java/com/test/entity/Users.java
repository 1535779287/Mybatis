package com.test.entity;

public class Users {
    private Integer uid;
    private String uName;
    private String uSex;

    public Users() {
    }

    public Users(Integer uid, String uName, String uSex) {
        this.uid = uid;
        this.uName = uName;
        this.uSex = uSex;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }
}
