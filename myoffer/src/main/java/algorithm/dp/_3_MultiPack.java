package algorithm.dp;

import org.junit.Test;

/**
 * @class: _3_MultiPack
 * @description: 有 N 种物品和一个容量为 V 的背包。
 * 第 i 种物品最多有 Mi 件可用,每件耗费的空间是 Ci ,价值是 Wi。
 * 求解将哪些物品装入背包可使这些物品的耗费的空间总和不超过背包容量,且价值总和最大。
 * @author: yi-yun
 * @create: 2019-07-20 16:41
 **/
public class _3_MultiPack {
    /**
     * 零一背包
     *
     * @param cost
     * @param value
     * @param dp
     * @param m
     */
    public void ZeroOnePack(int cost, int value, int[] dp, int m) {
        for (int i = m - cost; i >= 0; i--) {
            dp[i + cost] = Math.max(dp[i + cost], dp[i] + value);
        }
    }

    /**
     * 完全背包
     *
     * @param cost
     * @param value
     * @param dp
     * @param m
     */
    public void CompletePack(int cost, int value, int[] dp, int m) {
        for (int i = 0; i <= m - cost; i++) {
            dp[i + cost] = Math.max(dp[i] + value, dp[i + cost]);
        }
    }

    /**
     * @param w
     * @param weight
     * @param sizes
     * @param values
     */
    public void pack(int w, int[] weight, int[] sizes, int[] values) {
        int[] states = new int[w + 1];
        for (int i = 0; i < weight.length; i++) {
            MultiPack(weight[i], values[i], sizes[i], states, w);
        }

    }

    
    private void MultiPack(int cost, int value, int amount, int[] dp, int m) {
        //完全背包
        if (cost * amount >= m) {
            CompletePack(cost, value, dp, m);
            return;
        }
        int s = 1;
        while (s < amount) {//条件：amount-s>0
            ZeroOnePack(s * cost, s * value, dp, m);
            amount -= s;
            s *= 2;
        }
        ZeroOnePack(amount * cost, amount * value, dp, m);
    }

    @Test
    public void fun() {
        pack(5, new int[]{1, 2, 3, 4}, new int[]{3, 1, 3, 2}, new int[]{2, 4, 4, 5});
    }
}

