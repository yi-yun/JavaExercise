package com.yiyun.Spring.IoC;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

    @Test
    public void fun(){
        Resource resource=new ClassPathResource("com/yiyun/Spring/IoC/App.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        System.out.println("-----------------------------");
        Person p=beanFactory.getBean("test",Person.class);
        System.out.println(p);
    }


    @Test
    public void fun1() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yiyun/Spring/IoC/App.xml");
        System.out.println("-----------------------------");
        Person p=ctx.getBean("test",Person.class);
        System.out.println(p);
    }
}
