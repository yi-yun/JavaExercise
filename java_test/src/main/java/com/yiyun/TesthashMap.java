package com.yiyun;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TesthashMap {
    @Test
    public void fun1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "yiyun1");
        map.put(2, "yiyun2");
        map.put(3, "yiyun3");
        map.put(4, "yiyun4");
        System.out.println("map = " + map);
    }

    @Test
    public void fun2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "yiyun1");
        map.put(2, "yiyun2");
        map.put(3, "yiyun3");
        map.put(4, "yiyun4");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("键" + entry.getKey() + ":" + entry.getValue());
        }
    }
}
