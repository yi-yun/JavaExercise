package algorithm;

import org.junit.Test;

import java.util.Arrays;

public class Sorts {
    @Test
    public void fun() {
        int[] a = {4, 5, 6, 3, 2, 1};
//        insertSort(a);
        seletionSort(a);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
    }

    //冒泡排序
    public void bubbleSort(int[] a) {
        int n = a.length;
        if (n == 1)
            return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }

    }

    //插入排序
    public void insertSort(int[] a) {
        int length = a.length;
        if (length <= 1)
            return;
        for (int i = 1; i < length; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else break;
            }
            a[j + 1] = value;
        }
    }

    //选择排序
    public void seletionSort(int[] a) {
        int length = a.length;
        if (length <= 1) return;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] < a[minIndex])
                    minIndex = j;
            }
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }

}
