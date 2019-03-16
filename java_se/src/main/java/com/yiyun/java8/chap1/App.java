package com.yiyun.java8.chap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    
    //write before
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }
    
    //-----------------------------------------------------
    
    //write now
    public static boolean isGreenApple(Apple apple){
        return "green".equals(apple.getColor());
    }
    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight()>150;
    }
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
            new Apple(155, "green"),
            new Apple(120, "red"));
        System.out.println("-------------------------");
        List<Apple> apples = filterApples(inventory, App::isGreenApple);
        System.out.println("apples = " + apples);
        System.out.println("-------------------------");
        List<Apple> filterApples = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
        System.out.println("filterApples = " + filterApples);
        System.out.println("-------------------------");
        List<Apple> collect = inventory.stream().filter((Apple a) -> a.getWeight() > 150)
            .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }

}
