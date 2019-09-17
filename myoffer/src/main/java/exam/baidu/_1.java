package exam.baidu;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-17 19:35
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        cal(n, m, k);
    }

    private static void cal(long n, long m, long k) {
        long res = Long.MAX_VALUE;
        for (long i = n; i >= 0; i--) {
            for (long j = m; j > 0; j--) {
                if (i * j <= k) {
                    res = Math.min(res, n - i + m - j);
                }
            }
        }
        System.out.println(res);
    }

    @Test
    public void fun() {
        cal(12, 18, 100);
        cal(1, 1, 100);
        cal(5, 6, 3);
    }
}
