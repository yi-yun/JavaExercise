package book.offer;


public class _22_FindKthReverse {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null||k<=0)return null;
        ListNode pHead=head;
        ListNode after=head;
        for (int i = 0; i < k-1; i++) {
            if (pHead.next!=null)pHead=pHead.next;
        }
        while (pHead.next!=null&&after.next!=null){
            pHead=pHead.next;
            after=after.next;
        }
        return after;
    }
}
