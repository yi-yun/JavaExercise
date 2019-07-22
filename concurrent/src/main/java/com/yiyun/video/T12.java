package com.yiyun.video;

import java.util.concurrent.TimeUnit;

public class T12 {
    volatile boolean running = true; //对比一下有无volatile的情况下，整个程序运行结果的区别

    void m() {
        System.out.println("m start");
        while (running) {
			/*
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
        }
        System.out.println("m end!");
    }

    public static void main(String[] args) {
        T12 t12 = new T12();

        new Thread(t12::m, "t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t12.running = false;

    }
}
