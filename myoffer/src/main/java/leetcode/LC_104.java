package leetcode;

public class LC_104 {
    public int maxDepth(TreeNode root) {
        int len=0;
        if (root==null)return len;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
