package com.yiyun.java8.chap3;

import org.junit.Test;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class TestBoxPredicate {
    @Test
    public void fun(){

        long startTime=System.currentTimeMillis();   //获取开始时间  
        IntPredicate intFunction = (int i) -> i % 2 == 0;
        for (int i = 0; i < 1000000000; i++) {
            intFunction.test(i);
        }
        long endTime=System.currentTimeMillis(); //获取结束时间  
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

    }
    @Test
    public void fun2(){
        long start=System.currentTimeMillis();   //获取开始时间  
        Predicate<Integer> odd=(Integer i) -> i % 2 == 1;
        for (int i = 0; i < 1000000000; i++) {
            odd.test(i);
        }
        long end=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(end-start)+"ms");
        
    }
}
