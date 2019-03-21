package com.yiyun.arch;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloWorldTest {
    @Test
    void test(){
        HelloWorld world=null;
        BeanFactory factory= new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        world = (HelloWorld) factory.getBean("helloWorld");
        world.sayHello();
    }
    
    
}
