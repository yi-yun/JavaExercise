package com.yiyun.other;

import org.junit.Test;

public class TestMyConcurrent {
    @Test
    public void funMABQ() throws InterruptedException{
        final MyArrayBlockingQueue<String> myArrayBlockingQueue 
            = new MyArrayBlockingQueue<>(400);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                myArrayBlockingQueue.put(i + "");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                myArrayBlockingQueue.put(i + "");
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                myArrayBlockingQueue.put(i + "");
            }
        });
        Thread thread4 = new Thread(() -> {
            System.out.println("===="+myArrayBlockingQueue.get()+"====");
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        System.out.println(myArrayBlockingQueue.size());
    }
}
