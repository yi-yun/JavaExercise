package exam.jd;

import javafx.util.Pair;

import java.util.*;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-24 20:42
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (set.contains(x)) {
                res.add(x);
            } else {
                set.add(x);
            }
            int y = sc.nextInt();
            if (set.contains(y)) {
                res.add(y);
            } else {
                set.add(y);
            }
        }
        System.out.println(res.size());
        Collections.sort(res);
        if (res.size() != 0) {
            System.out.print(res.get(0));
        }
        for (int i = 1; i < res.size(); i++) {
            System.out.print(" " + res.get(i));
        }
    }

    private static void cal(int n, int m, ArrayList<Pair> list) {
        for (Pair pair : list) {

        }
    }
}
