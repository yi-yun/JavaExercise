package com.yiyun.java8.chap6;

import org.junit.Test;

import java.util.IntSummaryStatistics;

import static java.util.stream.Collectors.*;

public class Summarizing {
    @Test
    public void fun(){
        IntSummaryStatistics collect = 
            Dish.menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println("collect = " + collect);
    }
}
