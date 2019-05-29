package book.offer;

import lombok.AllArgsConstructor;
import org.junit.Test;

import java.util.Stack;

@AllArgsConstructor
class ListNode{
    int value;
    ListNode next;
}
public class _6_PrintNode {
    public void printReversingly(ListNode listNode){
        Stack<ListNode> stack = new Stack<>();
        while (listNode!=null){
            stack.push(listNode);
            listNode=listNode.next;
        }
        while (!stack.isEmpty()){
            System.out.println("stack.pop().value = " + stack.pop().value);
        }
    }
    public void printRecursive(ListNode listNode){
        if (listNode!=null){
            if (listNode.next!=null)
                printRecursive(listNode.next);
            System.out.println("listNode.value = " + listNode.value);
        }
        
    }
    @Test
    public void fun(){
        printReversingly(new ListNode(5,new ListNode(3,new ListNode(6,null))));
        System.out.println("===================");
        printRecursive(new ListNode(5,new ListNode(3,new ListNode(6,null))));
    }
}
