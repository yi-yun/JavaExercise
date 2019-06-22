package leetcode.tree;

import java.util.*;

public class LC_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null)return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.size()>0){
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left!=null)queue.offer(node.left);
                if (node.right!=null)queue.offer(node.right);
            }
            result.add(list);
        }
        Collections.reverse(result);
        return result;
    }
}
