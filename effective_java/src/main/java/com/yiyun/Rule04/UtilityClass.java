package com.yiyun.Rule04;

public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }
    

    public static void main(String[] args) {
        System.out.println("new UtilityClass() = " + new UtilityClass());
    }
}
