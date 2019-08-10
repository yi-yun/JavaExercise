package com.yiyun;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int a, b;

        while (cin.hasNextInt()) {
            a = cin.nextInt();
            b = cin.nextInt();
            System.out.println(a + b);
        }
    }

    @Test
    public void fun() {
        double v = 3.5;
        DecimalFormat format = new DecimalFormat("0.00");
        System.out.println(format.format(v));
    }

    @Test
    public void fun1() {
        double test = 2.3;
        System.out.printf("%.2f", test);
    }
}
