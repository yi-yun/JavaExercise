package com.yiyun.jvm._8;

public class StaticDispatch {
    static abstract class Human{
        
    }
    static class Man extends Human{
        
    }
    static class Woman extends Human{
        
    }
    public void sayHello(Man guy){
        System.out.println("hello,gentleman");
    }
    public void sayHello(Woman guy){
        System.out.println("hello,lady");
    }
    public void sayHello(Human guy){
        System.out.println("hello,guy");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Man man1 = new Man();
        Human woman = new Woman();
        StaticDispatch dispatch = new StaticDispatch();
        dispatch.sayHello(man);
        dispatch.sayHello(man1);
        dispatch.sayHello(woman);
    }
}
