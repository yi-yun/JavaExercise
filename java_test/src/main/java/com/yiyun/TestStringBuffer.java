package com.yiyun;

import org.junit.Test;

public class TestStringBuffer {
    @Test
    public void fun(){
        final StringBuffer stringBuffer = new StringBuffer("yi-yun");
        System.out.println("stringBuffer = " + stringBuffer.hashCode());
        stringBuffer.append("hello");
        System.out.println("stringBuffer = " + stringBuffer.hashCode());
        
    }
}
