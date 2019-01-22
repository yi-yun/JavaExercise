package com.yiyun.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object Target;
    private BeforeMethod before;
    private AfterMethod after;

    public Object createFactory(){
        //Three parms
        ClassLoader loader = getClass().getClassLoader();
        Class[] classes = Target.getClass().getInterfaces();
        //handler
        InvocationHandler invocationHandler = new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(before != null)
                    before.before();
                Object o = method.invoke(Target,args);
                if(after != null)
                    after.after();
                return o;
            }
        };
        return Proxy.newProxyInstance(loader,classes,invocationHandler);
    }
    public void setTarget(Object target) {
        Target = target;
    }

    public void setBefore(BeforeMethod before) {
        this.before = before;
    }

    public void setAfter(AfterMethod after) {
        this.after = after;
    }

}
