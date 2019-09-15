package exam.weipinhui;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-15 18:28
 **/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class _1 {
    public static void main(String[] args) {
        //……
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        fun(root);

    }

    private static int res = 0;

    private static void fun(TreeNode root) {
        maxDepth(root);
        System.out.println(res);
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        res = Math.max(res, left + right);
        return Math.max(left, right) + 1;
    }


}
