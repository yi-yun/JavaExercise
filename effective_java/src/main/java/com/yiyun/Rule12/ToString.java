package com.yiyun.Rule12;

import com.google.auto.value.AutoValue;

@AutoValue
public class ToString {
    private int num;
    private String name;
    
    public static void main(String[] args) {
        ToString toString = new ToString();
        System.out.println("toString = " + toString);
    }


}
