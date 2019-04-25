package com.yiyun.jvm._4;

import java.util.ArrayList;

public class TestJConsole {
    static class OOMObject{
        public byte[] placeholder=new byte[64*1024];
    }
    public static void fillHeap(int num) throws InterruptedException{
        ArrayList<OOMObject> oomObjects = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            //wait let obvious to jconsole
            Thread.sleep(50);
            oomObjects.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws Exception{
        fillHeap(1000);
    }
}