package exam.mihayou;

import org.junit.Test;

import java.util.*;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-07 19:03
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        cal(s);
    }

    private static void cal(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                stack.push(c);
                i++;
            } else if (c == '-') {
                Character b = stack.pop();
                char a = s.charAt(i + 1);
                if (b <= 'Z' && a >= 'a') {
                    while (b <= 'Z') {
                        stack.push(b);
                        b++;
                    }
                    char tmp = 'a';
                    while (tmp <= a) {
                        stack.push(tmp);
                        tmp++;
                    }
                } else {
                    while (b <= a) {
                        stack.push(b);
                        b++;
                    }
                }
                i += 2;
            } else if (c >= '0' && c <= '9') {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                StringBuilder reverse = sb.reverse();
                int j = i;
                int temp = 0;
                while (j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                    temp = temp * 10 + s.charAt(j) - '0';
                    i++;
                    j++;
                }
                for (j = 0; j < temp; j++) {
                    res.append(reverse);
                }
            }
        }
        String q = res.toString().toLowerCase();
        System.out.println(q);
        cal2(q);
    }

    private static void cal2(String q) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < q.length(); i++) {
            char at = q.charAt(i);
            if (map.containsKey(at)) {
                map.put(at, map.get(at) + 1);
            } else {
                map.put(at, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
        Character x = 'a';
        Integer y = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> next = iterator.next();
            if (next.getValue() > y) {
                y = next.getValue();
                x = next.getKey();
            } else if (next.getValue() == y) {
                if (x > next.getKey()) {
                    x = next.getKey();
                }
            }
        }
        System.out.print(x);
        System.out.println(y);
    }


    @Test
    public void fun() {
        cal("a-b10");
    }
}
