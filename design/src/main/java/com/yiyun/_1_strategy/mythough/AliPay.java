package com.yiyun._1_strategy.mythough;

/**
 * @class: AliPay
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-13 00:17
 **/
public class AliPay implements PayStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("使用支付宝付款" + amount + "元");
    }
}
