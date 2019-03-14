package com.yiyun.proxy.demo4;

public class PersonService {
    public String sayHello(String name) {
        System.out.println("hello" + name);
        return "Hello " + name;
    }

    public Integer lengthOfName(String name) {
        return name.length();
    }
    public String test() {
        return "233333";
    }
}
