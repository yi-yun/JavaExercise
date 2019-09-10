package exam.bilibili;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-10 20:13
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        cal(n);
    }

    private static void cal(long n) {
        int cnt = 0;
        for (long i = 1L; i <= (n - 1) / 2; i++) {
            int sum = 0;
            for (long j = i; j <= (n + 1) / 2; j++) {
                sum += j;
                if (sum == n) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt + 1);

    }

    private static void cal1(int n) {
        int left = 1, right = 2;
        int cnt = 0;
        int sum = left + right;
        while (left < (n + 1) / 2) {
            if (sum == n) {
                cnt++;
            }
            while (sum < n) {
                right++;
                sum += right;
                if (sum == n) {
                    cnt++;
                }
            }
            sum -= left;
            left++;
        }
        System.out.println(cnt + 1);
    }

    @Test
    public void fun() {
        cal1(15);
        cal1(5);
    }
}
