package exam.xiaomi;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-11 19:57
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] sort = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sort[i] = a[i];
        }
        cal(a, sort);
    }

    private static void cal(int[] arr, int[] sort) {
        Arrays.sort(sort);
        Map<Integer, Integer> hashMap = new HashMap<>();
        // for (int i = sort.length - 1; i >= 0; i--) {
        // }
        for (int i = 0; i < sort.length; i++) {
             hashMap.put(sort[i], i);
        }
        
        int count = 0;
        boolean[] flag = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!flag[i]) {
                int j = i;
                while (!flag[j]) {
                    flag[j] = true;
                    j=hashMap.get(arr[j]);
                }
                count++;
            }
        }
        System.out.println(arr.length - count );
    }

    @Test
    public void fun() {
        int[] a = {4, 2, 7, 6};
        int[] b = {2, 6, 4, 7};
        cal(a, b);
    }
}
