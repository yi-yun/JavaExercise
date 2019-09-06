package com.yiyun.inner;

/**
 * @class: Outer2
 * @description: (二).静态内部类: 是 static 修饰的内部类,
 * 1.静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问
 * 2.如果外部类的静态成员与内部类的成员名称相同，可通过“类名.静态成员”访问外部类的静态成员；
 * 如果外部类的静态成员与内部类的成员名称不相同，则可通过“成员名”直接调用外部类的静态成员
 * 3.创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名 = new 内部类();
 * @author: yi-yun
 * @create: 2019-09-06 17:02
 **/
public class Outer2 {
    private int age = 99;
    static String name = "Coco";

    public static class Inner {
        String name = "Jayden";

        public void show() {
            System.out.println(Outer2.name);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Inner i = new Inner();
        i.show();
    }
}
