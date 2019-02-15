package com.yiyun.container;

import com.yiyun.container.link.MyLinkedList;
import com.yiyun.container.link.Node;
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
    public void funTemplate(){
        
    }
    @Test
    public void funHashMap(){
        Map<Integer, String> hashMap = new HashMap<>();
        
    }
    
    @Test
    public void funVector(){
        Vector<Integer> vector = new Vector<>();
        vector.add(43);
        vector.add(23);
        System.out.println("vector = " + vector);
    }

    @Test
    public void funLinked(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("aa");
        myLinkedList.add("bb");
        myLinkedList.add("cc");
        myLinkedList.add("dd");
        myLinkedList.add("ee");
        
        System.out.println("myLinkedList = " + myLinkedList);
        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(3));
        
        myLinkedList.remove(0);
        myLinkedList.remove(0);
        myLinkedList.remove(0);
        System.out.println("myLinkedList.getSize() = " + myLinkedList.getSize());
//        myLinkedList.remove(8);
        System.out.println("myLinkedList = " + myLinkedList);
        myLinkedList.add(1,"rr");
        System.out.println("myLinkedList = " + myLinkedList);

    }
    //test mylist
    @Test
    public void funMyArrayList(){
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("aa");
        myArrayList.add("bb");
        System.out.println("myArrayList = " + myArrayList);
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();
        integerMyArrayList.add(6);
        integerMyArrayList.add(2);
        for(int i=0;i<40;i++){
            integerMyArrayList.add(i);
        }
        System.out.println("integerMyArrayList = " + integerMyArrayList);
//        integerMyArrayList.get(-9);
        integerMyArrayList.remove(1);
        boolean b = myArrayList.remove("aa");
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

        System.out.println(list02.get(-9));
        System.out.println("list01 = " + list01);
        System.out.println("list02 = " + list02);
        
//        list01.addAll(list02);
//        list01.removeAll(list02);
        list01.retainAll(list02);
        System.out.println("list01 = " + list01);
        
        

    }
    
    
}
