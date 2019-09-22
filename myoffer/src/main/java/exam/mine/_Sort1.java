package exam.mine;

import org.junit.Test;

import java.util.Arrays;

/**
 * @class: _Sort1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-09 21:57
 **/
public class _Sort1 {
    public void insertSort1(int[] a) {
        if (a == null || a.length <= 1) {
            return;
        }
        int length = a.length;
        for (int i = 1; i < length; i++) {
            int j = i - 1;
            for (int k = j; k >= 0 && a[k] > a[k + 1]; k--) {
                // swap a[k+1] a[k]
            }
        }
    }


    public void insertSort(int[] a) {
        int length = a.length;
        if (length <= 1) {
            return;
        }
        for (int i = 1; i < length; i++) {
            int j = i - 1;
            int val = a[i];
            for (; j >= 0; j--) {
                if (a[j] > val) {
                    a[j + 1] = a[j];
                } else break;
            }
            a[j + 1] = val;
        }
    }

    public void quickSort(int[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = part(s, left, right);
        quickSort(s, left, i - 1);
        quickSort(s, i + 1, right);
    }

    private int part(int[] s, int left, int right) {
        int val = s[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (s[j] < val) {
                if (i == j) {
                    i++;
                } else {
                    //swap s[j] s[i]
                    int temp = s[j];
                    s[j] = s[i];
                    s[i] = temp;
                    i++;
                }
            }
        }
        //s[right],s[i]
        s[right] = s[i];
        s[i] = val;
        return i;
    }

    @Test
    public void funQuickSort() {
        int[] arrays = {6, 2, 4, 7, 2, 9, 1};
        quickSort(arrays, 0, arrays.length - 1);
        System.out.println(Arrays.toString(arrays));
    }

    @Test
    public void funMergeSort() {
        int[] arrays = {6, 2, 4, 7, 5, 9, 1};
        mergeSort(arrays, 0, arrays.length - 1);
    }

    public void mergeSort(int[] a, int l, int r) {
        if (l == r) {
            return;
        }
        int m = (r - l) / 2 + l;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);
        merge(a, l, m, r);
    }

    private void merge(int[] a, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int p1 = l, p2 = m + 1, i = 0;
        while (p1 <= m && p2 <= r) {
            help[i++] = a[p1] < a[p2] ? a[p1++] : a[p2++];
        }
        while (p1 <= m) {
            help[i++] = a[p1++];
        }
        while (p2 <= r) {
            help[i++] = a[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            a[j + l] = help[j];
        }
    }

}
