package com.yiyun.container;

import lombok.ToString;

@ToString
public class MyArrayList<T> {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY=10; 
    public MyArrayList(){
        elementData=new Object[DEFAULT_CAPACITY];
    }
    
    public MyArrayList(int capacity){
        elementData=new Object[capacity];
    }
    //需要考虑扩容
    public void add(T obj){
        int old=elementData.length;
        if(size==old){
            Object[] newArray=new Object[old+(old>>1)];
            System.arraycopy(elementData,0,newArray,0,old);
            elementData=newArray;
        }
        elementData[size++]=obj;
    }
    public T get(int index){
        rangeCheck(index);
        return (T) elementData[index];
    }
    public T set(int index,T element){
        rangeCheck(index);
        T old= (T) elementData[index];
        elementData[index]=element;
        return old; 
    }
    private void rangeCheck(int index) {
        if (index >= size)
            throw new RuntimeException("边界异常");
    }
}
