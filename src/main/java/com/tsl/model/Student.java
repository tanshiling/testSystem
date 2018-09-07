package com.tsl.model;

public class Student {

    private int stid;
    private String stname;
    private String stpassword;
    private int sttel;
    private String staddress;

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public String getStpassword() {
        return stpassword;
    }

    public void setStpassword(String stpassword) {
        this.stpassword = stpassword;
    }

    public int getSttel() {
        return sttel;
    }

    public void setSttel(int sttel) {
        this.sttel = sttel;
    }

    public String getStaddress() {
        return staddress;
    }

    public void setStaddress(String staddress) {
        this.staddress = staddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stid=" + stid +
                ", stname='" + stname + '\'' +
                ", stpassword='" + stpassword + '\'' +
                ", sttel=" + sttel +
                ", staddress='" + staddress + '\'' +
                '}';
    }
}

