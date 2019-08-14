package nowcoder.offer;

/**
 * @class: Solution_17
 * @description: 判断是否为子树
 * @author: yi-yun
 * @create: 2019-08-14 23:39
 **/
public class Solution_17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return Boolean.FALSE;
        }
        return isSubTree(root1, root2) ||
            HasSubtree(root1.left, root2) ||
            HasSubtree(root1.right, root2);
    }

    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return Boolean.FALSE;
        }
        if (root1 == null) {
            return Boolean.TRUE;
        }
        if (root1.val == root2.val) {
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        } else {
            return Boolean.FALSE;
        }
    }
}
