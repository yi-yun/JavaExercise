package leetcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LC_94 {
    LinkedList<Integer> ans = new LinkedList<>();

    @Test
    public void fun() {
        TreeNode treeNode = new TreeNode(3, new TreeNode(2), new TreeNode(1));
        List<Integer> list = inorderTraversal(treeNode);
        list.stream().forEach(System.out::println);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        put(list, root);
        return list;
    }

    private void put(LinkedList<Integer> list, TreeNode node) {
        if (node == null) return;
        put(list, node.left);
        list.add(node.val);
        put(list, node.right);
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null)
            stack.push(root);
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            ans.add(cur.val);
            cur=cur.right;
        }
        return ans;
    }
}

