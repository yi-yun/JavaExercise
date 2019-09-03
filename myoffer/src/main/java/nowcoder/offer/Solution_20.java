package nowcoder.offer;

import java.util.Stack;

/**
 * @class: Solution_20
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-03 22:56
 **/
public class Solution_20 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
        if (stack2.isEmpty()) {
            stack2.push(node);
        } else {
            if (stack2.peek() > node) {
                stack2.push(node);
            }
        }
    }

    public void pop() {
        if (stack1.pop() == stack2.peek()) {
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
