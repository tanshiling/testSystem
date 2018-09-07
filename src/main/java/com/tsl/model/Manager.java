package com.tsl.model;

public class Manager {
    private int mid;
    private String mname;
    private String mpassword;
    private int mtel;
    private String maddress;
    private int mm;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getMtel() {
        return mtel;
    }

    public void setMtel(int mtel) {
        this.mtel = mtel;
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mpassword='" + mpassword + '\'' +
                ", mm=" + mm +
                '}';
    }
}
