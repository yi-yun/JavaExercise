package leetcode.tree;

import org.junit.Test;

import java.util.*;

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

    public static class LC_515 {
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

    public static class LC_700 {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root==null)return root;
            if (root.val==val)return root;
            else if (root.val>val)return searchBST(root.left,val);
            else return searchBST(root.right,val);
        }
    }

    public static class LC_701 {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root==null)return new TreeNode(val);
            if (root.val<val)root.right=insertIntoBST(root.right,val);
            if (root.val>val)root.left=insertIntoBST(root.left,val);
            return root;
        }
    }

    public static class LC_1008 {
        public TreeNode bstFromPreorder(int[] preorder) {
            TreeNode root = new TreeNode(preorder[0]);
            for (int i = 1; i < preorder.length; i++) {
                helper(root, preorder[i]);
            }
            return root;
        }
    
        private void helper(TreeNode root, int val) {
            if (root.val > val) {
                if (root.left == null) {
                    root.left = new TreeNode(val);
                    return;
                } else helper(root.left, val);
            } else {
                if (root.right == null) {
                    root.right = new TreeNode(val);
                    return;
                } else helper(root.right, val);
            }
        }
    }
}
