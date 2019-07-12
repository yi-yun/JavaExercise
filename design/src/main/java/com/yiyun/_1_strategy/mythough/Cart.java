package com.yiyun._1_strategy.mythough;

import lombok.AllArgsConstructor;

/**
 * @class: Cart
 * @description: 定义购物车
 * @author: yi-yun
 * @create: 2019-07-13 00:21
 **/
@AllArgsConstructor
public class Cart {
    private int amount;

    public void pay(PayStrategy payStrategy) {
        payStrategy.pay(amount);
    }
}
