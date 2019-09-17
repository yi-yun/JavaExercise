package exam.mine;

import org.junit.Test;

import java.util.Arrays;

/**
 * @class: _Sort2
 * @description: 冒泡排序
 * @author: yi-yun
 * @create: 2019-09-07 21:11
 **/
public class _Sort2 {
    public void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    //swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    @Test
    public void fun() {
        int[] a = {5, 6, 8, 2, 4, 9};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public void insertSort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            int value = a[i];
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                }
            }
            a[j + 1] = value;
        }
    }

    public void quickSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = part(a, left, right);
        quickSort(a, left, index - 1);
        quickSort(a, index + 1, right);
    }

    private int part(int[] a, int left, int right) {
        int val = a[right];
        int j = left;
        for (int i = left; i < right; i++) {
            if (a[i] < val) {
                //swap a[i] a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        //swap
        a[right] = a[j];
        a[j] = val;
        return j;
    }

    @Test
    public void fun1() {
        int[] a = {1, 3, 2, 4, 8, 2};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }


    public void _bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    //swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
    @Test
    public void fun2() {
        int[] a = {1, 3, 2, 4, 8, 2};
        _bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
