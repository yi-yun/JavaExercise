package exam._58;

import org.junit.Test;

import java.util.*;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-12 20:40
 **/
public class _2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        cal(list);
    }

    private static void cal(List<Integer> a) {
        int size = a.size();
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < size; i++) {
        //     set.add(i);
        // }
        if (size == 1) {
            System.out.println(1);
            return;
        }
        if (size == 2) {
            System.out.println(3);
            return;
        }

        int[] b = new int[size];
        for (int i = 0; i < b.length; i++) {
            b[i] = a.get(i);
        }
        Arrays.sort(b);
        int[] res = new int[size];
        for (int i = 0; i < b.length; i++) {
            int min = b[i];
            int index = 0;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) == min && res[j] == 0) {
                    index = j;
                    break;
                }
            }
            if (index == size - 1) {
                res[index] = res[index - 1] + 1;
            } else if (index == 0) {
                res[index] = res[index + 1] + 1;
            } else {
                res[index] = Math.max(res[index - 1], res[index + 1]) + 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < res.length; i++) {
            sum += res[i];
        }
        System.out.println(sum);
    }

    @Test
    public void fun() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(2);
        cal(list);

    }
}
