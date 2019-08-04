package com.yiyun.proxy.mybatis;

import com.yiyun.proxy.mybatis.v1.MyInterceptorV1;
import com.yiyun.proxy.mybatis.v1.TargetProxyV1;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @class: App
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-03 23:51
 **/
public class App {

    @Test
    public void funV1() {
        TargetImpl target = new TargetImpl();
        MyInterceptorV1 myInterceptorV1 = new MyInterceptorV1() {
            @Override
            public void interceptor() {
                System.out.println("拦截之前");
            }
        };
        Target proxyInstance = (Target) Proxy.newProxyInstance(target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            new TargetProxyV1(target, myInterceptorV1));
        proxyInstance.execute();
    }
}
