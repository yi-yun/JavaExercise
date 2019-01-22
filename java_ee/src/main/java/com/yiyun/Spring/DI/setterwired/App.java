package com.yiyun.Spring.DI.setterwired;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.jupiter.api.Test;
@SpringJUnitConfig
public class App {

    @Autowired
    private Employee1 employee;
    @Autowired
    private Cat1 c1;
    @Autowired
    private CollectionBean1 c2;
    @Test
    public void fun(){
        System.out.println("employee =  " + employee);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }



}
