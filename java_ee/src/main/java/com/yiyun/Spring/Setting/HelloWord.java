package com.yiyun.Spring.Setting;

public class HelloWord {
    private String hostname;

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    public void sayHello(){
        System.out.println("Hello,"+hostname+"!Welcome to Spring!");
    }
}
