package com.yiyun.java8.chap2;

import com.yiyun.java8.chap1.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void prettyPrintApple(List<Apple> inventory,AppleFormatter appleFormatter){
        for (Apple apple:inventory
             ) {
            String out=appleFormatter.accept(apple);
            System.out.println("out = " + out);
        }
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
            new Apple(80,"green"), 
            new Apple(155, "green"), 
            new Apple(120, "red"));
        prettyPrintApple(inventory,new PrettyFormatter());
        prettyPrintApple(inventory,new SimpFormatter());
        inventory.sort(Comparator.comparing(Apple::getWeight));
        
    }
}
