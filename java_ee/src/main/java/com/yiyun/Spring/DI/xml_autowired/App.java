package com.yiyun.Spring.DI.xml_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.jupiter.api.Test;
@SpringJUnitConfig
public class App {

    @Autowired
    private Person person;
    @Test
    public void fun(){

        System.out.println("person = " + person);
    }


}
