package com.yiyun._3_decorate;

public abstract class Beverage  {
    String description="Unkown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
