package com.yiyun.java8.chap10;

import org.junit.Test;

import java.util.Optional;

public class OptionalMain {
    @Test
    public void fun() {
        Insurance insurance = new Insurance();
        Optional<Insurance> optionalInsurance = Optional.ofNullable(insurance);
        Optional<String> name = optionalInsurance.map(Insurance::getName);
        System.out.println("name = " + name);
    }

    public String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
            .flatMap(Car::getInsurance)
            .map(Insurance::getName)
            .orElse("Unknown");
    }
}
