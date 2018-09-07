package com.tsl.model;

public class InsertQues {

    private int iid;
    private int kno;
    private String icontent;
    private String ianswer;
    private int ilevel;

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public int getKno() {
        return kno;
    }

    public void setKno(int kno) {
        this.kno = kno;
    }

    public String getIcontent() {
        return icontent;
    }

    public void setIcontent(String icontent) {
        this.icontent = icontent;
    }

    public String getIanswer() {
        return ianswer;
    }

    public void setIanswer(String ianswer) {
        this.ianswer = ianswer;
    }

    public int getIlevel() {
        return ilevel;
    }

    public void setIlevel(int ilevel) {
        this.ilevel = ilevel;
    }

    @Override
    public String toString() {
        return "InsertQues{" +
                "iid=" + iid +
                ", icontent='" + icontent + '\'' +
                ", ianswer='" + ianswer + '\'' +
                ", ilevel=" + ilevel +
                '}';
    }
}
