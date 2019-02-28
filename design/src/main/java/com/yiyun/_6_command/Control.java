package com.yiyun._6_command;

public class Control {
    private Command command;

    public Control(Command command) {
        this.command = command;
    }
    public void call(){
        command.execute();
    }
}
