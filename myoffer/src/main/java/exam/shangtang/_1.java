package exam.shangtang;

import org.junit.Test;

import java.util.Scanner;
import java.util.Stack;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-19 19:32
 **/
public class _1 {
    private static Long cal(String s) {
        Stack<Long> stack = new Stack<>();
        char[] array = s.toCharArray();
        String[] a = s.split(" ");
        long res = 0;
        for (int i = 0; i < a.length; i++) {
            String s1 = a[i];
            try {
                long num = Long.parseLong(s1);
                stack.push(num);
            } catch (Exception e) {
                if (s1.equals("+")) {
                    res = stack.pop() + stack.pop();
                } else if (s1.equals("-")) {
                    Long pop = stack.pop();
                    res = stack.pop() - pop;
                } else if (s1.equals("/")) {
                    Long pop = stack.pop();
                    res = stack.pop() / pop;
                } else if (s1.equals("*")) {
                    res = stack.pop() + stack.pop();
                }
                stack.push(res);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(cal(s));
    }

    @Test
    public void fun() {
        System.out.println(cal("2 1 + 3 *"));
    }
}
