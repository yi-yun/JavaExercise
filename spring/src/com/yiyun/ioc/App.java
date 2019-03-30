package com.yiyun.ioc;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//test beanFactory  ApplicationContext
public class App {

    @BeforeEach
    void funBefore(){
        System.out.println(" ======start=======");
    }
    @AfterEach
    void funAfter(){
        System.out.println(" ======end=======");
    }
    //beanFactory
    @Test
    public void fun(){
        Resource resource=new ClassPathResource("com/yiyun/ioc/App-ioc.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        System.out.println("--------beanFactory------");
        Person p=beanFactory.getBean("test",Person.class);
        System.out.println(p);
    }


    //ApplicationContext
    @Test
    public void fun1() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yiyun/ioc/App-ioc.xml");
        System.out.println("--------ApplicationContext---------");
        Person p=ctx.getBean("test",Person.class);
        System.out.println(p);
    }
}
