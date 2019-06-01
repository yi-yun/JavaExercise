package book.offer;

import org.junit.Test;

import java.util.Arrays;

public class _7_BuildTree {
    public TreeNode reBuilding(int [] pre,int[] in){
        if (pre==null||in==null||pre.length==0||in.length==0||(pre.length!=in.length))
            return null;
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < pre.length; i++) {
            if (in[i]==pre[0]){
                root.left=reBuilding(Arrays.copyOfRange(pre,1,i+1),
                    Arrays.copyOfRange(in,0,i));
                root.right=reBuilding(Arrays.copyOfRange(pre,i+1,pre.length),
                    Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }
    @Test
    public void fun(){
        TreeNode treeNode = reBuilding(new int[]{1, 2, 4, 7, 3, 5, 6, 8}, new int[]{4, 7, 2, 1, 5, 3, 8, 6});
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        val=x;
    }
}
