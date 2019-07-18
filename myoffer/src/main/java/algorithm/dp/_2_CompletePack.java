package algorithm.dp;

import org.junit.Test;

/**
 * @class: _2_CompletePack
 * @description: 完全背包
 * @author: yi-yun
 * @create: 2019-07-17 22:35
 **/
public class _2_CompletePack {
    /**
     * 完全背包
     * 就是能放好多个相同的物品
     * 尽量装满，价值最大
     *
     * @param weight
     * @param values
     * @param n
     * @param w
     */
    public void pack(int[] weight, int[] values, int n, int w) {
        int[] states = new int[w + 1];
        /*for (int i = 0; i < states.length; i++) {
            states[i] = Integer.MIN_VALUE;
        }*/

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= w - weight[i]; j++) {
                states[j + weight[i]] = Integer.max(states[j + weight[i]], states[j] + values[i]);
            }
            /*for (int j = weight[i]; j <= w; j++) {
                states[j] = Math.max(states[j - weight[i]] + values[i], states[j]);
            }*/
        }
    }


    @Test
    public void fun() {
        pack(new int[]{5, 3, 4}, new int[]{20, 10, 12}, 3, 35);
    }

}
