package exam.mine;

/**
 * @class: RevertLink
 * @description: 反转链表
 * @author: yi-yun
 * @create: 2019-09-11 12:57
 **/

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class _RevertLink {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        //--------1-----2-------3
        //tmp   head  next
        ListNode tmp = null;
        while (head != null) {
            //暂存结点之后的节点
            ListNode next = head.next;
            //更改指向
            head.next = tmp;
            //依次前进
            tmp = head;
            head = next;
        }
        return tmp;
    }
}
