package exam.bilibili;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-10 20:03
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        cal(a, b);
    }

    private static void cal(String a, String b) {
        int length1 = a.length();
        int length2 = b.length();
        int[] dp = new int[length1 + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = i;
        }
        for (int j = 1; j <= length2; j++) {
            int pre = dp[0];
            dp[0] = j;
            for (int i = 1; i <= length1; i++) {
                int y = dp[i];
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i] = pre;
                } else {
                    dp[i] = 1 + Math.min(pre, Math.min(dp[i], dp[i - 1]));
                }
                pre = y;
            }
        }
        System.out.println(dp[length1]);
    }
    @Test
    public void fun() {
        cal("abc", "abd");
    }
}
