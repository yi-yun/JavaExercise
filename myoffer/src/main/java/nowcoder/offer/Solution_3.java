package nowcoder.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @class: Solution_3
 * @description: 按链表值从尾到头的顺序返回一个ArrayList。
 * @author: yi-yun
 * @create: 2019-07-13 19:56
 **/
public class Solution_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
