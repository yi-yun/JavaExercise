package com.yiyun.exam;

import java.sql.Timestamp;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @class: SellTickets
 * @description: 买票卖票
 * @author: yi-yun
 * @create: 2019-07-22 22:46
 **/

public class TicketWindow implements Runnable {
    private int ticket = 100;

    ReentrantLock rt = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            rt.lock();
            if (ticket <= 0) {
                break;
            }
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            System.out.println(timestamp + "------------" + Thread.currentThread().getName() + "卖出第" + ticket + "张火车票");
            Random random = new Random();
            try {
                Thread.sleep(1000 * random.nextInt(1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            rt.unlock();
        }
    }

    public static void main(String[] args) {
        TicketWindow tw = new TicketWindow();
        Thread t1 = new Thread(tw, "一号窗口");
        Thread t2 = new Thread(tw, "二号窗口");
        Thread t3 = new Thread(tw, "三号窗口");
        Thread t4 = new Thread(tw, "四号窗口");
        Thread t5 = new Thread(tw, "五号窗口");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}

