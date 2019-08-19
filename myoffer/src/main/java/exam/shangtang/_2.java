package exam.shangtang;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-19 20:26
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(cal(n, a));
    }

    private static int cal(int n, int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res = Integer.max(find(i, a) + 1, res);
        }
        return res;
    }

    private static int find(int i, int[] a) {
        int cnt = 0;
        for (int j = i - 1; j >= 0; j--) {
            if (a[j] < a[j + 1]) {
                cnt++;
            } else {
                break;
            }
        }
        if (cnt == 0) {
            return -1;
        }
        int cnt1 = 0;
        for (int j = i; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
                cnt1++;
            } else {
                break;
            }
        }
        if (cnt1 == 0) {
            return -1;
        }
        return cnt + cnt1;
    }

    @Test
    public void fun() {
        // int[] a = {9, 2, 5, 8, 4, 1, 7};
        int[] a = {8, 3, 8, 9};
        int cal = cal(7, a);
    }
}
