package com.yiyun.proxy.mybatis;

/**
 * @class: MyInterceptor
 * @description: 我的拦截器
 * @author: yi-yun
 * @create: 2019-08-03 23:38
 **/
public interface MyInterceptor {
    Object interceptor(MyInvocation invocation);
}
