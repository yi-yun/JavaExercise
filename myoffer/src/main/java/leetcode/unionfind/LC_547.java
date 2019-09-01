package leetcode.unionfind;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @class: LC_547
 * @description: 并查集
 * @author: yi-yun
 * @create: 2019-08-30 23:23
 **/
public class LC_547 {

    public static class Node {
        Integer a;

        public Node(Integer a) {
            this.a = a;
        }
        // whatever you like
    }

    public static class UnionFindSet {
        public HashMap<Node, Node> fatherMap;
        public HashMap<Node, Integer> sizeMap;
        private int cnt;
        public UnionFindSet(List<Node> nodes) {
            makeSets(nodes);
        }

        private void makeSets(List<Node> nodes) {
            fatherMap = new HashMap<>();
            sizeMap = new HashMap<>();
            cnt = nodes.size();
            fatherMap.clear();
            sizeMap.clear();
            for (Node node : nodes) {
                fatherMap.put(node, node);
                sizeMap.put(node, 1);
            }
        }

        private Node findHead(Node node) {
            Node father = fatherMap.get(node);
            if (father != node) {
                father = findHead(father);
            }
            fatherMap.put(node, father);
            return father;
        }

        public boolean isSameSet(Node a, Node b) {
            return findHead(a) == findHead(b);
        }

        public void union(Node a, Node b) {
            if (a == null || b == null) {
                return;
            }
            Node aHead = findHead(a);
            Node bHead = findHead(b);
            if (aHead != bHead) {
                int aSetSize = sizeMap.get(aHead);
                int bSetSize = sizeMap.get(bHead);
                if (aSetSize <= bSetSize) {
                    fatherMap.put(aHead, bHead);
                    sizeMap.put(bHead, aSetSize + bSetSize);
                } else {
                    fatherMap.put(bHead, aHead);
                    sizeMap.put(aHead, aSetSize + bSetSize);
                }
                cnt--;
            }
        }

    }

    public int findCircleNum(int[][] M) {

        int a = M.length;
        List<Node> nodes = new ArrayList<>(a);
        for (int i = 0; i < a; i++) {
            nodes.add(new Node(i));
        }
        UnionFindSet set = new UnionFindSet(nodes);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                if (M[i][j] == 1) {
                    set.union(nodes.get(i), nodes.get(j));
                }
            }
        }
        return set.cnt;
    }

    @Test
    public void fun() {
        int[][] a = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        findCircleNum(a);
    }
}
