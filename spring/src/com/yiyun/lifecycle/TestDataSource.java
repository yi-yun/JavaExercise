package com.yiyun.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestDataSource {
    @Test
    public void fun(){
        ClassPathXmlApplicationContext acx=new ClassPathXmlApplicationContext("com/yiyun/lifecycle/lifecycle-App.xml");
        MyDataSource ds=acx.getBean("test", MyDataSource.class);
        ds.work();
        acx.close();
    }
    @Test
    public void fun1(){
        ClassPathXmlApplicationContext acx=new ClassPathXmlApplicationContext("com/yiyun/lifecycle/lifecycle-App.xml");
        MyDataSource ds=acx.getBean("test", MyDataSource.class);
        ds.work();
        acx.registerShutdownHook();
    }

}
