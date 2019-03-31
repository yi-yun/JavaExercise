package com.yiyun.di.xml_autowired;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

    @Autowired
    private Person person;
    @Test
    public void fun(){

        System.out.println("person = " + person);
    }


}
