package exam.qianxin;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;


/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-09 19:32
 **/
public class _1 {
    private static Set<Long> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String next1 = sc.next();
        String[] s1 = next.split(" ");
        String[] s2 = next1.split(" ");
        long source = sc.nextLong();
        long[] a = new long[s1.length];
        for (int i = 0; i < s1.length; i++) {
            a[i] = Long.parseLong(s1[i]);
            set.add(a[i]);
        }

        long[] b = new long[s2.length];
        for (int i = 0; i < s2.length; i++) {
            b[i] = Long.parseLong(s2[i]);
            set.add(b[i]);
        }
        // cal(a, b, source);
    }

    private static int cal(long[] a, long[] b, long source) {
        HashMap<Long, Queue<Long>> map = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            if (map.containsKey(b[i])) {
                Queue<Long> queue = map.get(b[i]);
                queue.add(a[i]);
                map.put(b[i], queue);
            } else {
                Queue<Long> longs = new LinkedList<>();
                longs.offer(a[i]);
                map.put(b[i], longs);
            }
        }
        int res = 0;

        if (!map.containsKey(source)) {
            // System.out.println(1);
            return 1;
        } else if (map.containsValue(source)) {
            return 0;
        } else {
            Queue<Long> q = map.get(source);
            ArrayList<Long> list = new ArrayList<>();
            while (!q.isEmpty()) {
                list.add(q.poll());
                res++;
            }
            while (!list.isEmpty()) {
                ArrayList<Long> temp = new ArrayList<>();
                for (Long aLong : list) {
                    Queue<Long> y = map.get(aLong);
                    while (y != null && !y.isEmpty()) {
                        temp.add(y.poll());
                        res++;
                    }
                }
                list = temp;
            }

        }

        return res + 1;
    }


    static int getNums(int[] pids, int[] ppids, int n) {
        HashMap<Integer, List<Integer>> map = new LinkedHashMap<>();
        boolean flag = false;
        for (int i = 0; i < ppids.length; i++) {
            if (pids[i] == n)
                flag = true;
            int ppid = ppids[i];
            if (map.containsKey(ppid)) {
                List<Integer> tmp = map.get(ppid);
                tmp.add(pids[i]);
                map.replace(ppid, tmp);
            } else {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(pids[i]);
                map.put(ppid, tmp);
            }
        }
        if (!flag)
            return 0;
        if (!map.containsKey(n))
            return 1;
        return getnum(map, n) + 1;
    }

    static int getnum(HashMap<Integer, List<Integer>> map, int n) {
        if (!map.containsKey(n))
            return 0;
        List<Integer> list = map.get(n);
        int all = list.size();
        for (int i = 0; i < list.size(); i++)
            all += getnum(map, list.get(i));
        return all;
    }

    @Test
    public void fun() {
        int a = cal(new long[]{3L, 1L, 5L, 21L, 10L}, new long[]{0L, 3L, 3L, 1L, 5L}, 0);
        int b = getNums(new int[]{3, 1, 5, 21, 10}, new int[]{0, 3, 3, 1, 5}, 0);
        Assert.assertThat(a, Is.is(b));
    }
}
