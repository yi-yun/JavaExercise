package exam.kuaishou;

import org.junit.Test;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-25 17:40
 **/
public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String a = fil(s1);
        String b = fil(s2);
        cal(a, b);

    }

    private static void cal(String a, String b) {
        int length = a.length();
        StringBuilder sb = new StringBuilder();
        int i = 1;
        int cnt = 0;
        while (length > i * 4 && cnt < b.length()) {
            sb.append(a.charAt(i * 4 - 4));
            sb.append(a.charAt(i * 4 - 3));
            sb.append(a.charAt(i * 4 - 2));
            sb.append(a.charAt(i * 4 - 1));
            sb.append(b.charAt(cnt));
            cnt++;
            i++;
        }
        if (length <= i * 4) {
            i = (i - 1) * 4;
            while (i < a.length()) {
                sb.append(a.charAt(i));
                i++;
            }
        }

        while (cnt < b.length()) {
            sb.append(b.charAt(cnt));
            cnt++;
        }

        StringBuilder result = new StringBuilder();
        String input = sb.toString();
        for (i = 0; i < input.length(); i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(input.charAt(i));
        }

        System.out.println(result.toString());


    }

    private static String fil(String s) {
        char[] a = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ') {
                sb.append(a[i]);
            }
        }
        return sb.toString();
    }

    @Test
    public void fun() {
        cal("123456789", "absd");
    }
}
