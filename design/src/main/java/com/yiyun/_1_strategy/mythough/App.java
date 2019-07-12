package com.yiyun._1_strategy.mythough;

/**
 * @class: App
 * @description: TODO
 * @author: yi-yun
 * @create: 2019-07-13 00:22
 **/
public class App {
    public static void main(String[] args) {
        Cart cart = new Cart(1314);
        cart.pay(new AliPay());

        cart = new Cart(521);
        cart.pay(new WeChatPay());
    }
}
