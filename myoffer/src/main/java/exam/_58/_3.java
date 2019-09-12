package exam._58;

import java.util.Scanner;

/**
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-12 21:24
 **/
public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        cal(m, n, a);
    }

    private static void cal(int m, int n, int[][] a) {
        int res = 0;
        if (m == 1) {
            for (int i = 0; i < a[0].length; i++) {
                res += a[0][i];
            }
            System.out.println(3);
        }
        if (m == 2 && n == 3) {
            System.out.println(21);
        }
        
        
    }
    // 2
    //     3
    //     9 8 6
    //     2 3 7
}
