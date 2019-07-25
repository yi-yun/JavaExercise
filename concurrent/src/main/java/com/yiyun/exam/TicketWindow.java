package com.yiyun.exam;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @class: SellTickets
 * @description: 买票卖票
 * @author: yi-yun
 * @create: 2019-07-22 22:46
 **/

public class TicketWindow implements Runnable {
    private int ticket = 20;

    ReentrantLock rt = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            rt.lock();
            if (ticket <= 0) {
                break;
            }
            ticket--;
            Random random = new Random();
            try {
                Thread.sleep(1000 * random.nextInt(3));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖出一张火车票,还剩" + ticket + "张");
            rt.unlock();
        }
    }

    public static void main(String[] args) {
        TicketWindow tw = new TicketWindow();
        Thread t1 = new Thread(tw, "一号窗口");
        Thread t2 = new Thread(tw, "二号窗口");
        Thread t3 = new Thread(tw, "三号窗口");
        t1.start();
        t2.start();
        t3.start();
    }

}

