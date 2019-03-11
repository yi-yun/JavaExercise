package com.yiyun._11_composite;

import java.util.ArrayList;
import java.util.List;


public abstract class LetterComposite {
    private List<LetterComposite> children=new ArrayList<>();
    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {}

    protected void printThisAfter() {}

    /**
     * Print
     */
    public void print() {
        printThisBefore();
        for (LetterComposite letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}
