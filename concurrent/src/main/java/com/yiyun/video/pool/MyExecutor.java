package com.yiyun.video.pool;

import java.util.concurrent.Executor;

public class MyExecutor implements Executor {
    @Override
    public void execute(Runnable command) {
        //new Thread(command).run();
        command.run();
    }

    public static void main(String[] args) {
        new MyExecutor().execute(()-> System.out.println("hello,executor"));
    }
}
