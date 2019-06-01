package leetcode;

import java.util.Arrays;

//Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class LC_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder==null||inorder==null||preorder.length==0||inorder.length==0||(preorder.length!=inorder.length))
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < preorder.length; i++) {
            if (inorder[i]==preorder[0]){
                root.left=buildTree(Arrays.copyOfRange(preorder,1,i+1),
                    Arrays.copyOfRange(inorder,0,i));
                root.right=buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),
                    Arrays.copyOfRange(inorder,i+1,inorder.length));
            }
        }
        return root;
    }
}
