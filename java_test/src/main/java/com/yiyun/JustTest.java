package com.yiyun;

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
}
