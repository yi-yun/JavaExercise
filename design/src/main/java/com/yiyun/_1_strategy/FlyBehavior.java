package com.yiyun._1_strategy;

public interface FlyBehavior {

    void fly();
}

class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("合翅膀一起飞");
    }
}

class FlyNoway implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞...");
    }
}
