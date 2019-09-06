package nowcoder.offer;

import java.util.Arrays;

/**
 * @class: Solution_23
 * @description: 判断二叉搜索树后序遍历序列
 * 右子树大于左子树，先找到右子树开始出
 * @author: yi-yun
 * @create: 2019-09-06 15:11
 **/
public class Solution_23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        int length = sequence.length;
        if (sequence == null || length == 0) {
            return false;
        }
        return isBST(sequence, 0, length - 1);
    }

    private boolean isBST(int[] arr, int start, int end) {
        if (start >= end) {
            return true;
        }
        int cur = arr[end];
        int spiltIndex;
        for (spiltIndex = start; spiltIndex < end && arr[spiltIndex] < cur; spiltIndex++) ;
        for (int i = spiltIndex; i < end; i++) {
            if (arr[i] < cur) {
                return false;
            }
        }
        return isBST(arr, start, spiltIndex - 1) & isBST(arr, spiltIndex, end - 1);
    }
}
