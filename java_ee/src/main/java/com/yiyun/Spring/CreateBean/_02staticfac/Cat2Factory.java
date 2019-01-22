package com.yiyun.Spring.CreateBean._02staticfac;

public class Cat2Factory {
    public  static Cat2 createInstance(){
        Cat2 c2=new Cat2();
        System.out.println("Hello");
        return c2;
    }
}
