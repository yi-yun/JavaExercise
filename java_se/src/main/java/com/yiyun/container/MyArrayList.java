package com.yiyun.container;

import lombok.ToString;

@ToString
public class MyArrayList {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY=10; 
    public MyArrayList(){
        elementData=new Object[DEFAULT_CAPACITY];
    }
    
    public MyArrayList(int capacity){
        elementData=new Object[capacity];
    }
    public void add(Object obj){
        elementData[size++]=obj;
    }
}
