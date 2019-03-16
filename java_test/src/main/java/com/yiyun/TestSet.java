package com.yiyun;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        System.out.println("set = " + set);
    }
    @Test
    public void funadd(){
        int[] a= new int[]{1, 2, 3, 4, 5};
        int i=1;
        System.out.println("i= " + i++);
        i=1;
        System.out.println("i = " + ++i);

    }
}
