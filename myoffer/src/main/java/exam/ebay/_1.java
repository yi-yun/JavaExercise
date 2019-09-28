package exam.ebay;

import org.junit.Test;

import java.util.Scanner;


/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-25 19:44
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        cal(s);
    }

    private static void cal(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            match1(sb.toString(), s);
        }
        System.out.println();
    }

    private static void match1(String sb, String s) {
        int len = s.length();
        int sLen = sb.length();
        if (len % sLen != 0) {
            System.out.print(0);
        } else {
            int beishu = len / sLen;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < beishu; i++) {
                stringBuilder.append(sb);
            }
            if (stringBuilder.toString().equals(s)) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }

    @Test
    public void funMa() {
        // match1("asd", "asdasdas");
        cal("abbabbabb");
    }
}
