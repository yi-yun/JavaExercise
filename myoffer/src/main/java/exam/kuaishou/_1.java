package exam.kuaishou;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-25 16:51
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s2 = sc.nextLine();
        int m = Integer.parseInt(s2);
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            cal(s1);
        }
    }

    private static void cal(String[] s) {
        String a = s[0];
        String b = s[1];
        int cea = ce(a);
        int ceb = ce(b);
        StringBuilder buildera = new StringBuilder(a);
        StringBuilder builderb = new StringBuilder(b);
        if (cea < ceb) {
            while (ceb - cea > 0) {
                buildera.append(".0");
                cea++;
            }
        } else if (cea > ceb) {
            while (cea - ceb > 0) {
                builderb.append(".0");
                ceb++;
            }
        }
        int f1 = f1(buildera.toString());
        int f2 = f1(builderb.toString());
        if (f1 < f2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static int ce(String a) {
        int cnta = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '.') {
                cnta++;
            }
        }
        return cnta;
    }

    private static int f1(String s) {
        StringBuilder sb = new StringBuilder();
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != '.') {
                sb.append(a[i]);
            }
        }
        return Integer.parseInt(sb.toString());

    }

    @Test
    public void fun() {
        // String[] s = {"1", "1.0"};
        String[] s = {"2.00", "2"};
        cal(s);
    }

}
