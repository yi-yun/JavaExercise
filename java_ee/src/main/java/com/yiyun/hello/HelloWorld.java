package com.yiyun.hello;


import lombok.Setter;

@Setter
public class HelloWorld {
    private String hostname;
    public void sayHello(){
        System.out.println("你好，hostname = " + hostname);
    }
}
