package nowcoder.offer;

import org.junit.Test;

import java.util.Arrays;

/**
 * @class: Solution_4
 * @description: 重建二叉树
 * @author: yi-yun
 * @create: 2019-07-13 20:09
 **/
public class Solution_4 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0 || (pre.length != in.length))
            return null;
        TreeNode treeNode = new TreeNode(pre[0]);
        for (int i = 0; i < pre.length; i++) {
            if (in[i] == pre[0]) {
                treeNode.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1),
                    Arrays.copyOfRange(in, 0, i));
                treeNode.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length),
                    Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        return treeNode;
    }
    @Test
    public void fun() {
        TreeNode treeNode = reConstructBinaryTree(new int[]{1, 2, 4, 7, 3, 5, 6, 8}, 
            new int[]{4, 7, 2, 1, 5, 3, 8, 6});
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
