package com.yiyun.Rule13;

import com.yiyun.Rule07.MyStack;

public class TestClone {
    public static void main(String[] args) throws Exception{
        StackClone stackClone = new StackClone();
        StackClone clone = stackClone.clone();
        for (int i = 0; i < 18; i++) {
            stackClone.push(i);
        }
    }
}
