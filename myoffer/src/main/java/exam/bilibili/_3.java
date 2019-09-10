package exam.bilibili;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-10 20:33
 **/
public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        cal(s);
    }

    private static void cal(String s) {
        String[] a = s.split(" ");
        char daFen = a[0].charAt(0);
        char keyValue = a[1].charAt(0);
        qwe(a[2], daFen, keyValue);
    }

    private static void qwe(String s, char daFen, char keyValue) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char at = s.charAt(i);
            if (at != daFen) {
                sb.append(at);
            } else {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        list.add(sb.toString());
        asd(list, keyValue);
    }

    private static void asd(List<String> list, char keyValue) {
        System.out.println(list.size());
        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == keyValue) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(s.charAt(j));
                    }
                    System.out.print(" ");
                    for (int j = i + 1; j < s.length(); j++) {
                        System.out.print(s.charAt(j));
                    }
                    System.out.println();
                }
            }
        }
    }

    @Test
    public void fun() {
        cal("# : a:3#b:8#c:9");
        // qwe("qwe#232", '#', '2');
    }
}
