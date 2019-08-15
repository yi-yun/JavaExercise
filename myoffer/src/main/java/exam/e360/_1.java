package exam.e360;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _1
 * @description: 立方体错误解法，心态爆炸
 * @author: yi-yun
 * @create: 2019-08-15 19:39
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextLong();
            }
        }
        System.out.println(cal(a));
    }

    private static long cal(long[][] a) {
        long n = a.length;
        long m = a[0].length;
        long res = n * m;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] <= 0) {
                    res--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            long max = Long.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                max = Math.max(a[i][j], max);
            }
            res += max;
        }
        for (int i = 0; i < m; i++) {
            long max = Long.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                max = Math.max(a[j][i], max);
            }
            res += max;
        }
        return res * 2;
    }

    @Test
    public void fun() {
        long[][] a = new long[][]{{100L, 100L}, {99L, 99L}};
        long cal = cal(a);
    }
}
