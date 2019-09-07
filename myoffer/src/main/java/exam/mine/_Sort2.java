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
}
