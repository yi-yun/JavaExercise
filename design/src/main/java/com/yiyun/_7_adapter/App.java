package com.yiyun._7_adapter;

public class App {
    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
