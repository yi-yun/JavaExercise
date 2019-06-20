package leetcode;

public class LC_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null)return root;
        if (root.val==val)return root;
        else if (root.val>val)return searchBST(root.left,val);
        else return searchBST(root.right,val);
    }
}
