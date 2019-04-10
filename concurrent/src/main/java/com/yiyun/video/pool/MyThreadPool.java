package com.yiyun.video.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5); //execute submit
        for (int i = 0; i < 6; i++) {
            service.execute(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }
    }
}
