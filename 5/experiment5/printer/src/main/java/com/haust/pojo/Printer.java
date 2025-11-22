package com.haust.pojo;

public class Printer {
    private Ink ink;
    private Paper paper;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(String str) {
        System.out.println(ink.getColor());
        paper.putChar(str);
    }
}
