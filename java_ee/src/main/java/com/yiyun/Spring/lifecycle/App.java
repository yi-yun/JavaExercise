package com.yiyun.Spring.lifecycle;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringJUnitConfig
public class App {

    @Autowired
    private  MyDataSource ds;

    @Autowired
    private  MyDataSource ds1;

    @Test
    public void fun(){
        ds1.work();
        ds.work();
    }

    @Test
    public void old(){
        MyDataSource myDataSource=new MyDataSource();
        myDataSource.open();
        //work
        myDataSource.work();
        //扫尾
        myDataSource.close();
    }


}
