package com.yiyun._6_command;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LightCommand implements Command{
    Light light;
    @Override
    public void execute() {
        light.setOn(true);
    }
}
