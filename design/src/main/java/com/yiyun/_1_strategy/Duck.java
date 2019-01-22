package com.yiyun._1_strategy;

public abstract  class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public abstract void display();

    public void swim() {

    }
}
