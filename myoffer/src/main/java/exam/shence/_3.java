package exam.shence;

import java.util.Scanner;


/**
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-28 15:39
 **/
public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sou = sc.nextInt();
        String s = sc.next();
        String[] s1 = s.split(" ");
        int[] a = new int[s1.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s1[i]);
        }
        cal1(a, sou);
    }

    private static void cal1(int[] a, int sou) {
        System.out.println(-1);
    }
}
