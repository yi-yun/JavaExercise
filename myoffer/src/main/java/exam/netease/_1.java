package exam.netease;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @class: _1
 * @description: 笔试第一题
 * @author: yi-yun
 * @create: 2019-08-03 14:55
 **/
public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arrayList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        int sum = sc.nextInt();
        for (int i = 0; i < sum; i++) {
            int index = sc.nextInt();
            int cnt = calFun(arrayList, index);
            double res = cnt * 100.0 / n;
            DecimalFormat decimalFormat = new DecimalFormat("0.000000");
            String format = decimalFormat.format(res);
            System.out.println(format);
        }
    }

    private static int calFun(List<Integer> arrayList, int index) {
        Integer grade = arrayList.get(index - 1);
        int cnt = 0;
        for (Integer i : arrayList) {
            if (grade >= i) {
                cnt++;
            }
        }
        return cnt - 1;
    }

    @Test
    public void fun() {
        double i = 2 * 100.0 / 3;
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");
        String format = decimalFormat.format(i);
        System.out.println(format);
    }
}
