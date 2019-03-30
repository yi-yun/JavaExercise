package com.yiyun.test;

import com.yiyun.Spring.Setting.HelloWord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

//框架外的测试
public class TestHello {
    @Test
    void fun(){
        HelloWord world=null;
        BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("ioc.xml"));
        world=beanFactory.getBean("test",HelloWord.class);
        world.sayHello();
    }

    @Test
    void fun1() throws Exception {
        //ioc 原理（Reflect）
        String path="com.HelloWord";
        HelloWord world=null;
        //-----Spring---------
        Class clazz=Class.forName(path);//反射创建对象
        Constructor con=clazz.getConstructor();
        con.setAccessible(true);//可访问的
        Object o=con.newInstance();
        BeanInfo  beanInfo=Introspector.getBeanInfo(clazz,Object.class);//内省机制
        PropertyDescriptor[] pds=beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor ps:pds) {
            String proper=ps.getName();//获取类中的所有属性
            if("hostname".equals(proper)){
                ps.getWriteMethod().invoke(o,"yi-yun");//调用 Set 方法
            }
        }
        world=(HelloWord)o;
        //
        world.sayHello();
    }
}
