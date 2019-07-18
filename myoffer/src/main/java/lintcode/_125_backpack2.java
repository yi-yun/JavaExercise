package lintcode;

import org.junit.Test;

/**
 * @class: _125_backpack2
 * @description: 背包问题2
 * @author: yi-yun
 * @create: 2019-07-18 22:14
 **/
public class _125_backpack2 {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @param V: Given n items with value V[i]
     * @return: The maximum value
     */
    //恰好装满
    public int backPackII(int m, int[] A, int[] V) {
        // write your code here
        int n = A.length;
        int[] states = new int[m + 1];
        for (int i = 0; i < m + 1; i++) {
            states[i] = Integer.MIN_VALUE;
        }
        states[0] = 0;
        if (A[0] <= m) {
            states[A[0]] = V[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = m - A[i]; j >= 0; j--) {
                if (states[j] >= 0) {
                    states[j + A[i]] = Integer.max(states[j] + V[i], states[j + A[i]]);
                }
            }
        }
        int res = Integer.MIN_VALUE;
        for (int i = m; i >= 0; i--) {
            res = Integer.max(res, states[i]);
        }
        return res;
    }

    //尽量装满 m 最大重量  A 重量数组    V 价值的数组
    public int backPackII2(int m, int[] A, int[] V) {
        // write your code here
        int n = A.length;
        int[] states = new int[m + 1];
        for (int i = 0; i < m + 1; i++) {
            states[i] = 0;
        }
        if (A[0] <= m) {
            states[A[0]] = V[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = m - A[i]; j >= 0; j--) {
                states[j + A[i]] = Integer.max(states[j] + V[i], states[j + A[i]]);
            }
        }
        return states[m];
    }


    @Test
    public void fun1() {
        backPackII(10, new int[]{2, 3, 5, 7}, new int[]{1, 5, 2, 4});
    }

    @Test
    public void fun2() {
        backPackII2(200,
            new int[]{79, 58, 86, 11, 28, 62, 15, 68},
            new int[]{83, 14, 54, 79, 72, 52, 48, 62});
    }

    @Test
    public void fun3() {
        backPackII(10,
            new int[]{2, 3, 8},
            new int[]{2, 5, 8});
    }
}
