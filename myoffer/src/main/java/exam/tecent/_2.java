package exam.tecent;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-17 20:13
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = 2;
        int a = q << (n - 1);
        int[] s = new int[a];
        for (int i = 0; i < a; i++) {
            s[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] ints = new int[m];
        for (int i = 0; i < m; i++) {
            ints[i] = sc.nextInt();
        }
        cal(a, s, m, ints);
    }

    private static void cal(int a, int[] s, int m, int[] ints) {
        for (int i = 0; i < m; i++) {
            int r = 0;
            int t = 2 << (ints[i] - 1);
            if (ints[i] == 0) {
                t = 1;
            }
            while (r <= a) {
                rev(s, r, r + t);
                r += t;
            }
            int cnt = 0;
            for (int e = 0; e < a; e++) {
                for (int j = e; j < a; j++) {
                    if (s[e] > s[j]) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }

    private static void rev(int[] s, int j, int y) {
        if (y > s.length) {
            y = s.length;
        }
        /*Stack<Integer> stack = new Stack<>();
        for (int i = j; i < y; i++) {
            stack.add(s[i]);
        }
        for (int i = j; i < y; i++) {
            s[i] = stack.pop();
        }*/
         
    }

    @Test
    public void fun() {
        /*int[] a = {1, 5, 4, 2, 6, 53, 3, 9};
        cal(a.length, a, 1, new int[]{2});*/
        cal(4, new int[]{2, 1, 4, 3}, 4, new int[]{1, 2, 0, 2});
    }

    @Test
    public void fun1() {
        int[] a = {12, 2, 3, 6, 42, 1, 5};
        rev(a, 1, 5);
    }
}
