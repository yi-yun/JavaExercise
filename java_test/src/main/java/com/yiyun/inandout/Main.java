package com.yiyun.inandout;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int nextInt1 = sc.nextInt();
        int nextInt2 = sc.nextInt();
        System.out.println(nextInt1);
        System.out.println(nextInt2);
    }
}
