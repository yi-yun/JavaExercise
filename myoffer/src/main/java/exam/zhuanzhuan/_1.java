package exam.zhuanzhuan;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-16 20:48
 **/
public class _1 {
}


class Solution {
    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node createBinaryTreeByArray(Integer[] array, int index) {
        Node tn = null;
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new Node(value);
            tn.left = createBinaryTreeByArray(array, 2 * index + 1);
            tn.right = createBinaryTreeByArray(array, 2 * index + 2);
            return tn;
        }
        return tn;
    }

    public int levelOrder(Node root) {
        //请您完成此方法
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        double res = root.val;
        int cengHao = 1, a = 1;
        while (!queue.isEmpty()) {

            double avg = 0.0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                avg += queue.poll().val;
            }
            avg = avg / size;
            if (res < avg) {
                res = avg;
                a = cengHao;
            }
            cengHao++;
        }
        return a;
    }


    public Node createTree(int[] array) {
        List<Node> nodeList = new LinkedList<Node>();

        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {
            nodeList.add(new Node(array[nodeIndex]));
        }
        for (int parentIndex = 0; parentIndex <= array.length / 2 - 1; parentIndex++) {
            nodeList.get(parentIndex).left = nodeList.get(parentIndex * 2 + 1);
            //防止是非完全二叉树
            if ((parentIndex * 2 + 2) < array.length) {
                nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
            }
        }
        return nodeList.get(0);
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Integer[] array = new Integer[]{3, 9, 4, 5, 1, 6};

        Solution solution = new Solution();
        Node root = solution.createBinaryTreeByArray(array, 0);
        int level = solution.levelOrder(root);
        System.out.println(level);

    }
}
