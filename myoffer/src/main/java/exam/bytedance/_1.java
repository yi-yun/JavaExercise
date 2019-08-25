package exam.bytedance;

import org.junit.Test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-25 18:53
 **/
public class _1 {
    public static Set<Integer> set = new HashSet<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        cal(n, a);
    }

    /*private static void cal(int n, int[][] a) {
        int res = n;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i][j] >= 3) {
                    res--;
                }
            }
        }
        if (res == 0) {
            res++;
        }
        System.out.println(res);
    }*/
    private static void cal(int n, int[][] a) {
        int res = n;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i][j] >= 3) {
                    set.add(i);
                    set.add(j);
                }
            }
        }
        System.out.println(res - set.size()+1);
    }

    @Test
    public void fun() {
        // int[][] a = {{0, 4, 0}, {4, 0, 6}, {0, 6, 0}};
        // int[][] a = {{0, 4, 1}, {4, 0, 6}, {1, 6, 0}};//1
        int[][] a = {{0, 4, 1}, {4, 0, 6}, {1, 6, 0}};//1
        // int[][] a = {{0, 4, 5}, {4, 0, 6}, {5, 6, 0}};//1
        // int[][] a = {{0, 4, 0}, {4, 0, 0}, {0, 0, 0}}; //2
        cal(a.length, a);
    }
}
