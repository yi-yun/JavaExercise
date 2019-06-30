package com.yiyun.Rule13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackClone implements Cloneable{
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackClone() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    @Override
    protected StackClone clone() throws CloneNotSupportedException {
        return (StackClone)super.clone();
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    // Ensure space for at least one more element.
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
