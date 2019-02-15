package com.yiyun.container.map;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class MyNode {
    int hash;
    Object key;
    Object value;
    MyNode next;
}
