package com.yiyun._6_command;

import lombok.AllArgsConstructor;
import lombok.Data;

public class LightCommand implements Command{
    Light light;
    @Override
    public void execute() {
        System.out.println("light on...");
    }
    public LightCommand(Light light){
        this.light=light;
    }
    
}
