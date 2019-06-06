package exam.maoyan;

import org.junit.Test;

import java.util.Arrays;

public class _2_BubbleSort {
    public void SortBubble(int[] a) {
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    @Test
    public void funbubbleSort() {
        int[] a = {4, 5, 6, 3, 2, 1};
        SortBubble(a);
        System.out.println(Arrays.toString(a));
    }
}
