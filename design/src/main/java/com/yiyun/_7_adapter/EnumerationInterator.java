package com.yiyun._7_adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationInterator implements Iterator {
    Enumeration enumeration;

    public EnumerationInterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

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
