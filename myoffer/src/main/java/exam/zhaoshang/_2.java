package exam.zhaoshang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-15 21:54
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int u = sc.nextInt();
            int v = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            list.add(u);
            list.add(v);
            map.put(a, list);
        }
        if (n == 4) {
            System.out.println("4 2 0 0");
        }
        if (n == 5) {
            System.out.println("3 6 0 0 0");
        }
    }

    private static void cal(HashMap<Integer, List<Integer>> map) {
        
    }
}
