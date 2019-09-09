package exam.qianxin;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-09 19:49
 **/
public class _2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = (int) (Math.pow(2, n) - 1);
        int[] a = new int[d];
        for (int i = 0; i <d; i++) {
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        cal(a, b, c);

    }

    private static void cal(int[] a, int b, int c) {
        int left = b;
        int right = c;

        if (left > right) {
            int temp = left;
            left = right;
            right = temp;
        }
        int index = 0;
        while (true) {
            if (a[index] < left) {
                index = index * 2 + 2;
            } else if (a[index] > right) {
                index = index * 2 + 1;
            } else {
                System.out.println(a[index]);
                break;
            }
        }
    }

    private static int find(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }
        }
        return 1;
    }

    @Test
    public void fun() {
        int[] a = {9, 6, 15, 2, -1, 12, 25, -1, -1, -1, -1, -1, -1, 20, 37};
        cal(a, 12, 20);
    }
}
