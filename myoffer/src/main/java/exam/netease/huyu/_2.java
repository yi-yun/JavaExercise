package exam.netease.huyu;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-20 17:29
 **/
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class _2 {
    /**
     * 单链表定义如下：
     */


    private static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nextInt = sc.nextInt();
        map.put(nextInt, 1);
        ListNode a = new ListNode(nextInt);
        ListNode head = a;
        for (int i = 1; i < n; i++) {
            nextInt = sc.nextInt();
            if (map.containsKey(nextInt)) {
                map.replace(nextInt, map.get(nextInt) + 1);
            } else {
                map.put(nextInt, 1);
            }
            a.next = new ListNode(nextInt);
            a = a.next;
        }
        ListNode listNode = removeDuplicates(head);
        print1(listNode);
    }

    private static void print1(ListNode listNode) {
        if (map.get(listNode.val) > 2) {
            System.out.print(listNode.val);
            System.out.print(" " + listNode.val);
        } else {
            System.out.print(listNode.val);
        }
        listNode = listNode.next;
        while (listNode != null) {
            if (map.get(listNode.val) > 2) {
                System.out.print(" " + listNode.val);
                System.out.print(" " + listNode.val);
            } else {
                System.out.print(" " + listNode.val);
            }
            listNode = listNode.next;
        }

    }


    private static ListNode removeDuplicates(ListNode head) {
        // 在这里编写代码
        ListNode temp = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return temp;
    }

}
