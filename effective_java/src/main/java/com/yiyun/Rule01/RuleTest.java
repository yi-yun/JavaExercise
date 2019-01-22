package com.yiyun.Rule01;

import org.junit.Test;


public class RuleTest {

    public  static void main(String []args){
        new Apple();
    }

    @Test
    public  void fun(){
        Boolean a=Boolean.valueOf(true);
        Boolean b=Boolean.valueOf(true);
        System.out.println(a);
        System.out.println(b);

        Boolean c=new Boolean(true);
        Boolean d=new Boolean(true);
        System.out.println(c);
        System.out.println(d);
    }
}
