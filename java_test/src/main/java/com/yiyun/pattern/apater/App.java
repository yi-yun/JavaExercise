package com.yiyun.pattern.apater;

import org.junit.Test;

public class App {
    @Test
    public void fun(){
        King king = new King(new BoatApater());
        king.row();
    }
}
