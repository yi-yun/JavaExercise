package com.yiyun.proxy.mybatis.v1;

import com.yiyun.proxy.mybatis.Target;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @class: TargetProxy
 * @description: 代理对象
 * @author: yi-yun
 * @create: 2019-08-03 23:35
 **/
public class TargetProxyV1 implements InvocationHandler {

    private Target target;

    private MyInterceptorV1 myInterceptor;

    public TargetProxyV1(Target target, MyInterceptorV1 myInterceptor) {
        this.target = target;
        this.myInterceptor = myInterceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        myInterceptor.interceptor();
        return method.invoke(target, args);
    }
}
