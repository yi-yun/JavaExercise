package exam.weipinhui;

import java.util.*;

/**
 * @class: _2
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-15 18:57
 **/
public class _2 {
    public static void main(String[] args) {
        LFUCache myCache = new LFUCache(3);
        myCache.put(2, 2);
        myCache.put(1, 1);
        System.out.println(myCache.get(2));
        System.out.println(myCache.get(1));
        System.out.println(myCache.get(2));
        myCache.put(3, 3);
        myCache.put(4, 4);
        System.out.println(myCache.get(3));
        System.out.println(myCache.get(2));
        System.out.println(myCache.get(1));
        System.out.println(myCache.get(4));
    }

    static class LFUCache {
        //存放 key value
        private static HashMap<Integer, Integer> map;
        //统计个数
        private static HashMap<Integer, Integer> keyCount;
        //统计每个 cnt 下有多少个 key
        private static HashMap<Integer, HashSet<Integer>> cntSetKey;
        private int size;
        //最小被利用的次数
        private int min;

        public LFUCache(int size) {
            this.size = size;
            min = -1;
            map = new HashMap<>();
            keyCount = new HashMap<>();
            cntSetKey = new HashMap<>();
            cntSetKey.put(1, new HashSet<>());
        }

        public int get(int key) {
            if (!map.containsKey(key)) {
                return -1;
            }
            Integer cnt = keyCount.get(key);
            keyCount.put(key, cnt + 1);
            //先移除
            cntSetKey.get(cnt).remove(key);
            //说明这个 key 最少被使用
            if (cnt == min && cntSetKey.get(cnt).size() == 0) {
                min++;
            }
            if (!cntSetKey.containsKey(cnt + 1)) {
                cntSetKey.put(cnt + 1, new LinkedHashSet<>());
            }
            cntSetKey.get(cnt + 1).add(key);
            return map.get(key);
        }

        public void put(int key, int val) {
            //如果原来值存在更新并且cnt+1
            if (map.containsKey(key)) {
                map.put(key, val);
                get(key);
                return;
            }
            //未插入前要溢出
            if (map.size() >= size) {
                //得到要移除的 key
                Integer next = cntSetKey.get(min).iterator().next();
                map.remove(next);
                keyCount.remove(next);
                cntSetKey.get(min).remove(next);
            }

            map.put(key, val);
            keyCount.put(key, 1);
            HashSet<Integer> set = cntSetKey.get(1);
            set.add(key);
            min = 1;
        }
    }

}
