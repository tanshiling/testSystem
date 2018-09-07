package com.tsl.model;

public class Application {

    private int aid;
    private int kno;
    private String acontent;
    private String apicture;
    private String abasis;
    private String aanswer;
    private String aanswerp;
    private int alevel;

    private Knowledge knowledge;

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getKno() {
        return kno;
    }

    public void setKno(int kno) {
        this.kno = kno;
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent;
    }

    public String getApicture() {
        return apicture;
    }

    public void setApicture(String apicture) {
        this.apicture = apicture;
    }

    public String getAbasis() {
        return abasis;
    }

    public void setAbasis(String abasis) {
        this.abasis = abasis;
    }

    public String getAanswer() {
        return aanswer;
    }

    public void setAanswer(String aanswer) {
        this.aanswer = aanswer;
    }

    public String getAanswerp() {
        return aanswerp;
    }

    public void setAanswerp(String aanswerp) {
        this.aanswerp = aanswerp;
    }

    public int getAlevel() {
        return alevel;
    }

    public void setAlevel(int alevel) {
        this.alevel = alevel;
    }
}
