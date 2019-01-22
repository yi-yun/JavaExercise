package com.yiyun.Spring.Test;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@SpringJUnitConfig
public class TestTest {

    @Autowired
    private TestFrame testFrame;

    @Test
    public void Test4() throws Exception{
        testFrame.doWork();
    }

}
