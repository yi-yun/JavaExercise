package com.yiyun.usually.box;

public class Test02 {
    public static void main(String[] args) {
        //装箱:自动在后面 Integer a=new Integer(1000);
        Integer a=1000;
        //拆箱:自动在后面加intValue();
        int c =new Integer(1200);

        Integer b1=1000;
        Integer b2=1000;
        System.out.println(b1==b2);
        System.out.println("################");
        Integer c1=127;
        Integer c2=127;
        System.out.println(c1==c2);
    }
}
