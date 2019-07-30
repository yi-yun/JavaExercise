package nowcoder.offer;

/**
 * @class: Solution_14
 * @description: 倒数第k个节点
 * @author: yi-yun
 * @create: 2019-07-30 23:40
 **/
public class Solution_14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) return null;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k - 1; i++) {
            if (fast.next != null) {
                fast = fast.next;
            } else {
                return null;
            }
        }
        while (fast.next != null && slow.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
