package com.yiyun.proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HeadFirst implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(proxy, args);
        return invoke;
    }
}
