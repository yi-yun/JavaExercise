package com.yiyun.proxy.mybatis.v2;

import com.yiyun.proxy.mybatis.Target;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @class: TargetProxy
 * @description: 代理对象
 * @author: yi-yun
 * @create: 2019-08-03 23:35
 **/
public class TargetProxyV2 implements InvocationHandler {

    private Target target;

    private MyInterceptorV2 myInterceptor;

    public TargetProxyV2(Target target, MyInterceptorV2 myInterceptor) {
        this.target = target;
        this.myInterceptor = myInterceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return myInterceptor.interceptor(new MyInvocation(target, method, args));
    }
}
