package com.yiyun.jvm._3;

public class _6_BigObject {private static final int _1MB=1024*1024;
    //-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
    //-XX:PretenureSizeThreshold=3145728
    //only Serial ParNew
    public static void main(String[] args) {
        byte[] allocation;
        allocation=new byte[4*_1MB];

    }
    
}
