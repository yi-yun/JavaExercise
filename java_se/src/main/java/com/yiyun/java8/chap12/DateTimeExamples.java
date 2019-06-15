package com.yiyun.java8.chap12;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeExamples {
    @Test
    public void fun1(){
        LocalDate now = LocalDate.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek.getValue());
        System.out.println("now = " + now);
    }
}
