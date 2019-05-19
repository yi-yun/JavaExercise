package com.yiyun;

public class TestEnum {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(SingleEnumTest.SingleFactory.getInstance().hashCode());
            }).start();
        }
    }
}
