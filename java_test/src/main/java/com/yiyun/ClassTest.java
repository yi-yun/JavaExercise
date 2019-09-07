package com.yiyun;

import java.lang.reflect.Field;

/**
 * @class: ClassTest
 * @description: Class 测试
 * @author: yi-yun
 * @create: 2019-09-07 14:29
 **/
public class ClassTest {
    private static int[] array = new int[3];
    private static int length = array.length;
    private static Class<One> one = One.class;
    private static Class<Another> another = Another.class;

    public static void main(String[] args) throws Exception {
        One oneObject = ClassTest.one.newInstance();
        oneObject.call();

        Another anotherObject = ClassTest.another.newInstance();
        anotherObject.speak();

        Field inner = one.getDeclaredField("inner");
        inner.setAccessible(true);

        inner.set(oneObject, "world change");
        System.out.println(oneObject.getInner());
         
    }
}

class One {
    private String inner = "time flies...";

    public void call() {
        System.out.println("hello world");
    }

    public String getInner() {
        return inner;
    }
}

class Another {
    public void speak() {
        System.out.println("easy coding...");
    }
}