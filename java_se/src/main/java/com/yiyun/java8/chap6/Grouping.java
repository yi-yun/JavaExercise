package com.yiyun.java8.chap6;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;
public class Grouping {
    enum CaloricLevel { DIET, NORMAL, FAT };
    //自定义属性
    @Test
    public void funSelf(){
        Map<CaloricLevel, List<Dish>> collect = Dish.menu.stream().collect(
            groupingBy(dish -> {
                if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                else return CaloricLevel.FAT;
            })
        );
        System.out.println("collect = " + collect);
    }
    //多级分组
    @Test
    public void funMutilGroup(){
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> collect = Dish.menu.stream().collect(
            groupingBy(Dish::getType,
                groupingBy(dish -> {
                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                }))
        );
        System.out.println("collect = " + collect);
    }
}
