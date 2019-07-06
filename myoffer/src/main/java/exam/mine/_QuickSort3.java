package exam.mine;

import org.junit.Test;

public class _QuickSort3 {
    private void quickSort(int[] array, int l, int r) {
        if (l >= r) {
            return;
        }
        int part = part(array, l, r);
        quickSort(array, l, part - 1);
        quickSort(array, part + 1, r);
    }

    private int part(int[] array, int left, int right) {
        int value = array[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (array[j] < value) {
                //swap a[j] [i]
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        //swap a[right] a[i]
        array[right] = array[i];
        array[i] = value;
        return i;
    }

    @Test
    public void fun() {
        int[] a = {5, 7, 23, 2, 1, 53, 98, 76, 43};
        quickSort(a, 0, a.length - 1);
    }
}
