package com.yiyun.suishou;


import lombok.AllArgsConstructor;
import org.junit.Test;

public class Tree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){//判断是否非空
            return null;
        }
        if(root.left == null && root.right == null){
            return root;
        }
        //交换
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        if(root.left != null){
            invertTree(root.left);
        }
        if(root.right != null){
            invertTree(root.right);
        }
        return root;
    }
    //测试用例
    @Test
    public void funInvertTree(){
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                    new TreeNode(1,null,null),
                    new TreeNode(3,null,null)), 
                new TreeNode(7,
                    new TreeNode(6,null,null),
                    new TreeNode(9,null,null))
            );
        TreeNode invertTree = invertTree(root);
        //为了方便 Debug 查看
        System.out.println("invertTree.left.val = " + invertTree.left.val);
    }
}

@AllArgsConstructor
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;//为了代码方便就不私有属性了
}