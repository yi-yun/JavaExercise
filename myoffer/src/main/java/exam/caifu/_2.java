package exam.caifu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-06 19:19
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (s[i] > s[i - 1]) {
                res += s[i] - s[i - 1];
            }
        }
        System.out.println(res);
        // System.out.println(max(s));
    }

    public int max(int[] prices) {
        ArrayList<Integer> ints = new ArrayList<>();
        int a = 0;
        for (int i = 1; i < prices.length;i++ ) {
            for (int j = i; j < prices.length; ) {
                if (prices[j] > prices[j - 1]) {
                    j++;
                } else {
                    int i1 = prices[j - 1] - prices[i];
                    ints.add(i1);
                    i = j;
                    break;
                }
            }
        }
        Collections.sort(ints, Collections.reverseOrder());
        return ints.get(0) + ints.get(1);
    }

    @Test
    public void fun() {
        int max = max(new int[]{2, 5, 3, 9, 15, 2});
    }

}
