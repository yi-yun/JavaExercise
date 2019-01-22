package com.yiyun.reflect.demo;


import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class testReflect {
    public static void main(String[] args) throws Exception {
        //获取Class 对象
        Class clazz=Class.forName("com.yiyun.excrice.reflect.Person");

        //获取一个实例， jdk9中已过时
        Object obj=clazz.newInstance();
        System.out.println("obj = " + obj);

        // 暴力反射私有构造器
        Constructor<?> constructor=clazz.getDeclaredConstructor(int.class,String.class);//因为权限是私有，但getConstructor()只能获取public修饰的方法getDeclaredConstructor():获取声明的方法。只要声明的就可以
        System.out.println("constructor = " + constructor);
        constructor.setAccessible(true);//newInstance会产生非法访问异常：java.lang.IllegalAccessException
        Object obj1=constructor.newInstance(1,"lisi");
        System.out.println("obj1 = " + obj1);
    }

    @Test
    public void methodTest() throws Exception{
        //得到类对象（可以想象成模板，有了模板你才能去造其他东西）
        Class clazz=Class.forName("com.yiyun.excrice.reflect.Person");
        //得到声明的方法
        Method method=clazz.getDeclaredMethod("speak",String.class);
        method.setAccessible(true);//暴力反射
        //这个方法需要一个实例
        // 静态方法不用，因为即使不 new 对象也可以调用，所以当执行静态方法时设置为 null也可以
        method.invoke(clazz.newInstance(),"hello,yi-yun");
    }

    @Test
    public void fieldTest() throws Exception{
        //获取Class 对象
        Class clazz=Class.forName("com.yiyun.excrice.reflect.Person");

        Field field=clazz.getDeclaredField("name");

        field.setAccessible(true);

        Object obj=clazz.newInstance();
        field.set(obj,"yi-yun");
        System.out.println("obj = " + obj);
    }
}
