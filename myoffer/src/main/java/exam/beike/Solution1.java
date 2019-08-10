package exam.beike;

import java.util.Scanner;

/**
 * @class: Solution1
 * @description: 绝对值最小的相邻数据对
 * @author: yi-yun
 * @create: 2019-08-10 21:12
 **/
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long res = Long.MAX_VALUE;
        int idx = 0;
        for (int i = 1; i < n; i++) {
            long val = Math.abs(a[i] - a[i - 1]);
            if (val < res) {
                res = val;
                idx = i;
            }
        }
        System.out.println(a[idx - 1] + " " + a[idx]);
    }
}
