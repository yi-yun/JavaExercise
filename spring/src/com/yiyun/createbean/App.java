package com.yiyun.createbean;


import com.yiyun.createbean._01constructor.Cat1;
import com.yiyun.createbean._02staticfac.Cat2;
import com.yiyun.createbean._02staticfac.Cat2Factory;
import com.yiyun.createbean._03instancefac.Cat3;
import com.yiyun.createbean._03instancefac.Cat3Factory;
import com.yiyun.createbean._04factorybean.Cat4;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

    @Autowired
    private Cat1 cat1;

    @Autowired
    private Cat2 c2;

    @Autowired
    private Cat3 c3;

    @Autowired
    private Cat4 c4;
    @Test
    public void fun(){
//        System.out.println(cat1);
//        System.out.println(c2);
//        System.out.println(c3);
        System.out.println(c4);
    }

    @Test
    public  void funOld(){
        //静态方法
        Cat2 c2= Cat2Factory.createInstance();
        //实例工厂
        Cat3 c3= new Cat3Factory().createInstance();
    }

}
