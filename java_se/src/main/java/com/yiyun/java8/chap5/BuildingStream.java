package com.yiyun.java8.chap5;

import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class BuildingStream {
    @Test
    public void funFileStream() throws Exception{
        long uniqueWords = Files.lines(Paths.get("data.txt"), Charset.defaultCharset())
            .flatMap(line -> Arrays.stream(line.split(" ")))
            .distinct()
            .count();
    }
    @Test
    public void fun(){
        Stream.generate(()->new Random().nextInt())
            .limit(10)
            .sorted()
            .forEach(System.out::println);
    }
    @Test
    public void funValue(){
        // Stream.of
        Stream.of("Java 8", "Lambdas", "In", "Action")
            .map(String::toUpperCase).forEach(System.out::println);

        // Stream.empty
        Stream<String> emptyStream = Stream.empty();

        // Arrays.stream
        int[] numbers = {2, 3, 5, 7, 11, 13};
        System.out.println(Arrays.stream(numbers).sum());
    }
}
