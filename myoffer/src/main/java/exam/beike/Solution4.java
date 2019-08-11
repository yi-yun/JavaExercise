package exam.beike;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
    }

    private static long cal(long[] a, int n) {
        long res = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long[] temp = Arrays.copyOf(a, n);
            long cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (temp[j - 1] >= temp[j]) {
                    long val = temp[j - 1] + 1 - temp[j];
                    cnt += val;
                    temp[j] = temp[j - 1] + 1;
                }
            }
            for (int j = n - 2; j >= i; j--) {
                if (temp[j] <= temp[j + 1]) {
                    long val = temp[j + 1] - temp[j] + 1;
                    cnt += val;
                    temp[j] = temp[j + 1] + 1;
                }
            }
            res = Math.min(res, cnt);
        }
        return res;
    }

    @Test
    public void fun() {
        long[] a = {1, 2, 4, 3, 5};
        long cal = cal(a, 5);
    }
}
