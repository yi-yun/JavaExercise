package com.yiyun.java8.chap2;

import com.yiyun.java8.chap1.Apple;

public class PrettyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple a) {
        return a.toString();
    }
}
