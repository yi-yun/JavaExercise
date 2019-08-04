package com.yiyun.proxy.demo1;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo {
    @Test
    public void fun() {
        Waiter waiter = new WaiterImpl();
        waiter.serve();
    }

    @Test
    public void fun1() {
        Waiter a = new WaiterImpl();
        ClassLoader classLoader = getClass().getClassLoader();
        Class[] classes = {Waiter.class};
        Waiter waiterproxy = (Waiter) Proxy.newProxyInstance(classLoader, classes, new WaitInvocationHandler(a));
        waiterproxy.serve();
    }
}

class WaitInvocationHandler implements InvocationHandler {
    private Waiter waiter;

    public WaitInvocationHandler(Waiter waiter1) {
        waiter = waiter1;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你好");
        Object invoke = method.invoke(waiter, args);
        System.out.println("再见");
        return invoke;
    }
}
