package com.yiyun.proxy.demo4;

import net.sf.cglib.beans.ImmutableBean;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class App {
    @Test
    public void fun(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        enhancer.setCallback((FixedValue) () -> "Hello Tom!");
        PersonService proxy = (PersonService) enhancer.create();

        String res = proxy.sayHello(null);

        assertEquals("Hello Tom!", res);
    }
    @Test
    public void fun2(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("before method run...");
                Object result = proxy.invokeSuper(obj, args);
                System.out.println("after method run...");
                return result;
            }
        });
        PersonService sample = (PersonService) enhancer.create();
        sample.sayHello("yiyun");
        
    }
    @Test
    public void fun3(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "Hello cglib";
            }
        });
        PersonService proxy = (PersonService) enhancer.create();
        System.out.println(proxy.test()+"");
//        System.out.println(proxy.toString());
        System.out.println(proxy.getClass());
//        System.out.println(proxy.hashCode());
    }
    @Test
    public void funBean(){
        SampleBean sampleBean = new SampleBean();
        sampleBean.setValue("yi-yun");
        SampleBean immutableBean = (SampleBean) ImmutableBean.create(sampleBean);
        System.out.println("immutableBean.getValue() = " + immutableBean.getValue());
        sampleBean.setValue("Hello world, again");
//        immutableBean.setValue("2333");
        System.out.println("immutableBean.getValue() = " + immutableBean.getValue());
        
    }
}
