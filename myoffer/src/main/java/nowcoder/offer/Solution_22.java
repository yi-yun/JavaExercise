package nowcoder.offer;

import java.util.*;

/**
 * @class: Solution_22
 * @description: 打印二叉树
 * @author: yi-yun
 * @create: 2019-09-06 14:56
 **/
public class Solution_22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            list.add(poll.val);
            if (poll.left != null) {
                queue.offer(poll.left);
            }
            if (poll.right != null) {
                queue.offer(poll.right);
            }
        }
        return list;
    }
}
