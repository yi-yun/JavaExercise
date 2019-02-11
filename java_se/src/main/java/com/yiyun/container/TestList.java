package com.yiyun.container;

import org.junit.Test;

import java.util.*;

public class TestList {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();

        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("yi-yun");
        c.add("233");
        System.out.println("c = " + c);
        System.out.println(c.size());
    }
    @Test
    //test list
    public void fun03(){
        List<String> list01=new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");
        System.out.println("list01 = " + list01);
        list01.add(2,"yi-yun");
        System.out.println("list01 = " + list01);
        list01.remove(2);
        list01.set(0,"233");
        System.out.println("list01 = " + list01);
        System.out.println(list01.get(1));
    }
    
    @Test
    public void fun02(){
        List<String> list01=new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        List<String> list02=new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");

        System.out.println("list01 = " + list01);
        System.out.println("list02 = " + list02);
        
//        list01.addAll(list02);
//        list01.removeAll(list02);
        list01.retainAll(list02);
        System.out.println("list01 = " + list01);
        
        

    }
    
    
}
