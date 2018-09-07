package com.tsl.vo;

public class InsertQuesVo {

    private int iid;
    private String kname;
    private String icontent;
    private String ianswer;
    private int ilevel;

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
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
