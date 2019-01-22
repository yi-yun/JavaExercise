package com.yiyun._3_decorate;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",mocha";
    }

    public double cost() {
        return 0.20+beverage.cost();
    }
}
