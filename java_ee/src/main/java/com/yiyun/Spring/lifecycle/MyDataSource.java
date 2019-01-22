package com.yiyun.Spring.lifecycle;
//模拟数据库连接池
public class MyDataSource {
    public MyDataSource() {
        System.out.println("Create..");
    }
    public void open(){
        System.out.println("open...");
    }
    public void close(){
        System.out.println("close...");
    }
    public void work(){
        System.out.println("work...");
    }
}
