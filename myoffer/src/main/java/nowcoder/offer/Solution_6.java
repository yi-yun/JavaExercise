package nowcoder.offer;

import org.junit.Test;

/**
 * @class: Solution_6
 * @description: 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author: yi-yun
 * @create: 2019-07-14 18:56
 **/
public class Solution_6 {
    public int minNumberInRotateArray(int[] array) {
        int length = array.length;
        if (length == 0) {
            return 0;
        }
        int left = 0, right = length - 1;
        while (left < right - 1) {
            int mid = (right - left) / 2 + left;
            if (array[mid] > array[right]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        int index = array[left] > array[right] ? right : left;
        return array[index];
    }

    @Test
    public void fun() {
        //9,10,11,12,13,1,2
        //9,10,1,2,3,4,5,6
        int i = minNumberInRotateArray(new int[]{9, 10, 11, 12, 13, 1, 2});
    }
}
