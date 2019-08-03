package com.yiyun.proxy.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @class: TargetProxy
 * @description: 代理对象
 * @author: yi-yun
 * @create: 2019-08-03 23:35
 **/
public class TargetProxy implements InvocationHandler {

    private Target target;

    private MyInterceptor myInterceptor;

    public TargetProxy(Target target, MyInterceptor myInterceptor) {
        this.target = target;
        this.myInterceptor = myInterceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return myInterceptor.interceptor(new MyInvocation(target, method, args));
    }
}
