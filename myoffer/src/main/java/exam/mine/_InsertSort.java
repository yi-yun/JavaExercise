package exam.mine;

import org.junit.Test;

/**
 * @class: _InsertSort
 * @description: 插入排序练习
 * @author: yi-yun
 * @create: 2019-09-16 14:18
 **/
public class _InsertSort {
    public void insertSort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
    @Test
    public void fun() {
        int[] a = {9, 3, 4, 2, 6};
        insertSort(a);
    }
}
