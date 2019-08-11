package nowcoder.offer;

/**
 * @class: Solution_16
 * @description: 合并链表
 * @author: yi-yun
 * @create: 2019-08-11 23:20
 **/
public class Solution_16 {
    private int len(ListNode list1) {
        int len = 0;
        while (list1 != null) {
            len++;
            list1 = list1.next;
        }
        return len;
    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode merge = null;
        ListNode cur = null;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (merge == null) {
                    merge = cur = list1;
                } else {
                    cur.next = list1;
                    cur = cur.next;
                }
                list1 = list1.next;
            } else {
                if (merge == null) {
                    merge = cur = list2;
                } else {
                    cur.next = list2;
                    cur = cur.next;
                }
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            cur.next = list2;
        }else {
            cur.next = list1;
        }
        return merge;
    }

    
}
