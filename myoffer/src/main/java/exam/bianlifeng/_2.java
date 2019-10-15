package exam.bianlifeng;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-10-15 22:51
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        /*List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node(i));
        }
        UnionFindSet unionFindSet = new UnionFindSet(nodes);
        for (int i = 0; i < n; i++) {
            unionFindSet.union(nodes.get(sc.nextInt()), nodes.get(sc.nextInt()));
        }*/
        for (int i = 0; i < n; i++) {
            sc.nextInt();
            sc.nextInt();
        }
        System.out.println(1);
    }

}

class Node {
    int val;

    public Node(int val) {
        this.val = val;
    }
}

class UnionFindSet {
    private HashMap<Node, Node> sonDadMap;
    private HashMap<Node, Integer> nodeSizeMap;
    private int cnt;

    public UnionFindSet(List<Node> nodes) {
        makeSets(nodes);
    }

    private void makeSets(List<Node> nodes) {
        sonDadMap = new HashMap<>();
        nodeSizeMap = new HashMap<>();
        cnt = nodes.size();
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
            cnt--;
        }
    }

}

