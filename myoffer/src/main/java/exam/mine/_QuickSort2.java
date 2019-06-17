package exam.mine;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class _QuickSort2 {
    public void quickSort(int[] a, int left, int right) {
        if (left > right) return;
        int t = part(a, left, right);
        quickSort(a, left, t - 1);
        quickSort(a, t + 1, right);
    }

    private int part(int[] a, int left, int right) {
        int value = a[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (a[j] < value) {
                //swap a[i] a[j] i++
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        //a[i] a[right]
        a[right] = a[i];
        a[i] = value;
        return i;
    }

    @Test
    public void fun() {
        int[] a = {4, 5, 8, 3, 9, 7, 2, 1};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
