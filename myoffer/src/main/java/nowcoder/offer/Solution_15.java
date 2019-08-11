package nowcoder.offer;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
import org.junit.Test;

import java.util.Stack;

/**
 * @class: Solution_15
 * @description: 反转链表
 * @author: yi-yun
 * @create: 2019-08-11 21:57
 **/
public class Solution_15 {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        while (head.next != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode res = head;
        ListNode temp = head;
        while (!stack.isEmpty()) {
            res.next = new ListNode(stack.pop());
            res = res.next;
        }
        res.next = null;
        return temp;
    }

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode tmp = null;
        while (head != null) {
            ListNode listNode = head.next;
            head.next = tmp;
            tmp = head;
            head = listNode;
        }
        return tmp;
    }

    @Test
    public void fun() {
        ListNode listNode = new ListNode(6);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);
        ListNode reverse = reverse(listNode);
    }
}
