package com.yiyun.jvm._2;

import org.junit.Test;

import java.util.Random;

public class TestStringIntern {
    static final int MAX = 1000 * 10000;
    static final String[] arr = new String[MAX];
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        String s1=new String("1");
        System.out.println(s==s1);

        String s3 = new String("1") + new String("1");
        String s5=s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }
    @Test
    public void run(){
        String s = new String("yi-yun");
        s.intern();
        String s1="yi-yun";
        System.out.println(s==s1);
    }
    @Test
    public void funTrue(){
        Integer[] DB_DATA = new Integer[10];
        Random random = new Random(10 * 10000);
        for (int i = 0; i < DB_DATA.length; i++) {
            DB_DATA[i] = random.nextInt();
        }
        long t = System.currentTimeMillis();
        for (int i = 0; i < MAX; i++) {
            //arr[i] = new String(String.valueOf(DB_DATA[i % DB_DATA.length]));
            arr[i] = new String(String.valueOf(DB_DATA[i % DB_DATA.length])).intern();
        }

        System.out.println((System.currentTimeMillis() - t) + "ms");
        System.gc();
    }
}
