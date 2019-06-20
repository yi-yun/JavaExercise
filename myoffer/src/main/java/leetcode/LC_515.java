package leetcode;

import java.util.*;

public class LC_515 {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root==null)return arrayList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.size()>0){
            int temp=Integer.MIN_VALUE;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.val>temp)temp=node.val;
                if (node.left!=null)queue.add(node.left);
                if (node.right!=null)queue.add(node.right);
            }
            arrayList.add(temp);
        }
        return arrayList;
    }
    
}
