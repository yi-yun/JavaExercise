package com.yiyun.inandout;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int nextInt1 = sc.nextInt();
        int nextInt2 = sc.nextInt();
        System.out.println(nextInt1);
        System.out.println(nextInt2);
    }
    @Test
    public void fun() throws ParseException {
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        Date parse = simp.parse("2014-08-11 21:00:00.000");
        System.out.println("parse = "+parse);
        LocalDateTime now = LocalDateTime.now();
        
        System.out.println("now = " + now);
    }
}
