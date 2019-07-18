package com.yiyun;

import org.junit.Test;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @class: ArrayToMap
 * @description: 将两个数组映射成 HashMap
 * @author: yi-yun
 * @create: 2019-07-18 21:21
 **/
public class ArrayToMap {
    @Test
    public void fun1() {
        String[] keys = new String[]{"one", "two", "three"};
        Integer[] values = new Integer[]{1, 2, 3};
        Map<String, Integer> map = IntStream.range(0, keys.length).boxed().collect(
            Collectors.toMap(i -> keys[i], i -> values[i])
        );
    }

    @Test
    public void fun2() {
        String[] keys = new String[]{"one", "two", "three", "one"};
        Integer[] values = new Integer[]{1, 2, 3, 4};
        Map<String, Integer> map = IntStream.range(0, keys.length).boxed().collect(
            Collectors.toMap(i -> keys[i], i -> values[i])
        );
    }
}
