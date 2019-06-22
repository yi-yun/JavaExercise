package leetcode.tree;

import java.util.Arrays;

public class LC_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder==null||inorder==null||postorder.length==0||inorder.length==0||(postorder.length!=inorder.length))
            return null;
        int length = postorder.length;
        TreeNode node = new TreeNode(length-1);
        for (int i = 0; i < length; i++) {
            if (inorder[i]==node.val){
                node.left=buildTree(Arrays.copyOfRange(inorder,0,i),
                    Arrays.copyOfRange(postorder,0,i));
                node.right=buildTree(Arrays.copyOfRange(inorder,i+1,inorder.length),
                    Arrays.copyOfRange(postorder,i,length-1));
            }
        }
        return node;
    }
}
