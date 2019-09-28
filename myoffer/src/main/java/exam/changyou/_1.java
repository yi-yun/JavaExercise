package exam.changyou;

import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-25 21:08
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(sc.nextInt()));

    }

    public static long fibonacci(int n) {
        long result = 0L;
        long preOne = 1L;
        long preTwo = 1L;
        if (n == 1) {
            return preOne;
        }
        if (n == 0) {
            return preTwo;
        }
        for (int i = 2; i <= n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }
}
