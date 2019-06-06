package com.yiyun.java8.chap5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreams {
    @Test
    public void fun1(){
        long count = IntStream.rangeClosed(1, 100)
            .filter(d -> d % 2 == 0).count();
        System.out.println("count = " + count);
    }
    @Test
    public void fun2(){
        IntStream.rangeClosed(1, 100).boxed().flatMap(
            a -> IntStream.rangeClosed(a, 100).mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                .filter(t -> t[2] % 1 == 0)
        ).forEach(t-> {
            System.out.println((int)t[0]+","+(int)t[1]+","+(int)t[2]);
        });
    }
}
