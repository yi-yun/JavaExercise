package com.yiyun.java8.chap5;

import com.yiyun.java8.chap4.Dish;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java8", "lambda", "In", "Action");
        List<Integer> collect = strings.stream().map(String::length).collect(Collectors.toList());
    }
    
    @Test
    public void fun(){
        List<Integer> collect = Dish.menu.stream().map(Dish::getName).map(String::length).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
