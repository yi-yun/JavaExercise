package com.yiyun.clone;

import org.junit.Test;

public class App {
    //Shallow copy
    @Test
    public void fun1() throws CloneNotSupportedException {
        Person person= new Person(23,"zhang");
        Person clone = (Person) person.clone();
        String result = person.getName() == clone.getName()?"clone是浅拷贝的" : "clone是深拷贝的";
        System.out.println("result = " + result);
    }
    //deep copy
    @Test
    public void fun2() throws CloneNotSupportedException {
        Body body = new Body(new Head(new Face()));
        Body body1 = (Body) body.clone();
        System.out.println("body1==body  " + (body1==body));

        System.out.println("body.head == body1.head : " +  (body.head == body1.head));

        System.out.println("body.head.face == body1.head.face : " +  (body.head.face == body1.head.face));
    }
    @Test
    public void fun3() throws CloneNotSupportedException{
        Person person= new Person(23,"zhang");
        Person clone = (Person) person.clone();
        clone.name="yiyun";
        System.out.println("person = " + person);
        System.out.println("clone = " + clone);
    }
}
