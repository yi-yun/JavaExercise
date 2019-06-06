package com.yiyun.java8.chap4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasic {
    public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes){
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for(Dish d: dishes){
            if(d.getCalories() < 400){
                lowCaloricDishes.add(d);
            }
        }
        List<String> lowCaloricDishesName = new ArrayList<>();
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            public int compare(Dish d1, Dish d2){
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });
        for(Dish d: lowCaloricDishes){
            lowCaloricDishesName.add(d.getName());
        }
        return lowCaloricDishesName;
    }

    public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes){
        return dishes.stream().filter(d->d.getCalories()<400)
            .sorted(Comparator.comparing(Dish::getCalories)).map(Dish::getName)
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> lowCaloricDishesNamesInJava8 = getLowCaloricDishesNamesInJava8(Dish.menu);
        System.out.println("lowCaloricDishesNamesInJava8 = " + lowCaloricDishesNamesInJava8);
    }
    @Test
    public void fun(){
        List<String> collect1 = Dish.menu.stream().map(Dish::toString).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
        List<String> collect = Dish.menu.stream().filter(d -> d.getCalories() > 300).map(Dish::getName).limit(3).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        Dish.menu.stream().forEach(System.out::println);
    }
}
