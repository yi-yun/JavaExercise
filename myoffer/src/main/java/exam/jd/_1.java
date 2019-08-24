package exam.jd;

import org.junit.Test;

import java.util.*;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-24 18:53
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        cal(n, a);
    }

    private static void cal1(int n, long[] a) {
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                res++;
            }
        }
        System.out.println(res + 1);
    }

    private static void cal(int n, long[] a) {
        int res = 0;
        Stack<Long> stack = new Stack<>();
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                stack.push(a[i]);
            } else {
                Iterator<Long> iterator = stack.iterator();
                while (iterator.hasNext()) {
                    max = Math.max(iterator.next(), max);
                    min = Math.min(iterator.next(), min);
                }
                if (a[i] >= max) {
                    while (!stack.isEmpty()) {
                        stack.pop();
                    }
                    stack.push(a[i]);
                    res++;
                } else if (a[i] <= min) {
                    stack.push(a[i]);
                } else {
                    stack.push(a[i]);
                }
            }
        }
        if (!stack.isEmpty()) {
            res++;
        }
        System.out.println(res);
    }

    @Test
    public void fun() {
        long[] b = {/*69079936L,
            236011312L, 77957850L,
            653604087L, 443890802L, 577126428L, 567126428L,*/
            765625552L,
            785625552L,
            748751840L,
            993860213L, 882053548L, 892053548L};
        cal(b.length, b);
    }

    @Test
    public void fun1() {
        long[] a = {2L, 1L, 3L, 2L};
        cal(a.length, a);
    }
}
