package com.yiyun._1_strategy;


import org.junit.Test;

public class TestDuck {
    @Test
    public  void fun1(){
        new MallareDark().performFly();
        new MallareDark().performQuack();
        new MallareDark().display();
    }

}
