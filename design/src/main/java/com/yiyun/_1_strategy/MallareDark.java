package com.yiyun._1_strategy;

public class MallareDark extends Duck{
    public MallareDark() {
        flyBehavior=new FlyWithWings();
        quackBehavior=new Mute();
    }

    @Override
    public void display() {
        System.out.println("我不会叫但会飞");
    }
}
