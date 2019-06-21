package com.yiyun.Rule11;


import com.google.auto.value.AutoValue;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAutoValue{
    @Test
    public void testAnimal() {
        Animal dog = Animal.create("dog", 4);
        Animal dog1 = Animal.create("dog", 4);
        /*System.out.println(dog+""+dog1);*/
        System.out.println(dog.hashCode());
        System.out.println(dog1.hashCode());
        assertEquals("dog", dog.name());
        assertEquals(4, dog.numberOfLegs());

        // You probably don't need to write assertions like these; just illustrating.
        assertTrue(Animal.create("dog", 4).equals(dog));
        assertFalse(Animal.create("cat", 4).equals(dog));
        assertFalse(Animal.create("dog", 2).equals(dog));

        assertEquals("Animal{name=dog, numberOfLegs=4}", dog.toString());
    }
}
@AutoValue
abstract class Animal {
    static Animal create(String name, int numberOfLegs) {
        return new AutoValue_Animal(name, numberOfLegs);
    }
    

    abstract String name();

    abstract int numberOfLegs();
}
