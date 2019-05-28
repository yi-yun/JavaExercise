package com.yiyun.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGenerics {
    public static <T extends Comparable<T>> T min(T[] list){
        T temp=list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(temp)==-1){
                temp=list[i];
            }
        }
        return temp;
    }
    @Test
    public void fun1(){
        Integer[] strings = new Integer[]{2,5,1};
        Integer min = min(strings);
        System.out.println("min = " + min);
    }
}
