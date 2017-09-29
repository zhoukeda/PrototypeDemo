package com.example.mytouchapp;

/**
 * Created by dada on 2017/9/28.
 */

public class CloneBean implements Cloneable{
    private String str;
    private TestBean testBean;


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public TestBean getTestBean() {
        return testBean;
    }

    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneBean doc = (CloneBean) super.clone();
        //如果要深度拷贝
//        doc.str = this.str;
//        doc.testBean = (TestBean) this.testBean.clone();
        return doc;
    }
}

