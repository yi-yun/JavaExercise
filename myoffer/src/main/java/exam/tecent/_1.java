package exam.tecent;

import org.junit.Test;

import java.util.Scanner;
import java.util.Stack;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-17 22:20
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(cal(s));
    }

    private static String cal(String s) {
        if (s.isEmpty()) {
            return "";
        }
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ']') {
                stack.push(array[i]);
            } else {
                StringBuilder sb = new StringBuilder();
                while (stack.peek() != '|') {
                    sb.append(stack.pop());
                }
                stack.pop();
                int a = 0;
                while (stack.peek() != '[') {
                    a = a * 10;
                    a += Integer.parseInt(stack.pop().toString());
                }
                stack.pop();
                StringBuilder t = new StringBuilder(a);
                for (int i1 = 0; i1 < a; i1++) {
                    t.append(sb);
                }
                StringBuilder builder = t.reverse();
                for (int j = 0; j < builder.length(); j++) {
                    stack.push(builder.charAt(j));
                }
            }
        }
        StringBuilder res = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }

    @Test
    public void fun() {
        System.out.println(cal("QWER[2|W[3|AB]V]"));
    }
}
