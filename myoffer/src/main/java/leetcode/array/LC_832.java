package leetcode.array;

import org.junit.Test;

/**
 * @class: LC_832
 * @description: 翻转图片
 * @author: yi-yun
 * @create: 2019-07-13 17:11
 **/
public class LC_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] ^= 1;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length - 1 - j];
                A[i][A[i].length - 1 - j] = temp;
            }
        }
        return A;
    }

    @Test
    public void fun() {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        flipAndInvertImage(A);
    }
}
