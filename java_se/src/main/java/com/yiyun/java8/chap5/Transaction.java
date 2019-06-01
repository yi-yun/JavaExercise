package com.yiyun.java8.chap5;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Transaction {
    private Trader trader;
    private int year;
    private int value;
}
