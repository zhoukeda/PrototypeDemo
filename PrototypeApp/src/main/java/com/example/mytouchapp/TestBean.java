package com.example.mytouchapp;

/**
 * Created by dada on 2017/9/28.
 */

public class TestBean implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public TestBean(String a) {
        this.a = a;
    }

    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
