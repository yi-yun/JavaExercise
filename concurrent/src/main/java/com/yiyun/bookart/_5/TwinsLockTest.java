package com.yiyun.bookart._5;

import com.yiyun.bookart.utils.SleepUtils;
import org.junit.Test;

import java.util.concurrent.locks.Lock;

public class TwinsLockTest {
    @Test
    public void test(){
        final Lock twinsLock = new TwinsLock();
        class Worker extends Thread{
            @Override
            public void run() {
                while (true){
                    twinsLock.lock();
                    try {
                        SleepUtils.second(1);
                        System.out.println(Thread.currentThread().getName());
                        SleepUtils.second(1);
                    }finally {
                        twinsLock.unlock();
                    }
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            Worker worker = new Worker();
            worker.setDaemon(true);
            worker.start();
        }
        for (int i = 0; i < 10; i++) {
            SleepUtils.second(1);
            System.out.println();
        }
    }
}
