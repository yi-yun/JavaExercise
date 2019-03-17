package com.yiyun.lru;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
//委托机制
@ToString
public class LRUCache<K,V> {
    private static final float hashTableLoadFactor = 0.75f;
    private LinkedHashMap<K,V> map;
    private int  cacheSize;
    public LRUCache (int cacheSize){
        this.cacheSize = cacheSize;
        //根据cacheSize和加载因子计算hashmap的capactiy，+1确保当达到cacheSize上限时不会触发hashmap的扩容
        int hashTableCapacity = (int)Math.ceil(cacheSize / hashTableLoadFactor) + 1;
        //LinkedHashMap的一个构造函数
        //参数accessOrder为true时，即会按照访问顺序排序
        // ，最近访问的放在最前，最早访问的放在后面
        map=new LinkedHashMap<K,V>(hashTableCapacity,hashTableLoadFactor,true){
            //LinkedHashMap自带的判断是否删除最老的元素方法，默认返回false，即不删除老数据
            //我们要做的就是重写这个方法，当满足一定条件时删除老数据
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size()> LRUCache.this.cacheSize;
            }
        };
    }
    public synchronized V get (K key) {
        return map.get(key); 
    }
    public synchronized void put(K key,V value){
        map.put(key,value);
    }
    public synchronized int usedEntries() {
        return map.size(); 
    }
    public synchronized Collection<Map.Entry<K,V>> getAll() {
        return new ArrayList<Map.Entry<K,V>>(map.entrySet()); 
    }

   
}
