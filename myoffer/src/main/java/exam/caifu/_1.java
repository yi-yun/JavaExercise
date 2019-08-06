package exam.caifu;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-06 19:39
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split(" ");
        if (strings[0].length() + strings[1].length() != strings[3].length()) {
            System.out.println("FALSE");
        }
        if (fun(strings[0], strings[1], strings[2])) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    private static boolean fun(String str1, String str2, String str3) {
        int len1 = str1.length(), len2 = str2.length(), len3 = str3.length();
        boolean[][] states = new boolean[len1 + 1][len2 + 1];
        states[0][0] = true;
        int i = 1, j = 1;
        while (i <= len1 && str1.charAt(i - 1) == str3.charAt(i - 1))
            states[i++][0] = true;
        while (j <= len2 && str2.charAt(j - 1) == str3.charAt(j - 1))
            states[0][j++] = true;
        for (i = 1; i <= len1; i++) {
            for (j = 1; j <= len2; j++) {
                if ((states[i - 1][j] && str1.charAt(i - 1) == str3.charAt(i + j - 1)) || (states[i][j - 1] && str2.charAt(j - 1) == str3.charAt(i + j - 1)))
                    states[i][j] = true;
            }
        }
        return states[len1][len2];
    }
    
    /*@Test
    public void fun(){
        boolean fun = fun("aabcc", "dbbca", "aadbbcbcac");
    }*/
}
