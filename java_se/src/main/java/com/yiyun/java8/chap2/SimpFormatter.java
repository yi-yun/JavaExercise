package com.yiyun.java8.chap2;

import com.yiyun.java8.chap1.Apple;

public class SimpFormatter implements AppleFormatter {
    @Override
    public String accept(Apple a) {
        return "An apple of "+a.getWeight()+"g";
    }
}
