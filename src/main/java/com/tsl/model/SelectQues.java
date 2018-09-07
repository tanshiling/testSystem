package com.tsl.model;

public class SelectQues {

    private int sid;
    private int kno;
    private String scontent;
    private String sa;
    private String sb;
    private String sc;
    private String sd;
    private String sanswer;
    private int slevel;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getKno() {
        return kno;
    }

    public void setKno(int kno) {
        this.kno = kno;
    }

    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent;
    }

    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa;
    }

    public String getSb() {
        return sb;
    }

    public void setSb(String sb) {
        this.sb = sb;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getSanswer() {
        return sanswer;
    }

    public void setSanswer(String sanswer) {
        this.sanswer = sanswer;
    }

    public int getSlevel() {
        return slevel;
    }

    public void setSlevel(int slevel) {
        this.slevel = slevel;
    }

    @Override
    public String toString() {
        return "SelectQues{" +
                "sid=" + sid +
                ", kno=" + kno +
                ", scontent='" + scontent + '\'' +
                ", sa='" + sa + '\'' +
                ", sb='" + sb + '\'' +
                ", sc='" + sc + '\'' +
                ", sd='" + sd + '\'' +
                ", sanswer='" + sanswer + '\'' +
                ", slevel=" + slevel +
                '}';
    }
}
