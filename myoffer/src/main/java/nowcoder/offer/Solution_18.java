package nowcoder.offer;

/**
 * @class: Solution_18
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-24 23:03
 **/
public class Solution_18 {
    public void Mirror(TreeNode root) {

        if (root != null) {
            TreeNode node = root.left;
            root.left = root.right;
            root.right = node;
            if (root.left != null) {
                Mirror(root.left);
            }
            if (root.right != null) {
                Mirror(root.right);
            }
        }

    }
}
