package leetcode.link;

/**
 * @class: LC_86
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-05 10:39
 **/
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LC_86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode a = new ListNode(0);
        ListNode headA = a;
        ListNode b = new ListNode(0);
        ListNode headB = b;


        while (head != null) {
            if (head.val < x) {
                a.next = head;
                a = a.next;
            } else {
                b.next = head;
                b = b.next;
            }
            head = head.next;
        }
        b.next = null;
        a.next = headB.next;
        return headA.next;
    }
}
