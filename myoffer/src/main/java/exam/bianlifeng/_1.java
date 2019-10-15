package exam.bianlifeng;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-10-15 22:14
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int[] a = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            a[i] = Integer.parseInt(split[i]);
        }
        String s1 = sc.nextLine();
        String[] split1 = s1.split(" ");
        int[] b = new int[split1.length];
        for (int i = 0; i < split1.length; i++) {
            b[i] = Integer.parseInt(split1[i]);
        }
        cal(a, b);
    }

    //a 是工程师
    private static void cal(int[] a, int[] b) {
        int cnt = 0;
        Arrays.sort(b);
        Arrays.sort(a);
        boolean[] flag = new boolean[b.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++) {
                if (b[j] > a[i] && !flag[j]) {
                    flag[j] = true;
                    cnt++;
                    break;
                }
            }
        System.out.println(cnt);
    }


    @Test
    public void fun() {
        int[] a = {5, 10, 2, 9, 15, 9};
        int[] b = {6, 1, 20, 3, 8};
        cal(a, b);
    }
}
