package com.yiyun.bookart._4;

import com.yiyun.bookart.utils.SleepUtils;

public class ThreadState {
    public static void main(String[] args) {
        new Thread(new TimeWaiting(),"TimeWaitingThread").start();
        new Thread(new Waiting(),"WaitingThread").start();
        
        new Thread(new Blocker(),"BlockedThread-2").start();
        new Thread(new Blocker(),"BlockedThread-2").start();
        
    }
    static class TimeWaiting implements Runnable{

        @Override
        public void run() {
            while (true){
                SleepUtils.second(100);
            }
        }
    }
    static class Waiting implements Runnable{
        @Override
        public void run() {
            while (true){
                synchronized (Waiting.class){
                    try {
                        Waiting.class.wait();
                    }catch (InterruptedException e){
                        
                    }
                }
            }
        }
    }
    static class Blocker implements Runnable{
        @Override
        public void run() {
            synchronized (Blocker.class){
                while (true){
                    SleepUtils.second(100);
                }
            }
        }
    }
}
