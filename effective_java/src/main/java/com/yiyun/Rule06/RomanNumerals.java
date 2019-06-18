package com.yiyun.Rule06;

import org.junit.Test;

import java.util.regex.Pattern;

public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    public static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    @Test
    public void fun() {
        Boolean of = Boolean.valueOf("hello,factory");
        String s = of.toString();
        System.out.println("s = " + s);
    }
}
