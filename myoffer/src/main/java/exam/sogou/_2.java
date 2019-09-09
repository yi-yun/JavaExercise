package exam.sogou;

import org.junit.Test;

import java.util.*;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-08 16:35
 **/
public class _2 {
    public static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        int t = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            Queue<Integer> queue = new LinkedList<>();
            int root = sc.nextInt();
            set.add(root);
            for (int j = 1; j < m; j++) {
                int next = sc.nextInt();
                set.add(next);
                queue.offer(next);
            }
            map.put(root, queue);
        }
        cal(map, k);
    }

    private static void cal(Map<Integer, Queue<Integer>> map, int k) {
        int res = 0;
        List<Integer> y = new ArrayList<>();
        y.add(0);
        while (!set.isEmpty()) {
            res++;
            List<Integer> temp = new ArrayList<>();
            for (Integer poll : y) {
                set.remove(poll);
                Queue<Integer> queue = map.get(poll);
                for (int i = 0; i < k; i++) {
                    if (queue != null && !queue.isEmpty()) {
                        temp.add(queue.poll());
                    }
                }
            }
            y.addAll(temp);
        }
        System.out.println(res - 1);
    }

    @Test
    public void fun() {
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        map.put(0, q);
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(3);
        map.put(1, q1);

        cal(map, 2);
    }
}
