package com.yiyun.inner;

/**
 * @class: Outer3
 * @description: (三).局部内部类：其作用域仅限于方法内，方法外部无法访问该内部类
 * (1).局部内部类就像是方法里面的一个局部变量一样，是不能有 public、protected、private 以及 static 修饰符的
 * (2).只能访问方法中定义的 final 类型的局部变量,因为:
 * 当方法被调用运行完毕之后，局部变量就已消亡了。但内部类对象可能还存在,
 * 直到没有被引用时才会消亡。此时就会出现一种情况，就是内部类要访问一个不存在的局部变量;
 * ==>使用final修饰符不仅会保持对象的引用不会改变,而且编译器还会持续维护这个对象在回调方法中的生命周期.
 * 局部内部类并不是直接调用方法传进来的参数，而是内部类将传进来的参数通过自己的构造器备份到了自己的内部，
 * 自己内部的方法调用的实际是自己的属性而不是外部类方法的参数;
 * 防止被篡改数据,而导致内部类得到的值不一致
 * java8 编译器优化了 final
 * @author: yi-yun
 * @create: 2019-09-06 17:04
 **/
public class Outer3 {
    public void show() {
        int a = 25;
        int b = 13;
        class Inner {
            int c = 2;

            public void print() {
                System.out.println("访问外部类:" + a);
                System.out.println("访问内部类:" + c);
            }
        }
        Inner i = new Inner();
        i.print();
    }

    public static void main(String[] args) {
        Outer3 o = new Outer3();
        o.show();
    }
}
