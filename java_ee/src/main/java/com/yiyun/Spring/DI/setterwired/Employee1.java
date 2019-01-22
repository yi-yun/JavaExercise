package com.yiyun.Spring.DI.setterwired;

public class Employee1 {
    private String name;
    private int age;
    private Boolean male;

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", male=" + male +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }
}
