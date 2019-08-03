package exam.netease;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-03 16:13
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Integer[] array = new Integer[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            Arrays.sort(array, Collections.reverseOrder());
            Integer max = array[0];
            Integer max2 = array[1];
            Integer max3 = array[2];
            if (max >= max2 + max3) {
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }

    @Test
    public void fun() {
        Integer[] integers = {1, 1, 8, 62, 7, 34, 2};
        Arrays.sort(integers, Collections.reverseOrder());
    }
}
