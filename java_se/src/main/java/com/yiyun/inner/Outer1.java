package com.yiyun.inner;

/**
 * @class: Outer
 * @description: 成员内部类
 * 1.Inner 类定义在 Outer 类的内部，相当于 Outer 类的一个成员变量的位置，Inner 类可以使用任意访问控制符，
 * 如 public 、 protected 、 private 等
 * 2.Inner 类中定义的 show() 方法可以直接访问 Outer 类中的数据，而不受访问控制符的影响，
 * 如直接访问 Outer 类中的私有属性age
 * 3.定义了成员内部类后，必须使用外部类对象来创建内部类对象，而不能直接去 new 一个内部类对象，
 * 即：内部类 对象名 = 外部类对象.new 内部类( );
 * 4.编译上面的程序后，会发现产生了两个 .class 文件: Outer.class,Outer$Inner.class{}
 * 5.成员内部类中不能存在任何 static 的变量和方法,可以定义常量:
 * (1).因为非静态内部类是要依赖于外部类的实例,而静态变量和方法是不依赖于对象的,仅与类相关,
 * 简而言之:在加载静态域时,根本没有外部类,所在在非静态内部类中不能定义静态域或方法,编译不通过;
 * 非静态内部类的作用域是实例级别
 * (2).常量是在编译器就确定的,放到所谓的常量池了
 * ★★友情提示:
 * 1.外部类是不能直接使用内部类的成员和方法的，可先创建内部类的对象，然后通过内部类的对象来访问其成员变量和方法;
 * 2.如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法，如果要访问外部类的成员变量，
 * 可以使用 this 关键字,如:Outer.this.name
 * @author: yi-yun
 * @create: 2019-09-06 16:51
 **/
public class Outer1 {
    private int age = 99;
    String name = "Coco";
    double a = 1;

    public class Inner {
        private int i = 0;
        String name = "Jayden";

        public void show() {
            System.out.println(Outer1.this.name);
            System.out.println(name);
            System.out.println(age);
        }
    }

    public Inner getInnerClass() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer1 o = new Outer1();
        Inner in = o.new Inner();
        in.show();
    }
}
