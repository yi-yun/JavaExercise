package exam.sogou;

import java.util.*;

/**
 * @class: _1
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-09-08 16:30
 **/
public class Main {
    private static final float hashTableLoadFactor = 0.75f;
    private LinkedHashMap<String, Integer> map;
    private int cacheSize;

    public Main(int cacheSize) {
        this.cacheSize = cacheSize;
        //根据cacheSize和加载因子计算hashmap的capactiy，+1确保当达到cacheSize上限时不会触发hashmap的扩容
        int hashTableCapacity = (int) Math.ceil(cacheSize / hashTableLoadFactor) + 1;
        //LinkedHashMap的一个构造函数
        //参数accessOrder为true时，即会按照访问顺序排序
        // ，最近访问的放在最前，最早访问的放在后面
        map = new LinkedHashMap<String, Integer>(hashTableCapacity, hashTableLoadFactor, true) {
            //LinkedHashMap自带的判断是否删除最老的元素方法，默认返回false，即不删除老数据
            //我们要做的就是重写这个方法，当满足一定条件时删除老数据
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > Main.this.cacheSize;
            }
        };
    }

    public synchronized Integer get(String key) {
        return map.get(key);
    }

    public synchronized void put(String key, Integer value) {
        map.put(key, value);
    }

    public synchronized int usedEntries() {
        return map.size();
    }

    public synchronized Collection<Map.Entry<String, Integer>> getAll() {
        return new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main main = new Main(n);
        
    }
}
