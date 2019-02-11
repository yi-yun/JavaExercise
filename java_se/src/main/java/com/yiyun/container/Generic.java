package com.yiyun.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generic {
    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<>();
        myCollection.setObj("yi-yun",0);

        String str= (String) myCollection.getObj(0);
        System.out.println("str = " + str);

        List a=new ArrayList();
        Map map=new HashMap();
    }
}

class MyCollection<E>{
    Object[] objs=new Object[5];
    public  void setObj(E obj,int index){
        objs[index]=obj;
    }
    public Object getObj(int index){
        return (E)objs[index];
    }
}