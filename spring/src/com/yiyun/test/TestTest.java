package com.yiyun.test;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class TestTest {

    @Autowired
    private TestFrame testFrame;

    @Test
    public void Test4() throws Exception{
        testFrame.doWork();
    }

}
