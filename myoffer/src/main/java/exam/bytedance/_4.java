package exam.bytedance;


import org.junit.Test;

import java.util.*;

/**
 * @class: _4
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-25 19:37
 **/

public class _4 {


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
        int res = Integer.MIN_VALUE;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            int j = 0;
            HashSet<Integer> set = new HashSet<>();
            while (j < n) {
                if (a[i] != a[j] && jud(temp, a[j]) && !set.contains(a[j])) {
                    set.add(temp);
                    set.add(a[j]);
                    temp = a[j];

                    j = 0;
                } else {
                    j++;
                }
            }
            res = Math.max(res, set.size());
        }
        System.out.println(res);
    }

    private static boolean jud(int a, int b) {
        if (a < b) {
            int z = a;
            a = b;
            b = z;
        }
        int i = a % b;
        while (i != 0) {
            a = b;
            b = i;
            i = a % b;
        }
        if (b == 1) {
            return false;
        } else {
            return true;
        }
    }


    @Test
    public void fun() {
        // int[] a = {20, 50, 22, 74, 9, 63}; //4
        int[] a = {2, 3, 7, 168};//3
        // int[] a = {2, 3, 7, 168, 49};//4
        // int[] a = {2, 3, 7, 168, 49, 35};//5

        cal(a.length, a);
    }
}
