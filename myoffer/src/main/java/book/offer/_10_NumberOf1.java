package book.offer;

import org.junit.Test;

/**
 * @class: _10_NumberOf1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-06 16:41
 **/
public class _10_NumberOf1 {
    public int number(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    @Test
    public void fun() {
        int number = number(6);
    }
}
