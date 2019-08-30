package exam.tap;

import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-29 20:36
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i > 0) {
                sum += a[i];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            sc.next();
        }
        System.out.println(sum);

    }
}
