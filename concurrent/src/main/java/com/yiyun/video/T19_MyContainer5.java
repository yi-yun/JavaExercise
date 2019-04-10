package com.yiyun.video;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* 曾经的面试题：（淘宝？）
 * 实现一个容器，提供两个方法，add，size
 * 写两个线程，线程1添加10个元素到容器中，线程2实现监控元素的个数，当个数到5个时，线程2给出提示并结束
 */ 
public class T19_MyContainer5 {
    List list=new ArrayList();
    public void add(Object e){
        list.add(e);
    }
    public int size(){
        return list.size();
    }
    public static void main(String[] args) {
        T19_MyContainer5 myContainer5 = new T19_MyContainer5();
        CountDownLatch latch = new CountDownLatch(1);
        new Thread(()->{
            System.out.println("m2 启动...");
            if(myContainer5.size()!=5){
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("m2 结束...");
        }).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        new Thread(()->{
            System.out.println("m1 启动...");
            for (int i = 0; i < 10; i++) {
                myContainer5.add(new Object());
                System.out.println("add " + i);
                if (myContainer5.size() == 5) {
                    try {
                        latch.countDown();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
            System.out.println("m1 结束...");
        }).start();
    }
}
