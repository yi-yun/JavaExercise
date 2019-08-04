package com.yiyun.proxy.mybatis.v2;

/**
 * @class: MyInterceptor
 * @description: 我的拦截器
 * @author: yi-yun
 * @create: 2019-08-03 23:38
 **/
public interface MyInterceptorV2 {
    Object interceptor(MyInvocation invocation) throws Throwable;
}
