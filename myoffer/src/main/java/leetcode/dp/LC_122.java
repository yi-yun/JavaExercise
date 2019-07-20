package leetcode.dp;

/**
 * @class: LC_122
 * @description: 买卖股票，可买卖多次，求最大利润
 * @author: yi-yun
 * @create: 2019-07-20 14:35
 **/
public class LC_122 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}
