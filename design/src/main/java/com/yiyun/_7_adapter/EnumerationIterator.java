package com.yiyun._7_adapter;

import lombok.AllArgsConstructor;

import java.util.Enumeration;
import java.util.Iterator;

@AllArgsConstructor
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;


    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
