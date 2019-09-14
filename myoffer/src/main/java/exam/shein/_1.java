package exam.shein;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-13 10:47
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            cal1(s.replace(" ", ""));
        }
    }

    private static void cal1(String s) {
        HashSet<Character> set = new HashSet<>();
        ArrayList<Character> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char at = s.charAt(i);
            if (!set.contains(at)) {
                set.add(at);
                res.add(at);
            }
        }
        for (Character re : res) {
            System.out.print(re);
        }
        System.out.println();
    }

    @Test
    public void fun() {
        cal1("abcqwerAcb");
    }
}

// public class _1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         while (sc.hasNext()) {
//             char[] c = sc.next().toCharArray();
//             StringBuffer sb = new StringBuffer();
//             Set<Character> set = new HashSet<>();
//             for (int i = 0; i < c.length; i++) {
//                 if (set.add(c[i]))
//                     sb.append(c[i]);
//             }
//             System.out.println(sb.toString());
//         }
//     }
// }