package lintcode;

import org.junit.Test;

/**
 * @class: _92_backpack
 * @description: 01背包，尽量装满
 * @author: yi-yun
 * @create: 2019-07-18 21:55
 **/
public class _92_backpack {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        // write your code here
        int n = A.length;
        int[] states = new int[m + 1];
        if (A[0] <= m) {
            states[A[0]] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = m - A[i]; j >= 0; j--) {
                states[A[i] + j] = Math.max(states[A[i] + j], states[j] + A[i]);
            }
        }
        return states[m];
    }

    @Test
    public void fun1() {
        backPack(10, new int[]{3, 4, 8, 5});
    }

    @Test
    public void fun2() {
        backPack(12, new int[]{2, 3, 5, 7});
    }
}
