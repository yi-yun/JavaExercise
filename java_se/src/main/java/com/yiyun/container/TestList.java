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
    
    //test mylist
    @Test
    public void funMyArrayList(){
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("aa");
        myArrayList.add("bb");
        System.out.println("myArrayList = " + myArrayList);
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();
        integerMyArrayList.add(1);
        integerMyArrayList.add(2);
        for(int i=0;i<40;i++){
            integerMyArrayList.add(i);
        }
        System.out.println("integerMyArrayList = " + integerMyArrayList);
        
        
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

        List<Integer> listtest=new ArrayList<>();
        listtest.add(1);
        listtest.add(2);
        for(int i=0;i<40;i++){
            listtest.add(i);
        }
        System.out.println("listtest = " + listtest);
        System.out.println(listtest.size());


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
