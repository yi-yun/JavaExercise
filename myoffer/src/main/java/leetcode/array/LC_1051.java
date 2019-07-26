package leetcode.array;

import org.junit.Test;

/**
 * @class: LC_1051
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-13 18:50
 **/
public class LC_1051 {
    public int heightChecker(int[] heights) {
        int[] helper = new int[100];
        for (int height : heights) {
            helper[height - 1]++;
        }
        int res = 0;
        for (int i = 0, j = 0; i < helper.length; i++) {
            while (helper[i]-- > 0) {
                if (i + 1 != heights[j++]) {
                    res++;
                }
            }
        }
        return res;
    }

    @Test
    public void fun() {
        int[] arrays = {31, 81, 41, 78, 48, 2, 83, 48, 21, 20, 43, 15, 26, 78, 96, 55, 5, 46, 35, 89, 85, 54, 76, 64, 71, 36, 98, 94, 100, 7, 88, 92, 80, 43, 24, 89, 50, 61, 59, 20, 94, 57, 99, 62, 82, 46, 28, 57, 66, 62, 56, 15, 12, 63, 19, 35, 12, 26, 15, 59, 8, 44, 46, 45, 33, 20, 27, 31, 85, 15, 92, 63, 63, 40, 35, 95, 91, 1, 4, 57, 55, 68, 53, 28, 15, 94, 74, 89, 77, 7, 25, 63, 77, 24, 76, 44};
        int cnt = heightChecker(arrays);
    }
}
