package com.yiyun._6_command;

public class App {
    public static void main(String[] args) {
        LightCommand lightCommand = new LightCommand(new Light());
        lightCommand.execute();
    }
}
