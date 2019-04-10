package com.yiyun.video;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//生产者消费者问题
public class T21_MyContainer<T> {
    private final List<T>list=new LinkedList<>();
    private final int MAX=10;
    private int count = 0;
    public synchronized void put(T t){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (count==MAX){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(t);
        count++;
        this.notifyAll();
    }
    public synchronized T get(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (count==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T remove = list.remove(0);
        count--;
        this.notifyAll();
        return remove;
    }

    public static void main(String[] args) {
        T21_MyContainer<String> c = new T21_MyContainer<>();
        //启动消费者线程
        for(int i=0; i<10; i++) {
            new Thread(()->{
                for(int j=0; j<5; j++) System.out.println(c.get());
            }, "c" + i).start();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //启动生产者线程
        for(int i=0; i<2; i++) {
            new Thread(()->{
                for(int j=0; j<25; j++) {
                    c.put(Thread.currentThread().getName() + " " + j);
                    System.out.println("放入"+Thread.currentThread().getName()+j);
                }
            }, "p" + i).start();
        }
    }
}
