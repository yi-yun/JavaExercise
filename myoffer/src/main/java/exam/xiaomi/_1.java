package exam.xiaomi;

import org.junit.Test;

import java.util.Scanner;

/**
 * @class: _1
 * @description:
 * @author: yi-yun
 * @create: 2019-09-11 19:00
 **/
public class _1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.nextLine();
        a = sc.nextLine();
        String[] m = a.split(" ");
        int length = m.length;
        int[][] array = new int[n][length];
        for (int i = 0; i < m.length; i++) {
            array[0][i] = Integer.parseInt(m[i]);
        }
        for (int i = 1; i < n; i++) {
            String next = sc.nextLine();
            String[] s = next.split(" ");
            for (int j = 0; j < s.length; j++) {
                array[i][j] = Integer.parseInt(s[j]);
            }
        }

        cal(array, n, length);
    }

    private static void cal(int[][] array, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //求array[i][j]
                for (int k = j; k < m; k++) {
                    if (array[i][k] != 0) {
                        if (k < m - 1) {
                            if (array[i][k] != array[i][k + 1]) {
                                int temp = array[i][k];
                                array[i][k] = 0;
                                array[i][j] = temp;
                            } else {
                                int temp = array[i][k] * 2;
                                array[i][k] = 0;
                                array[i][k + 1] = 0;
                                array[i][j] = temp;
                            }
                        } else {
                            int temp = array[i][k];
                            array[i][k] = 0;
                            array[i][j] = temp;
                        }
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    @Test
    public void fun() {
        int[][] a = {{0, 0, 2, 4}, {0, 2, 2, 2}, {0, 4, 2, 2}, {8, 8, 2, 2}};
        cal(a, 4, 4);
    }


}
