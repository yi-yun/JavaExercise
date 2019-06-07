package com.yiyun;

import org.junit.Test;

public class JustTest {
    {
        System.out.println("a.....");
    }

    public JustTest() {
        System.out.println("b.....");
    }

    static {
        System.out.println("c.....");
    }

    public static void main(String[] args) {
        JustTest justTest = new JustTest();
        System.out.println("-----------------------");
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println("i = " + i);
    }

    @Test
    public void fun1() {
        long i = 100_000_000_000L;
        float v = 9.1f;
        float v1 = 9.000f;
        System.out.println(v % 1 == 0);
        System.out.println(v1 % 1 == 0);
    }

    @Test
    public void fun() {
        int i = ((6 - 3) >> 1) + 3;
        System.out.println("i = " + i);
    }

    //滑稽的大佬
    @Test
    public void fun2() {
        System.out.println( 1==1);
        System.out.println(129 == 129);
    }

}
