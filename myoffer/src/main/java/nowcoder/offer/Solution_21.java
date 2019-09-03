package nowcoder.offer;

import java.util.Stack;

/**
 * @class: Solution_21
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-03 23:17
 **/
public class Solution_21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (popA == null || pushA == null) {
            return Boolean.FALSE;
        }
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
