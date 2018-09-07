package com.tsl.model;

public class JudgeQues {

    private int jid;
    private int kno;
    private String jcontent;
    private int janswer;
    private int jlevel;

    private Knowledge knowledge;

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public int getKno() {
        return kno;
    }

    public void setKno(int kno) {
        this.kno = kno;
    }

    public String getJcontent() {
        return jcontent;
    }

    public void setJcontent(String jcontent) {
        this.jcontent = jcontent;
    }

    public int getJanswer() {
        return janswer;
    }

    public void setJanswer(int janswer) {
        this.janswer = janswer;
    }

    public int getJlevel() {
        return jlevel;
    }

    public void setJlevel(int jlevel) {
        this.jlevel = jlevel;
    }

}
