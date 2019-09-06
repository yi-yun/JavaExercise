package com.yiyun.inner;

/**
 * @class: Outer4
 * @description: (1).匿名内部类是直接使用 new 来生成一个对象的引用;
 * (2).对于匿名内部类的使用它是存在一个缺陷的，就是它仅能被使用一次，创建匿名内部类时它会立即创建一个该类的实例，
 * 该类的定义会立即消失，所以匿名内部类是不能够被重复使用;
 * (3).使用匿名内部类时，我们必须是继承一个类或者实现一个接口，但是两者不可兼得，同时也只能继承一个类或者实现一个接口;
 * (4).匿名内部类中是不能定义构造函数的,匿名内部类中不能存在任何的静态成员变量和静态方法;
 * (5).匿名内部类中不能存在任何的静态成员变量和静态方法,匿名内部类不能是抽象的,它必须要实现继承的类或者实现的接口的所有抽象方法
 * (6).匿名内部类初始化:使用构造代码块！利用构造代码块能够达到为匿名内部类创建一个构造器的效果
 * @author: yi-yun
 * @create: 2019-09-06 18:55
 **/
public class Outer4 {
    public InnerClass getInnerClass(final int num, String str2) {
        return new InnerClass() {
            int number = num + 3;

            public int getNumber() {
                return number;
            }
        };        /* 注意：分号不能省 */
    }

    public static void main(String[] args) {
        Outer4 out = new Outer4();
        InnerClass inner = out.getInnerClass(2, "chenssy");
        System.out.println(inner.getNumber());
    }
}

interface InnerClass {
    int getNumber();
}         

