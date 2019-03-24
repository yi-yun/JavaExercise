package com.yiyun;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageUtil {
    private String message;
    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
