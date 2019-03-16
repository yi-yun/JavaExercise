package com.yiyun.proxy.demo5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private int num;
    private String name;
    public void sayHello(int a){
        System.out.println("Hello,"+a);
    }
}
