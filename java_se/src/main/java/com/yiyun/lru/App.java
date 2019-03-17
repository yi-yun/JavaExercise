package com.yiyun.lru;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    @Test
    public void funInheritance(){
        System.out.println("------------inheritance---------");
        final int cacheSize=5;
        Map<Integer, String> inherMap = new LinkedHashMap<Integer, String>(
            (int) Math.ceil(cacheSize / 0.75f) + 1, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size()>cacheSize;
            }
        };
        inherMap.put(1, "11");
        inherMap.put(2, "11");
        inherMap.put(3, "11");
        inherMap.put(4, "11");
        inherMap.put(5, "11");//1-2-3-4-5
        System.out.println(inherMap.toString());
        inherMap.put(6, "66");
        System.out.println("add 66"+inherMap.toString());
        inherMap.get(2);
        System.out.println("get 2"+inherMap.toString());
        inherMap.put(7, "77");
        System.out.println("add 77"+inherMap.toString());
        inherMap.get(4);
        System.out.println("get 4"+inherMap.toString());
        System.out.println();
    }
    @Test
    public void funDelegation(){
        LRUCache<String,String> c = new LRUCache<String, String>(3);
        c.put ("1", "one");                           // 1  
        c.put ("2", "two");                           // 1 2 
        c.put ("3", "three");                         // 1 2 3
        System.out.println("c = " + c);
        c.put ("4", "four");                          // 2 3 4  
        if (c.get("2") == null) throw new Error();    // 3 4 2
        c.put ("5", "five");                          // 4 2 5  
        c.put ("4", "second four");                   // 2 5 4
        System.out.println("c = " + c);
        // Verify cache content.  
        if (c.usedEntries() != 3)              throw new Error();
        if (!c.get("4").equals("second four")) throw new Error();
        if (!c.get("5").equals("five"))        throw new Error();
        if (!c.get("2").equals("two"))         throw new Error();
        // List cache content.  
        for (Map.Entry<String, String> e : c.getAll())
            System.out.println (e.getKey() + " : " + e.getValue());
    }
    @Test
    public  void funFIFO() {
        System.out.println("------------fifo---------");
        final int cacheSizeFiFo = 5;
        LinkedHashMap<Integer, String> lru = new LinkedHashMap<Integer, String>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > cacheSizeFiFo;
            }
        };
        lru.put(1, "11");
        lru.put(2, "11");
        lru.put(3, "33");
        lru.put(4, "22");
        lru.put(5, "11");
        System.out.println(lru.toString());
        lru.put(6, "66");
        lru.get(2);
        System.out.println(lru.toString());
        lru.put(7, "77");
        lru.get(4);
        System.out.println(lru.toString());
        System.out.println();
    }
    @Test
    public void funHash(){
        LRUHashMapCache<Integer, String> lru = new LRUHashMapCache(5);
        lru.put(1, "11");
        lru.put(2, "21");
        lru.put(3, "31");
        lru.put(4, "1321");
        lru.put(5, "113");
        System.out.println(lru.toString());
        lru.put(6, "626");
        lru.get(2);
        System.out.println(lru.toString());
        lru.put(7, "727");
        lru.get(4);
        System.out.println(lru.toString());
        System.out.println();
    }
}
