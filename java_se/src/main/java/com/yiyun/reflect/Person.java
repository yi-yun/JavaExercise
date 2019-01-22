package com.yiyun.reflect;


public class Person {
    private int id;
    private String name;

    private Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public void eat(String  something){
        System.out.println("正在吃" + something);
    }

    private void speak(String message){
        System.out.println("正在说" + message);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
