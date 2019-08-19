package exam.shangtang;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-19 19:58
 **/
public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int f = sc.nextInt();
        System.out.println(cal(n, a, b, c, f));
    }

    private static long cal(long n, int a, int b, int c, int f0) {
        long[] longs = new long[(int) n + 1];
        if (n < 0L) {
            return 0;
        }
        if (n == 0) {
            longs[0] = 0;
            return f0;
        }
        long f1 = a * f0 + 2 * 1 * 1 - 1 + 32767;
        longs[1] = f1;
        long f2 = a * f1 + b * f0 + 2 * 2 * 2 - 2 + 32767;
        longs[2] = f2;
        long f3 = a * f2 + b * f1 + c * f0 + 2 * 3 * 3 - 3 + 32767;
        longs[3] = f3;
        if (n == 1) {
            return f1;
        } else if (n == 2) {
            return f2;
        } else if (n == 3) {
            return f3;
        } else {
            long r = 0;
            for (long i = 4L; i <= n; i++) {
                r = a * longs[(int) (i - 1)] + b * longs[(int) (i - 2)] + c * longs[(int) (i - 3)] + 2 * i * i - i + 32767;
                longs[(int) i] = r;
            }
            return longs[(int) n] % 1000000007;
        }
    }

    @Test
    public void fun() {
        long cal = cal(10L, 0, 0, 0, 100);
    }
}
