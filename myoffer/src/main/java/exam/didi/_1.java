package exam.didi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-27 18:58
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        cal(n, s);
    }

    private static void cal(int n, String s) {
        String[] a = s.split(" ");
        int[] b = new int[n];
        int c = 0;
        char[] d = new char[n - 1];
        int e = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                b[c++] = Integer.parseInt(a[i]);
            } else {
                d[e++] = a[i].charAt(0);
            }
        }

        // Arrays.sort(b);
        boolean[] f = new boolean[n];
        for (int i = 0; i < d.length; i++) {
            if (d[i] == '*') {
                if (b[i] > b[i + 1]) {
                    int t = b[i + 1];
                    b[i + 1] = b[i];
                    b[i] = t;
                }
                f[i] = true;
                f[i + 1] = true;
            }
            if (d[i] == '/' || d[i] == '-') {
                f[i] = true;
                f[i + 1] = true;
            }
        }
        for (int i = 0; i < d.length; i++) {
            
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(b[i]);
                break;
            } else {
                System.out.print(b[i] + " ");
            }
            System.out.print(d[i] + " ");
        }
    }

    @Test
    public void fun() {
        cal(6, "3 + 2 + 1 + -4 / -5 + 1");
    }
}
