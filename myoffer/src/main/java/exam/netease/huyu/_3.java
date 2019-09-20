package exam.netease.huyu;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-20 18:16
 **/
public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int source = sc.nextInt();
        int n = sc.nextInt();
        int[] weight = new int[n];
        double[] val = new double[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String[] split = s.split(",");
            weight[i] = Integer.valueOf(split[0]);
            val[i] = Double.valueOf(split[1]);
        }

        packOptimizationTest(weight, val, n, source);
    }


    //尽量装满
    private static void packOptimizationTest(int[] weight, double[] values, int n, int w) {
        double[] states = new double[w + 1];
        for (int i = 0; i < n; i++) {
            for (int j = w - weight[i]; j >= 0; j--) {
                double v = states[j] + values[i] * weight[i];
                if (v > states[j + weight[i]]) {
                    states[j + weight[i]] = v;
                }
            }
        }
        DecimalFormat format = new DecimalFormat("0.0000");
        String s = format.format(states[w]);
        System.out.println(s);
    }

    @Test
    public void fun() {
        packOptimizationTest(new int[]{100, 320, 120, 20, 80}, new double[]{-0.05, 0.05, 0, 0.03, 0.04}, 5, 500);
    }
}
