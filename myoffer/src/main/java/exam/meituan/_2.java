package exam.meituan;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-11 16:33
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cal(n);
    }

    private static void cal(int n) {
        char[] a = {'A', 'B', 'A', 'C'};
        for (int i = 0; i < n / 4; i++) {
            System.out.print(a);
        }
        for (int i = 0; i < n % 4; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    @Test
    public void fun() {
        cal(1);
        cal(2);
        cal(3);
        cal(4);
        cal(5);
    }
}
