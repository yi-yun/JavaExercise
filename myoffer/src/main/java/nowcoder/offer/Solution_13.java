package nowcoder.offer;

import org.junit.Test;

/**
 * @class: Solution_13
 * @description: 奇数在前，偶数在后
 * @author: yi-yun
 * @create: 2019-07-29 23:43
 **/
public class Solution_13 {
    public void reOrderArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Test
    public void fun() {
        int[] arrays = {1, 2, 3, 4, 5, 6};
        reOrderArray(arrays);
    }
}
