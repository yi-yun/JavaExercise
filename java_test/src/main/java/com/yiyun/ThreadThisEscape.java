package com.yiyun;

public class ThreadThisEscape {
    private int weight=0;
    public ThreadThisEscape(){
        new Thread(new EscapeRunnable()).start();
        weight=1;
        // 模拟构造函数耗时
        for (int i = 0; i < 1000000; i++)
        {

        }

    }
    private class EscapeRunnable implements Runnable
    {
        @Override
        public void run()
        {
            System.out.println(ThreadThisEscape.this.weight);
        }
    }

    public static void main(String[] args) {
        new ThreadThisEscape();
    }

}
