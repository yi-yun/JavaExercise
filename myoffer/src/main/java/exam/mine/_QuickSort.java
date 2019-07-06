package exam.mine;

import org.junit.Test;

import java.util.Arrays;

public class _QuickSort {
    public void quick(int[] A, int l, int r) {
        if (l >= r) {
            return;
        }
        int t = part(A, l, r);
        quick(A, l, t - 1);
        quick(A, t + 1, r);
    }

    private int part(int[] a, int l, int r) {
        int value = a[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (a[j] < value) {
                //swap
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
            }
        }
        int temp = a[i];
        a[i] = a[r];
        a[r] = temp;
        return i;
    }

    @Test
    public void fun() {
        int[] a = {4, 5, 8, 3, 2, 1, 6, 232, 21, 12,};
        quick(a, 0, a.length - 1);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
    }
}
