package exam.beike;

import org.junit.Test;

import java.util.Arrays;

/**
 * @class: Solution3
 * @description: 暴力计数
 * @author: yi-yun
 * @create: 2019-08-10 22:02
 **/
public class Solution3 {
    @Test
    public void fun() {
        int count = count(5, new long[]{1, 2, 1, 1, 1});
    }

    public static int count(int n, long[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] <= (nums[i] * 10 / 9)) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
