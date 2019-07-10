package leetcode.array;

import org.junit.Test;

/**
 * @class: LC_509
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-10 23:57
 **/
public class LC_509 {
    @Test
    public void fun() {
        int fib = fib(2);
    }

    public int fib(int N) {
        int preOne = 0;
        int preTwo = 1;
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        int result = 0;
        for (int i = 0; i < N; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }
}
