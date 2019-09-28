package exam.shence;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-28 15:14
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        cal(n, a, m, b);
    }

    private static void cal(int n, int[] a, int m, int[] b) {
        int cnt = 0;
        boolean[] flag = new boolean[n];
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < m; i++) {
            int index = find(b[i], a);
            if (!flag[index]) {
                flag[index] = true;
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static int find(int sou, int[] a) {
        int left = 0, right = a.length - 1;
        while (left < right - 1) {
            int mid = (right - left) / 2 + left;
            if (a[mid] <= sou && a[mid + 1] >= sou) {
                return mid;
            } else if (a[mid] > sou) {
                right = mid - 1;
            } else if (a[mid] < sou) {
                left = mid + 1;
            }
        }
        if (a[right] >= sou) {
            return right;
        } else return left;
    }
}
