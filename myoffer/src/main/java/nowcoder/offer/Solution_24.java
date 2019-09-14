package nowcoder.offer;

import java.util.ArrayList;


/**
 * @class: Solution_24
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-14 20:19
 **/
public class Solution_24 {

    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper(root, target, list);
        return res;
    }

    private void helper(TreeNode root, int target, ArrayList<Integer> temp) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        if (target - root.val == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(temp));
        }
        helper(root.left, target - root.val, temp);
        helper(root.right, target - root.val, temp);
        temp.remove(temp.size() - 1);
    }
}
