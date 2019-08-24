package exam.renren;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-24 10:27
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = sc.nextLong();
        int n = sc.nextInt();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        fun(sum, n, a);
    }

    private static void fun(long x, int n, Long[] a) {
        long res = 2 * x;
        Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            long temp = 0;
            for (int j = i; j < n; j++) {
                temp += a[j];
                if (temp >= x && temp <= 3 * x) {
                    res = Math.min(temp - x, res);
                    break;
                }
            }
        }
        if (res == 2 * x) {
            System.out.println(-1);
        } else {
            System.out.println(res + x);
        }
    }

    @Test
    public void fun() {
        Long[] a = {430L, 440L, 555L, 550L};
        fun(1000, 4, a);
    }

}
