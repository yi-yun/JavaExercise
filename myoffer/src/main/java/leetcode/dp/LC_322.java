package leetcode.dp;

import org.junit.Test;

/**
 * @class: LC_322
 * @description: 完全背包的变种
 * @author: yi-yun
 * @create: 2019-07-19 22:35
 **/
public class LC_322 {
    /**
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        int[] states = new int[amount + 1];
        int n = coins.length;
        for (int i = 0; i <= amount; i++) {
            states[i] = amount + 2;
        }
        states[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amount - coins[i]; j++) {
                states[j + coins[i]] = Math.min(states[j] + 1, states[j + coins[i]]);
            }
        }
        return states[amount] == amount + 2 ? -1 : states[amount];
    }

    @Test
    public void fun1() {
        coinChange(new int[]{1, 2, 5}, 11);
    }

    @Test
    public void fun2() {
        coinChange(new int[]{2}, 3);
    }
}
