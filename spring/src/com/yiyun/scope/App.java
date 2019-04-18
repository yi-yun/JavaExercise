package com.yiyun.scope;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration({"classpath:applicationContext.xml"})
public class App {


    @Autowired
    private Dog dog1;
    @Autowired
    private Dog dog2;

    @Autowired
    private Dog dog3;
    @Test
    public void fun(){

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }


}
