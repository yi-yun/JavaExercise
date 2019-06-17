package com.yiyun;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections {
    @Test
    public void fun(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.reverse(list);
    }
}
