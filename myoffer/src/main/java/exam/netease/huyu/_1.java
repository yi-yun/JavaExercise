package exam.netease.huyu;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-20 17:22
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger m = sc.nextBigInteger();
        BigInteger n = sc.nextBigInteger();
        cal(m, n);
    }

    private static void cal(BigInteger m, BigInteger n) {
        BigInteger a = m;
        BigInteger b = n;
        BigInteger multiply = m.multiply(n);
        
        while (!m.equals(n)) {
            if (m.compareTo(n) > 0) {
                m = m.subtract(n);
            } else {
                n = n.subtract(m);
            } 
        }

        System.out.println(m + " " + multiply.divide(m));
    }

    // private static void cal(long m, long n) {
    //
    //     BigInteger bigInteger = new BigInteger(String.valueOf(m * n));
    //
    //     long temp = 1;
    //     while (temp != 0) {
    //         temp = m % n;
    //         m = n;
    //         n = temp;
    //     }
    //     System.out.println(m + " " + bigInteger.divide(new BigInteger(String.valueOf(m))));
    // }

    @Test
    public void fun() {
        BigInteger a = new BigInteger(String.valueOf(54));
        BigInteger b = new BigInteger(String.valueOf(36));
        cal(a, b);
    }
}
