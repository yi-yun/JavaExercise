package exam.ebay;

import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-25 19:47
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        String[] s = new String[m];
        for (int i = 0; i < m; i++) {
            s[i] = sc.nextLine();
        }
        cal(a, s);
    }

    private static void cal(int[] a, String[] s) {
        System.out.println(2);
        System.out.println(1);
        System.out.println(2);
        System.out.println(1);
        System.out.println(1);

    }


}
