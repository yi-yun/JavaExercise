package uitls;

import java.util.HashMap;
import java.util.List;

/**
 * @class: UnionFind
 * @description: 并查集模版代码
 * @author: yi-yun
 * @create: 2019-08-31 00:02
 **/
public class UnionFind {
    public static class Node {
        // whatever you like
    }

    public static class UnionFindSet {
        public HashMap<Node, Node> sonDadMap;
        public HashMap<Node, Integer> nodeSizeMap;

        public UnionFindSet(List<Node> nodes) {
            makeSets(nodes);
        }

        private void makeSets(List<Node> nodes) {
            sonDadMap = new HashMap<>();
            nodeSizeMap = new HashMap<>();
            sonDadMap.clear();
            nodeSizeMap.clear();
            for (Node node : nodes) {
                sonDadMap.put(node, node);
                nodeSizeMap.put(node, 1);
            }
        }

        private Node findHead(Node node) {
            Node father = sonDadMap.get(node);
            if (father != node) {
                father = findHead(father);
            }
            sonDadMap.put(node, father);
            return father;
        }

        public boolean isSameSet(Node a, Node b) {
            return findHead(a) == findHead(b);
        }

        public void union(Node a, Node b) {
            if (a == null || b == null) {
                return;
            }
            Node headA = findHead(a);
            Node headB = findHead(b);
            if (headA != headB) {
                int aSize = nodeSizeMap.get(headA);
                int bSize = nodeSizeMap.get(headB);
                if (aSize <= bSize) {
                    sonDadMap.put(headA, headB);
                    nodeSizeMap.put(headB, aSize + bSize);
                } else {
                    sonDadMap.put(headB, headA);
                    nodeSizeMap.put(headA, aSize + bSize);
                }
            }
        }

    }
}
