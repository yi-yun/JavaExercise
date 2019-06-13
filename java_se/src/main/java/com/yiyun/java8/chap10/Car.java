package com.yiyun.java8.chap10;

import lombok.Getter;

import java.util.Optional;

@Getter
public class Car {
    private Optional<Insurance> insurance;
}
