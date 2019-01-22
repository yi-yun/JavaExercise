package com.yiyun._3_decorate;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    public double cost() {
        return 0.10+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",whip";
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
}
