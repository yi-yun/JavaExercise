package com.yiyun.java8.chap3;

@FunctionalInterface
public interface TestFunAnno {
    void fun();
//    void fun2();
    default void fun3(){
        System.out.println("test……");
    }
}
