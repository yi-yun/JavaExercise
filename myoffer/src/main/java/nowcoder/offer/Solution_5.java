package nowcoder.offer;

import java.util.Stack;

/**
 * @class: Solution_5
 * @description: 用两个栈来实现一个队列，
 * 完成队列的Push和Pop操作。
 * @author: yi-yun
 * @create: 2019-07-14 14:44
 **/
public class Solution_5 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!(stack1.empty() && stack2.empty())) {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();
    }
}
