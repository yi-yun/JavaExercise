package exam.zhuanzhuan;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-16 21:15
 **/
public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] a = new int[b];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        cal(a);
    }

    private static void cal(int[] a) {

        int length = a.length;
        int res = 0, head = 0;
        if (length < 2) {
            System.out.println(length);
            return;
        }
        for (int i = 0; i < length - 1; i++) {
            head++;
            if (res < head) {
                res = head;
            }
            if (a[i] >= a[i + 1]) {
                head = 0;
            }
            head++;
            if (res < head) {
                res = head;
            }
        }
        System.out.println(res);
    }
    
    @Test
    public void fun() {
        int[] a = {3, 1, 2, 5, 4};
        cal(a);
    }
}
