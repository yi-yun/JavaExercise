package com.yiyun.proxy.demo2;

import org.junit.Test;

public class TestFactory {
    @Test
    public void fun(){
        Waiter a = new WaiterImpl();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(a);
        proxyFactory.setBefore(new BeforeMethod() {
            @Override
            public void before() {
                System.out.println("nihao");
            }
        });
        proxyFactory.setAfter(new AfterMethod() {
            @Override
            public void after() {

            }
        });
        Waiter waiter = (Waiter) proxyFactory.createFactory();
        waiter.serve();
    }
}
