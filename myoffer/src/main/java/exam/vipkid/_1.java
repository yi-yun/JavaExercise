package exam.vipkid;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-03 16:26
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        cal(a);
    }

    private static void cal(String a) {
        int cnt = 0;
        String r = a.replaceAll(" ", "");
        String[] s = r.split(",");
        int y = s.length;
        long[] b = new long[y];
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < y; i++) {
            b[i] = Long.parseLong(s[i]);
            set.add(b[i]);
        }
        Iterator<Long> iterator = set.iterator();
        while (iterator.hasNext()) {
            Long next = iterator.next();
            if (next < 0 && set.contains(Math.abs(next))) {
                cnt++;
            }
        }
        if (set.contains(0L)) {
            cnt++;
        }
        System.out.println(cnt);
    }


    @Test
    public void fun() {
        cal("4,  -4  ,   -1, 4  ,  1,3,3,-3");
    }


}
