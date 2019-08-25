package exam.kuaishou;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-25 17:27
 **/
public class _2 {
    public static Set<Integer> a = new HashSet<>();

    public static void main(String[] args) {
        a.add(16);
        a.add(37);
        a.add(58);
        a.add(89);
        a.add(145);
        a.add(42);
        a.add(20);
        a.add(4);
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            cal(sc.nextInt());
        }
    }

    private static void cal(int nextInt) {
        if (a.contains(nextInt)) {
            System.out.println("false");
            return;
        }
        if (nextInt == 1) {
            System.out.println("true");
            return;
        }
        ArrayList<Integer> a1 = new ArrayList<>();
        while (nextInt != 0) {
            a1.add(nextInt % 10);
            nextInt /= 10;
        }
        int sum = 0;
        for (Integer e : a1) {
            sum += Math.pow(e, 2);
        }
        cal(sum);
    }
    @Test
    public void fun() {
        cal(38);
    }
}
