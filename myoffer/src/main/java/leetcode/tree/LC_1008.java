package leetcode.tree;

public class LC_1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            helper(root, preorder[i]);
        }
        return root;
    }

    private void helper(TreeNode root, int val) {
        if (root.val > val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
                return;
            } else helper(root.left, val);
        } else {
            if (root.right == null) {
                root.right = new TreeNode(val);
                return;
            } else helper(root.right, val);
        }
    }
}
