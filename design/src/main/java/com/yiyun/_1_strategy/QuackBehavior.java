package com.yiyun._1_strategy;

public interface QuackBehavior {
    public void quack();
}

class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("咕咕叫");
    }
}

class Squark implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}

class  Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
}