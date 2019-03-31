package com.yiyun.createbean._04factorybean;

import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;

@Setter
public class Cat4Factory implements FactoryBean<Cat4> {
    private String hostname;


    //相当于实例工厂的方法
    @Override
    public Cat4 getObject() throws Exception {
        System.out.println("hostname = " + hostname);
        Cat4 c4=new Cat4();
        return c4;
    }

    @Override
    public Class<?> getObjectType() {
        return Cat4.class;
    }

    //默认单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
