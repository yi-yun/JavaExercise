package com.yiyun.proxy.mybatis.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @class: MyInvocation
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-03 23:49
 **/
@Getter
@Setter
@AllArgsConstructor
public class MyInvocation {
    private Object target;
    private Method method;
    private Object[] args;

    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, args);
    }
}
