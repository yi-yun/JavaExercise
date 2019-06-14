package com.yiyun.java8.chap11;


import java.util.concurrent.*;

public class OlderFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Double> future = executor.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                return 12.2323;
            }
        });
        System.out.println("do something else……");
        try {
           future.get(1, TimeUnit.SECONDS);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
