package leetcode.array;

import java.util.Arrays;

/**
 * @class: LC_561
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-12 23:53
 **/
public class LC_561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }
}
