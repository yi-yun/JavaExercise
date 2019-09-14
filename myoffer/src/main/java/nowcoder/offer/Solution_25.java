package nowcoder.offer;

/**
 * @class: Solution_25
 * @description: 复杂链表的复制
 * @author: yi-yun
 * @create: 2019-09-14 21:18
 **/
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution_25 {
    public RandomListNode Clone(RandomListNode pHead) {
        first(pHead);
        second(pHead);
        return third(pHead);
    }

    private RandomListNode third(RandomListNode pHead) {
        RandomListNode curNode = pHead;
        RandomListNode resNode = pHead.next;
        while (curNode != null) {
            RandomListNode cloneNode = curNode.next;
            curNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            curNode = curNode.next;
        }
        return resNode;
    }

    private void second(RandomListNode pHead) {
        RandomListNode node = pHead;
        while (node != null) {
            RandomListNode clone = node.next;
            if (node.random != null) {
                clone.random = node.random.next;
            }
            node = clone.next;
        }
    }

    //复制成 a---a----b---b
    private void first(RandomListNode pHead) {
        RandomListNode node = pHead;
        while (node != null) {
            RandomListNode listNode = new RandomListNode(node.label);
            listNode.next = node.next;
            node.next = listNode;
            node = listNode.next;
        }
    }


}
