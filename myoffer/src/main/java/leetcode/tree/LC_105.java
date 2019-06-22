package leetcode.tree;

import lombok.AllArgsConstructor;
import org.junit.Test;

import java.util.Arrays;

//Definition for a binary tree node.
@AllArgsConstructor
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
    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        if (preorder==null||inorder==null||preorder.length==0||inorder.length==0||(preorder.length!=inorder.length))
            return null;
        return helper(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart>preorder.length-1||inStart>inEnd)return null;
        TreeNode node = new TreeNode(preorder[preStart]);
        int index=0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i]==preorder[preStart])
                index=i;
        }
        node.left=helper(preStart+1,inStart,index-1,preorder,inorder);
        node.right=helper(preStart + index - inStart + 1,index+1,inEnd,preorder,inorder);
        return node;
    }
    //preorder = [3,9,20,15,7]
    //inorder = [9,3,15,20,7]
//             3
//            / \
//            9  20
//            /  \
//            15   7
    @Test
    public void fun(){
        
    }
}
