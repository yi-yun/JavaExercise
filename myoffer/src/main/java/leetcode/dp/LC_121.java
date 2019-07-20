package leetcode.dp;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * @class: LC_121
 * @description: 买卖股票最多一次，求最大利润
 * @author: yi-yun
 * @create: 2019-07-20 14:12
 **/
public class LC_121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            res = Math.max(prices[i] - min, res);
        }
        return res;
    }

    @Test
    public void fun() {
        int[] arrays = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(arrays);
        Assert.assertThat(maxProfit, Is.is(maxProfit));
    }
}

