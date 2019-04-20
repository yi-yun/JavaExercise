package com.yiyun.other;

import java.util.concurrent.ArrayBlockingQueue;

//基本队列特性：先进先出。
//写入队列空间不可用时会阻塞。
//获取队列数据时当队列为空时将阻塞。
public final class MyArrayBlockingQueue<T> {
    private int count=0;
    private Object[] items;
    //full lock
    private Object full=new Object();
    //empty lock
    private Object empty=new Object();
    private int putIndex;
    private int getIndex;
    public MyArrayBlockingQueue(int size){
        items=new Object[size];
    }
    public void put(T t){
        synchronized (full){
            while (count==items.length){
                try {
                    full.wait();
                }catch (InterruptedException e){
                    break;
                }
            }
        }
        synchronized (empty){
            items[putIndex]=t;
            count++;
            putIndex++;
            if (putIndex==items.length){
                putIndex=0;
            }
            empty.notify();
        }
    }
    public T get(){
        synchronized (empty){
            while (count==0){
                try {
                    empty.wait();
                }catch (InterruptedException e){
                    return null;
                }
            }
        }
        synchronized (full){
            Object item = items[getIndex];
            items[getIndex]=null;
            count--;
            getIndex++;
            if (getIndex==items.length){
                getIndex=0;
            }
            full.notify();
            return (T) item;
        }
    }
    public synchronized int size() {
        return count;
    }
}
