package exam.shunfeng;

import org.junit.Test;
import sun.awt.image.AbstractMultiResolutionImage;

import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-10 16:48
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        cal(next);
    }

    private static void cal(String next) {
        String[] s = next.split(":");
        int a = max(s[0]);
        int b = max(s[1]);
        int min = Math.max(a, b);
        int t = qwe1(s[0], a);
        int u = qwe2(s[1], b);
        int max = Integer.MIN_VALUE;
        if (t == -1 && u == -1) {
            System.out.println(0);
            return;
        } else if (t == -1 && u != -1) {
            max = u;
        } else if (u == -1 && t != -1) {
            max = t;
        } else if (u == 100 && t == 100) {
            System.out.println(0);
            return;
        } else {
            max = Math.min(t, u);
        }
        if (min > max) {
            System.out.println(-1);
            return;
        }
        for (int i = min; i <= max; i++) {
            if (i == max) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
        }
    }

    private static int qwe1(String s, int a) {
        while (a <= 100) {
            int temp = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char at = s.charAt(i);
                if (at >= '0' && at <= '9') {
                    int index = at - '0';
                    temp += index * Math.pow(a, s.length() - i - 1);
                } else {
                    int index = at - 55;
                    temp += index * Math.pow(a, s.length() - i - 1);
                }
            }
            if (temp == 0) {
                return -1;
            }
            if (temp > 24) {
                break;
            }
            a++;
        }
        return a;
    }

    private static int qwe2(String s, int a) {
        int b = a;
        while (a <= 100) {
            int temp = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char at = s.charAt(i);
                if (at >= '0' && at <= '9') {
                    int index = at - '0';
                    temp += index * Math.pow(a, s.length() - i - 1);
                } else {
                    int index = at - 55;
                    temp += index * Math.pow(a, s.length() - i - 1);
                }
            }
            if (temp == 0) {
                return -1;
            }
            if (temp > 59) {
                if (a == b) {
                    return b;
                }
                return a - 1;
            }
            a++;

        }
        return a;
    }

    private static int max(String s) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                max = Math.max(s.charAt(i) - '0', max);
            } else {
                max = Math.max(s.charAt(i) - 55, max);
            }
        }
        return max + 1;
    }

    @Test
    public void fun() {
        // System.out.println(qwe1("00002", 3));
        System.out.println(qwe2("00130", 4));
        System.out.println(qwe2("00Z2", 36));
        cal("00002:000Z2");
        // cal("00002:00130");
        // int max = max("0000Z");
        // // System.out.println('A' - '0' - 7);
        // System.out.println(max);

    }

}
