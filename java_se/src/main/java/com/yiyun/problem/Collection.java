package com.yiyun.problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {
    @Test
    public void funObject() {
        List<Integer> t1 = new ArrayList<>();
        List t2=t1;
//        List<Object> t3=t1;
    }
    @Test
    public void funwenhao() {
        List<Object> t1 = new ArrayList<>();
        List<?> t2 = t1;
        t2.add(null);
//        t2.add(new Object());
//        t2.add("asd")
        System.out.println("t2 = " + t2);
//        t2.remove(0);
//        t2.clear();
        
//        t2.add(new Object());


    }
    @Test
    public void funGeneric() {
        List list=new ArrayList();
        list.add("12");
        list.add(new Object());
        

    }
    @Test
    public void funArray2Collection() {
        String[] arr = {"one", "two", "three"};
        //asList 返回的并不是一个 ArrayList,而是内部类
        List<String> list = new ArrayList<>(Arrays.asList(arr));
    }
    @Test
    public void funCollection2Array() {
        // 集合大小为 size
        List<String> list = new ArrayList<>();
        list.add("yi-yun1");
        list.add("yi-yun2");
        list.add("yi-yun3");
        list.add("yi-yun4");
        list.add("yi-yun5");
        list.add("yi-yun6");
        // 长度为 n 的数组
        String[] arr = new String[5];
        // 进行转换
        String[] strings = list.toArray(arr);
        System.out.println("list = " + list);
        System.out.println("arr = " + arr[4]);
        System.out.println("strings = " + strings.length);
    }
    @Test
    public void funTemplate5() {
    }
}
