package exam.zhaoshang;

import org.junit.Test;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-15 21:09
 **/
public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        cal(s);
    }

    private static void cal(String s) {
        int res = 0;
        Long min = Long.valueOf(s.replaceAll("\\?", "0"));
        Long max = Long.valueOf(s.replaceAll("\\?", "9"));
        for (long i = min; i <= max; i++) {
            if (i % 13 == 5) {
                StringBuilder sb = new StringBuilder();
                boolean flag = false;
                for (int j = 0; j < s.length(); j++) {
                    char at = s.charAt(j);
                    if (at != '?') {
                        flag = true;
                        sb.append(at);
                    } else if (!flag) {
                        sb.append("[0-9]{0,}");
                    } else {
                        sb.append("[0-9]{1,}");
                    }
                }
                String temp = sb.toString();
                if (Pattern.matches(temp, String.valueOf(i))) {
                    res++;
                }
            }
        }
        System.out.println(res % (1000000000 + 7));
    }

    @Test
    public void fun() {
        cal("???5");
        cal("2??");
    }
}
