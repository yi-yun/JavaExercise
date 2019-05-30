package com.yiyun.java8.chap5;

import com.yiyun.java8.chap4.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
    public static void main(String[] args) {
        List<Dish> collect = Dish.menu.stream().filter(d -> d.getCalories() > 300).skip(2).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
