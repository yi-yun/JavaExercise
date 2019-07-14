package nowcoder.offer;

import org.junit.Test;

/**
 * @class: Solution_7
 * @description: 斐波那契数列
 * @author: yi-yun
 * @create: 2019-07-14 19:32
 **/
public class Solution_7 {
    //递归
    public int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    //循环
    public int Fibonacci2(int n) {
        int res = 0, preOne = 1, preTwo = 0;
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            res = preOne + preTwo;
            preTwo = preOne;
            preOne = res;
        }
        return res;
    }

    @Test
    public void fun() {
        int a = Fibonacci2(0);
        int b = Fibonacci2(1);
        int c = Fibonacci2(2);
        int d = Fibonacci2(3);
        int e = Fibonacci2(4);
    }
}
