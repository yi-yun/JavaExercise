package com.yiyun.Spring.CreateBean._04factorybean;

import org.springframework.beans.factory.FactoryBean;

public class Cat4Factory implements FactoryBean<Cat4> {
    private String honstanme;

    public void setHonstanme(String honstanme) {
        this.honstanme = honstanme;
    }

    //相当于实例工厂的方法
    @Override
    public Cat4 getObject() throws Exception {
        System.out.println("honstanme = " + honstanme);
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
