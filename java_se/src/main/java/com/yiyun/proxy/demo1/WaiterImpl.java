package com.yiyun.proxy.demo1;

public class WaiterImpl implements Waiter {
    @Override
    public void serve() {
        System.out.println("服务中...");
    }
}
