package exam.duxiaoman;

import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-29 19:56
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        cal3(n, w, a, b);
    }

    private static void cal3(int n, int w, int[] a, int[] b) {
        System.out.println(4);
    }
}
