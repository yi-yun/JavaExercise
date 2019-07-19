package algorithm.dp;

import org.junit.Test;

/**
 * @class: _1_01Pack
 * @description: 01 背包问题
 * 有 N 件物品和一个容量为 V 的背包。放入第 i 件物品耗费的费用是 Ci ,得到的
 * 价值是 Wi 。求解将哪些物品装入背包可使价值总和最大。
 * 恰好装满的最大值   初始化为 0 -1……
 * 尽可能装满的最大值 00000000……
 * @author: yi-yun
 * @create: 2019-07-14 20:31
 **/
public class _1_ZeroOnePack {
    /**
     * weight 物品重量， n 物品总数，w 背包重量
     * 恰好装满 2D
     *
     * @param weight
     * @param n
     * @param w
     * @return 最大值
     */
    public void pack(int[] weight, int n, int w) {
        boolean[][] states = new boolean[n][w + 1];
        states[0][0] = true;
        if (weight[0] <= w) {
            states[0][weight[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            //j+weight[i],j
            for (int j = 0; j < w + 1; j++) {
                //不把物品放入
                if (states[i - 1][j]) {
                    states[i][j] = states[i - 1][j];
                }
            }
            for (int j = 0; j <= w - weight[i]; j++) {
                //把物品放入
                if (states[i - 1][j]) {
                    states[i][j + weight[i]] = true;
                }
            }
        }

    }

    //恰好装满 1D
    public void packOptimization(int[] weight, int n, int w) {
        boolean[] states = new boolean[w + 1];
        states[0] = true;
        if (weight[0] <= w) {
            states[weight[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int j = w - weight[i]; j >= 0; j--) {
                if (states[j]) {
                    states[j + weight[i]] = true;
                }
            }
        }
    }

    /**
     * weight 物品重量，values 物品价值， n 物品总数，w 背包重量
     * 恰好装满 2D
     *
     * @param weight
     * @param values
     * @param n
     * @param w
     */
    public void pack(int[] weight, int[] values, int n, int w) {
        int[][] states = new int[n][w + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w + 1; j++) {
                states[i][j] = -1;
            }
        }
        states[0][0] = 0;
        if (weight[0] <= w) {
            states[0][weight[0]] = values[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                if (states[i - 1][j] >= 0) {
                    states[i][j] = states[i - 1][j];
                }
            }
            for (int j = 0; j <= w - weight[i]; j++) {
                int v = states[i - 1][j] + values[i];
                if (v > states[i][j + weight[i]]) {
                    states[i][j + weight[i]] = v;
                }
            }
        }
    }

    /**
     * weight 物品重量，values 物品价值， n 物品总数，w 背包重量
     * 恰好装满 1D
     *
     * @param weight
     * @param values
     * @param n
     * @param w
     */
    public void packOptimization(int[] weight, int[] values, int n, int w) {
        int[] states = new int[w + 1];
        for (int i = 0; i < states.length; i++) {
            states[i] = -1;
        }
        states[0] = 0;
        if (weight[0] <= w) {
            states[weight[0]] = values[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = w - weight[i]; j >= 0; j--) {
                if (states[j] >= 0) {
                    int v = states[j] + values[i];
                    if (v > states[j + weight[i]]) {
                        states[j + weight[i]] = v;
                    }
                }
            }
        }
    }


    //尽量装满
    public void packOptimizationTest(int[] weight, int[] values, int n, int w) {
        int[] states = new int[w + 1];
        for (int i = 0; i < n; i++) {
            for (int j = w - weight[i]; j >= 0; j--) {
                int v = states[j] + values[i];
                if (v > states[j + weight[i]]) {
                    states[j + weight[i]] = v;
                }
            }
        }
    }

    @Test
    public void fun5() {
        //尽量装满
        packOptimizationTest(new int[]{2, 2, 4, 6, 3}, new int[]{3, 4, 8, 9, 6}, 5, 9);
    }

    @Test
    public void fun4() {
        //恰好装满
        packOptimization(new int[]{2, 2, 4, 6, 3}, new int[]{3, 4, 8, 9, 6}, 5, 9);
    }

    @Test
    public void fun3() {
        pack(new int[]{2, 2, 4, 6, 3}, new int[]{3, 4, 8, 9, 6}, 5, 9);
    }

    @Test
    public void fun2() {
        packOptimization(new int[]{2, 2, 4, 6, 3}, 5, 9);
    }

    @Test
    public void fun1() {
        pack(new int[]{2, 2, 4, 6, 3}, 5, 9);
    }

}
