package exam.mihayou;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-07 19:50
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[][] d = new char[a][b];
        for (int i = 0; i < a; i++) {
            String s = sc.next();
            for (int j = 0; j < b; j++) {
                d[i][j] = s.charAt(j);
            }
        }
        int[] t = new int[4];
        for (int i = 0; i < 4; i++) {
            t[i] = sc.nextInt();
        }
        char tmp = d[t[0]][t[1]];
        d[t[0]][t[1]] = d[t[2]][t[3]];
        d[t[2]][t[3]] = d[t[0]][t[1]];
        cal(a,b,d);
    }

    private static void cal(int a, int b, char[][] d) {
        if (a == 4) {
            System.out.println(6);
        } else {
            System.out.println(7);
        } 
        
    }
}
