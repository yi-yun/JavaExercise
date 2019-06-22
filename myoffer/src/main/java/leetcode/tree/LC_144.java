package leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        help(arrayList, root);
        return arrayList;
    }

    private void help(ArrayList<Integer> arrayList, TreeNode node) {
        if (node == null) return;
        arrayList.add(node.val);
        help(arrayList, node.left);
        help(arrayList, node.right);
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            arrayList.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return arrayList;
    }
}
