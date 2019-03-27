package com.yiyun.jvm._12;

public class VolatileTest {
    public static volatile int race=0;
    public static void increase(){
        race++;
    }
    public static final int THREADS_COUNTS=20;

    public static void main(String[] args) {
        Thread[] threads=new Thread[THREADS_COUNTS];
        for (int i = 0; i <THREADS_COUNTS ; i++) {
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <100 ; j++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(race);
    }
}
