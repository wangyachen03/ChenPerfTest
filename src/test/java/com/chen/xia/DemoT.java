package com.chen.xia;

import org.testng.annotations.Test;

import java.util.UUID;

public class DemoT {
    @Test
    public void test(){
        System.out.println("wangyanchen!");
    }

    @Test
    public void test01(){
        String uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid);
    }
}