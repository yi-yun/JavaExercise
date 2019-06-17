package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LC_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        help(arrayList, root);
        return arrayList;
    }

    private void help(ArrayList<Integer> arrayList, TreeNode node) {
        if (node == null) return;
        help(arrayList, node.left);
        help(arrayList, node.right);
        arrayList.add(node.val);
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            arrayList.add(node.val);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
    @Test
    public void fun(){
        TreeNode treeNode = new TreeNode(1, null,new TreeNode(2,new TreeNode(3),null));
        List<Integer> list = postorderTraversal2(treeNode);
        list.stream().forEach(System.out::println);
    }
}
