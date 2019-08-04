package com.yiyun.container.map;

import org.junit.Test;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @class: MyTreeMap
 * @description: TreeMap
 * @author: yi-yun
 * @create: 2019-08-04 11:15
 **/
public class MyTreeMap {
    @Test
    public void fun(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "tets");
        treeMap.put(2, "yi-yun2");
        treeMap.put(34, "yi34yun");
        treeMap.put(5, "yi-yun5");
        treeMap.put(9, "yi-yun9");
        treeMap.put(7, "yi-yun7");
        //2
        Integer floorKey = treeMap.floorKey(4);
        //2
        Integer lowerKey = treeMap.lowerKey(4);
        //5 yi-yun5
        Map.Entry<Integer, String> integerStringEntry = treeMap.higherEntry(4);

        //5
        Integer floorKey1 = treeMap.floorKey(5);
        //2
        Integer lowerKey1 = treeMap.lowerKey(5);
        //7 yi-yun7
        Map.Entry<Integer, String> integerStringEntry1 = treeMap.higherEntry(5);

        Integer ceilingKey = treeMap.ceilingKey(4);
        Integer ceilingKey1 = treeMap.ceilingKey(5);

        SortedMap<Integer, String> sortedMap = treeMap.tailMap(ceilingKey);
    }
}
