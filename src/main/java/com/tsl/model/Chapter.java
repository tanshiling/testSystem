package com.tsl.model;

import java.util.List;

public class Chapter {

    private int cno;
    private String cname;

    //一个章节包含多少知识点
    private List<Knowledge> list;

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Knowledge> getList() {
        return list;
    }

    public void setList(List<Knowledge> list) {
        this.list = list;
    }
}
