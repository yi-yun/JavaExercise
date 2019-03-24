package com.yiyun.jvm._3;

import org.junit.Test;

public class ReferCountGC {
    public Object instance=null;
    private static final int _1MB=1024*1024;
    private byte[] bigSize=new byte[2*_1MB];
    
    public static void testGC(){
        ReferCountGC referCountGCA = new ReferCountGC();
        ReferCountGC referCountGCB = new ReferCountGC();
        referCountGCA.instance=referCountGCB;
        referCountGCB.instance=referCountGCA;
        referCountGCA=null;
        referCountGCB=null;
        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}
