package com.yiyun._1_strategy.mythough;

/**
 * @class: WeChatPay
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-13 00:18
 **/
public class WeChatPay implements PayStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("使用微信支付" + amount + "元");
    }
}
