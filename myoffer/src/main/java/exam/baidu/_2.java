package exam.baidu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-17 19:41
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int j = 0; j < r; j++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (!map.containsKey(a)) {
                    map.put(a, new ArrayList<>());
                }
                map.get(a).add(b);
            }
            cal(map, n);
        }

    }

    private static void cal(HashMap<Integer, ArrayList<Integer>> map, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(i + 1);
        }

        ArrayList<Integer> list = map.get(1);
        if (list == null || list.isEmpty()) {
            System.out.println("IMPOSSIBLE");
            return;
        }
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (Integer a : list) {
                if (a.equals(n)) {
                    System.out.println("POSSIBLE");
                    return;
                }
                if (map.containsKey(a)) {
                    ArrayList<Integer> list1 = map.get(a);
                    for (Integer b : list1) {
                        tmp.add(b);
                    }
                }
            }
            list = tmp;
        }
        System.out.println("IMPOSSIBLE");
    }

    @Test
    public void fun() {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        map.put(1, new ArrayList<>());
        map.get(1).add(2);
        map.put(2, new ArrayList<>());
        map.get(2).add(3);
        // map.put(2, new ArrayList<>());
        map.get(2).add(4);
        cal(map, 4);

    }
}
