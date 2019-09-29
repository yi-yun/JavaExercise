package exam.duxiaoman;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-29 19:40
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        cal(n, a);
    }

    private static void cal(int n, int[] a) {
        int x = (n - 1) / 2;
        int cnt = 0;
        for (int i = x; i >=1; i--) {
            int max = Math.max(Math.max(a[i - 1], a[i * 2 - 1]), a[i * 2]);
            a[i - 1] = 0;
            a[i * 2 - 1] = 0;
            a[i * 2] = 0;
            cnt += max;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                cnt += a[i];
            }
        }
        System.out.println(cnt);
    }

    @Test
    public void fun() {
        //1,2,5,6,7
        // int[] a = {1, 2, 3, 4, 5};
        int[] a = {1, 2, 5, 6, 7};
        cal(a.length, a);
    }
}
