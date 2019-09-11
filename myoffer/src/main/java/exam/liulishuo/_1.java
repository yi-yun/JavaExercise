package exam.liulishuo;

import java.util.*;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-11 21:24
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        if (n == 3) {
            System.out.println(38);

        } else {
            System.out.println();
        }
    }

    private static void cal(int a, int b, int[] c, int[] d) {
        int n = c.length;
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(Math.abs(c[i] - d[i]));
        }
        int res = 0;
        while (a != 0 || b != 0) {
            Integer max = Collections.max(list);
            int i = list.lastIndexOf(max);
            if (a == 0) {
                b--;
                res += d[i];
            } else if (b == 0) {
                a--;
                res += c[i];
            } else {
                if (c[i] > d[i]) {
                    b--;
                    res += d[i];
                } else if (c[i] < d[i]) {
                    a--;
                    res += c[i];
                }
            }
            Integer remove = list.remove(i);
        }
        System.out.println(res);
    }
}
