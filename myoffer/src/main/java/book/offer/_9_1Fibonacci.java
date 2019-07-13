package book.offer;

import org.junit.Test;

/**
 * @class: _9_1Fibonacci
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-06 15:45
 **/
public class _9_1Fibonacci {
    public long fibonacci(int n) {
        long result = 0L;
        long preOne = 1L;
        long preTwo = 0L;
        if (n == 1) {
            return preOne;
        }
        if (n == 0) {
            return preTwo;
        }
        for (int i = 2; i <= n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }

    @Test
    public void fun() {
        long fibonacci = fibonacci(4);
    }
}
