package com.yiyun.Spring.DI.xml_autowired;

public class Person {
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "Dog=" + dog +
                '}';
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
