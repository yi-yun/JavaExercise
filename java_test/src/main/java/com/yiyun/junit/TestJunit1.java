package com.yiyun.junit;

import com.yiyun.MessageUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestJunit1 {
    String message = "yi-yun";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside yiyun-----testPrintMessage()");
        assertNotEquals(message, messageUtil.printMessage());
    }
}
