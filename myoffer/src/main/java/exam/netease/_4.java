package exam.netease;

import org.junit.Test;

import java.util.*;

/**
 * @class: _3
 * @description: 序列维护，大于的数-1 并统计个数
 * @author: yi-yun
 * @create: 2019-08-03 15:37
 **/
public class _4 {

    //暴力较慢
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < q; i++) {
            int arg = sc.nextInt(), cnt = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] >= arg) {
                    array[j]--;
                    cnt++;
                }
            }
            //System.out.println(Arrays.toString(array));
            System.out.println(cnt);
        }
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < q; i++) {
            int arg = sc.nextInt(), cnt = 0;
            //既然排序了用二分法出来位置然后前面的数-1
            //排除最大最小，防止下标越界
        }
    }

    private static int find(int[] a, int key) {
        int left = 0, right = a.length - 1;
        //left,num,right
        while (left < right - 1) {
            int mid = (right - left) / 2 + left;
            if (a[mid] > key) {
                right = mid;
            } else if (a[mid] < key) {
                left = mid;
            } else {
                return mid;
            }
        }
        return left;
    }

    @Test
    public void fun() {
        int[] ints = {1, 2, 3, 4, 5};
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < ints.length; i++) {
                ints[i]--;
            }
        }

    }

    @Test
    public void fun1() {
        int[] ints = {1, 4, 5, 7, 9};
        find(ints, 6);
    }
}
