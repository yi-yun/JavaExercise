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
        for (int i = 0; i < n; i++) {
            for (int j = m - A[i]; j >= 0; j--) {
                states[A[i] + j] = Math.max(states[A[i] + j], states[j] + A[i]);
            }
        }
        return states[m];
    }

    public int backPack2D(int m, int[] A) {
        int n = A.length;
        int[][] states = new int[n][m + 1];
        //初始化 states[0][]，也就是模拟第一件物品拿的过程
        for (int i = A[0]; i <= m; i++) {
            states[0][i] = A[0];
        }
        //第 i 件物品的决策
        for (int i = 1; i < n; i++) {
            //不拿
            for (int j = 0; j <= m; j++) {
                if (states[i - 1][j] > 0) {
                    states[i][j] = states[i - 1][j];
                }
            }
            //拿了，与之前比，选最大更新
            for (int j = 0; j <= m - A[i]; j++) {
                states[i][j + A[i]] = Math.max(states[i][j + A[i]], states[i - 1][j] + A[i]);
            }
        }
        return states[n - 1][m];
    }

    @Test
    public void fun1() {
        backPack2D(10, new int[]{3, 4, 8, 5});
    }


    @Test
    public void fun2() {
        backPack(12, new int[]{2, 3, 5, 7});
    }


    @Test
    public void fun3() {
        backPack2D(9, new int[]{2, 2, 4, 6, 3});
    }
}
