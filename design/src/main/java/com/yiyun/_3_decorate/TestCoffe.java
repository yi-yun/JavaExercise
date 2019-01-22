package com.yiyun._3_decorate;

import org.junit.Test;

public class TestCoffe {

    @Test
    public void  fun(){

        Beverage beverage=new HouseBlend();
        beverage=new Mocha(beverage);
        beverage=new Mocha(beverage);
        beverage=new Whip(beverage);
        System.out.println("beverage = " + beverage.getDescription()+beverage.cost());
    }
}
