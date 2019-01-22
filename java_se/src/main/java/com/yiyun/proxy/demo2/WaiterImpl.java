package com.yiyun.proxy.demo2;

public class WaiterImpl implements Waiter {
    @Override
    public void serve() {
        System.out.println("服务中...");
    }
}
