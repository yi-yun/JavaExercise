package com.yiyun.container;

import com.yiyun.container.link.MyLinkedList;
import com.yiyun.container.map.MyHashMap;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TransferQueue;

public class TestContains {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("yi-yun");
        c.add("233");
        System.out.println("c = " + c);
        System.out.println(c.size());
//        TransferQueue
    }

    @Test
    public void funTemplate() {
    }
    @Test
    public void funPreIteration() {
        List<String> list = new ArrayList<>();
        list.add("yi-yun5");
        list.add("yi-yun6");
        list.add("yi-yun7");
        list.add("yi-yun82");
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){//向后遍历
            System.out.println(listIterator.next());
        }
        System.out.println("------------------------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
    @Test
    public void funIteration() {
        List<String> list = new ArrayList<>();
        list.add("yi-yun1");
        list.add("yi-yun2");
        list.add("yi-yun3");
        list.add("yi-yun4");
        Iterator it=list.iterator();
        System.out.println("it = " + it);
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Iterator it2=list.iterator();it2.hasNext();) {
            String next = (String) it2.next();
            System.out.println(next);
        }
    }

    @Test
    public void funSet() {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
    }

    @Test
    public void funTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(210, "aa");
        treeMap.put(330, "bb");
        treeMap.put(40, "dd");
        for (Integer e : treeMap.keySet()) {
            System.out.println(e + "----" + treeMap.get(e));
        }


    }

    @Test
    public void funMyHashMap() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, "aa");
        myHashMap.put(2, "bb");
        myHashMap.put(3, "cc");
        myHashMap.put(53, "gg");
        myHashMap.put(69, "rr");
        myHashMap.put(85, "yiyun");
        System.out.println("myHashMap = " + myHashMap);
        System.out.println("myHashMap.get(69) = " + myHashMap.get(69));
    }

    @Test
    public void funHash() {
        int h = 25860363;
        int length = 16;//length为2的整数次幂,则h&(length-1)相当于对length取模
        System.out.println(h & (length - 1));
        //length为2的整数幂情况下，和取余的值一样
        System.out.println(h % length);//取余数
    }

    @Test
    public void funHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "yi-yun");
        System.out.println("hashMap.get(1) = " + hashMap.get(1));
    }

    @Test
    public void funVector() {
        Vector<Integer> vector = new Vector<>();
        vector.add(43);
        vector.add(23);
        System.out.println("vector = " + vector);
    }

    @Test
    public void funLinked() {
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
        myLinkedList.add(1, "rr");
        System.out.println("myLinkedList = " + myLinkedList);

    }

    //test mylist
    @Test
    public void funMyArrayList() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("aa");
        myArrayList.add("bb");
        System.out.println("myArrayList = " + myArrayList);
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();
        integerMyArrayList.add(6);
        integerMyArrayList.add(2);
        for (int i = 0; i < 40; i++) {
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
    public void fun03() {
        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");
        System.out.println("list01 = " + list01);
        list01.add(2, "yi-yun");
        System.out.println("list01 = " + list01);
        list01.remove(2);
        list01.set(0, "233");
        System.out.println("list01 = " + list01);
        System.out.println(list01.get(1));

        List<Integer> listtest = new ArrayList<>();
        listtest.add(1);
        listtest.add(2);
        for (int i = 0; i < 40; i++) {
            listtest.add(i);
        }
        System.out.println("listtest = " + listtest);
        System.out.println(listtest.size());


    }

    @Test
    public void fun02() {
        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        List<String> list02 = new ArrayList<>();
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
