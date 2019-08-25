package exam.bytedance;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-25 19:23
 **/
public class _2 {
    public static HashMap<Integer, Long> a = new HashMap<>();

    public static void main(String[] args) {
        a.put(2, 1L);
        a.put(4, 2L);
        a.put(6, 5L);
        a.put(8, 13L);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cal(n);
    }

    private static void cal(int n) {

    }
}
