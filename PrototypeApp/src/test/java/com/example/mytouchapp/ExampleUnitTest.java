package com.example.mytouchapp;

import android.util.Log;

import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        CloneBean cloneBean = new CloneBean();
        cloneBean.setStr("aaa");
        cloneBean.setTestBean(new TestBean("bbb"));
        try {
            CloneBean cloneBean2 = (CloneBean) cloneBean.clone();
            System.out.println(cloneBean2.getStr()+"---"+cloneBean2.getTestBean().getA());
            System.out.println(cloneBean2.toString()+"---"+cloneBean.toString());
            System.out.println(cloneBean2.getTestBean().toString()+"---"+cloneBean.getTestBean().toString());
            cloneBean.setStr("ccc");
            cloneBean.getTestBean().setA("ddd");
            System.out.println(cloneBean2.getStr()+"---"+cloneBean.getStr());
            System.out.println(cloneBean2.getTestBean().getA()+"---"+cloneBean.getTestBean().getA());
            System.out.println("==========================================================");
            CloneBean cloneBean3 = cloneBean;
            System.out.println(cloneBean3.getStr()+"---"+cloneBean2.getTestBean().getA());
            System.out.println(cloneBean3.toString()+"---"+cloneBean.toString());
            System.out.println(cloneBean3.getTestBean().toString()+"---"+cloneBean.getTestBean().toString());
            cloneBean.setStr("eee");
            cloneBean.getTestBean().setA("fff");
            System.out.println(cloneBean3.getStr()+"---"+cloneBean.getStr());
            System.out.println(cloneBean3.getTestBean().getA()+"---"+cloneBean.getTestBean().getA());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}