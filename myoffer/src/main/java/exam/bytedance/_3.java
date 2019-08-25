/*
package exam.bytedance;

import java.util.Scanner;

*/
/**
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-25 19:50
 **//*

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[][] a = new int[4][4];
        for (int i1 = 0; i1 < 4; i1++) {
            for (int i2 = 0; i2 < 4; i2++) {
                a[i1][i2] = sc.nextInt();
            }
        }
        cal(i, a);
    }

    private static void cal(int i, int[][] a) {
        if (i == 1) {//上
            for (int j = 3; j >= 0; j--) {
                //a[3][0] a[2][0] a[1][0] a[0][0]
                //a[3][1] a[2][1] a[1][1] a[0][1]
                //a[3][2] a[2][2] a[1][2] a[0][2]
                //a[3][3] a[2][3] a[1][3] a[0][3]
                for (int k = 3; k >= 0; k--) {
                    a[j][k]
                }
            }
        } else if (i == 2) {//下

        } else if (i == 3) {//左

        } else if (i == 4) {//右

        }
    }

    
}
*/
