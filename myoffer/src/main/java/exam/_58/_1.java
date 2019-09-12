package exam._58;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-12 20:37
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        cal(s);
    }

    private static void cal(String s) {
        String[] split = s.split(",");
        HashSet<Long> set = new HashSet<>();
        for (String s1 : split) {
            set.add(Long.parseLong(s1));
        }
        System.out.println(set.size());
        
    }
}
