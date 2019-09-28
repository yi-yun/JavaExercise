package exam.shence;

import org.junit.Test;

import java.util.*;
import java.util.List;
import java.util.Scanner;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-28 15:23
 **/
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        List<List<Integer>> cal = cal(a, sum);
        if (cal == null || cal.isEmpty()) {
            System.out.println("-1 -1 -1");
        } else {
            for (List<Integer> list : cal) {
                Collections.sort(list);
                System.out.print(list.get(0));
                for (int i = 1; i < list.size(); i++) {
                    System.out.print(" " + list.get(i));
                }
                System.out.println();
            }
        }
    }

    public static List<List<Integer>> cal(int[] num, int sou) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length - 2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
                int low = i + 1, high = num.length - 1, sum = sou - num[i];
                while (low < high) {
                    if (num[low] + num[high] == sum) {
                        res.add(Arrays.asList(num[i], num[low], num[high]));
                        while (low < high && num[low] == num[low + 1]) low++;
                        while (low < high && num[high] == num[high - 1]) high--;
                        low++;
                        high--;
                    } else if (num[low] + num[high] < sum) low++;
                    else high--;
                }
            }
        }
        return res;
    }

    @Test
    public void fun() {

        int[] a = {-43, -36, -32, -31, 17, 30, 32, 37, 39};
        cal(a, 30);
    }

}
