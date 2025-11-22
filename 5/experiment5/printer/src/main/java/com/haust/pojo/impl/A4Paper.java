package com.haust.pojo.impl;

import com.haust.pojo.Paper;

public class A4Paper implements Paper {
    private int rows;//24
    private int cols;//12

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    @Override
    public void putChar(String str) {
        System.out.println(this.rows+";"+this.cols);
        System.out.println("这是在 A4 纸上输出的内容");
        System.out.println(str);
    }
}
