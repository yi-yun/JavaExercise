package com.yiyun.junit;


import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {
    public static void main(String[] args) {
        String name="yi-yun";
        System.out.println("name = " + name);
    }
    @Test
    public void funX(){
        
    }@Test
    public void funData(){
        //test data
        int num= 5;
        String temp= null;
        String str= "yi-yun";
        assertFalse(num>7);
        assertNotNull(str);
    }
    @Test
    public void funAdd(){
        String s="yi-yun";
        assertEquals("yi-yun",s);
        System.out.println("s = " + s);
    }
    @Test
    public void fun(){
        String name="yi-yun";
        assert (name!=null);
        System.out.println("name = " + name);
    }
}
