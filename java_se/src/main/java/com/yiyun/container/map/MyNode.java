package com.yiyun.container.map;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class MyNode<K,V> {
    int hash;
    K key;
    V value;
    MyNode next;
}
