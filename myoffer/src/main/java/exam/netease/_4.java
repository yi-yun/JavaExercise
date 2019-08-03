package exam.netease;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-03 15:37
 **/
public class _4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        //value  cnt
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int nextInt = sc.nextInt();
            max = Integer.max(nextInt, max);
            if (hashMap.containsKey(nextInt)) {
                Integer cnt = hashMap.get(nextInt);
                hashMap.put(nextInt, cnt + 1);
            } else {
                hashMap.put(nextInt, 1);
            }
        }
        for (int i = 0; i < q; i++) {
            int arg = sc.nextInt(), cnt = 0;
            for (int j = arg; j <= max; j++) {
                if (hashMap.containsKey(j)) {
                    Integer value = hashMap.get(j);
                    cnt += value;
                    int orgin = j - 1;
                    if (hashMap.containsKey(orgin)) {
                        hashMap.put(orgin, hashMap.get(orgin) + value);
                    } else {
                        hashMap.put(orgin, value);
                    }
                }
            }
            //System.out.println(Arrays.toString(array));
            System.out.println(cnt);
        }
    }

    private static int cal(int arg, Map<Integer, Integer> hashMap, int max) {
        int cnt = 0;
        for (int j = arg; j <= max; j++) {
            if (hashMap.containsKey(j)) {
                Integer value = hashMap.get(j);
                cnt += value;
                int orgin = j - 1;
                if (hashMap.containsKey(orgin)) {
                    hashMap.put(orgin, hashMap.get(orgin) + value);
                } else {
                    hashMap.put(orgin, value);
                }
            }
        }
        return cnt;
    }

    @Test
    public void fun() {
        int[] ints = {1, 2, 3, 4, 5};
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < ints.length; i++) {
                ints[i]--;
            }
        }

    }
}
/*import java.util.*;

*
 * @class: _3
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-08-03 15:37
 *
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < q; i++) {
            int arg = sc.nextInt(), cnt = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] >= arg) {
                    array[j]--;
                    cnt++;
                }
            }
            //System.out.println(Arrays.toString(array));
            System.out.println(cnt);
        }
    }
}*/
