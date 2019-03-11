package com.yiyun._11_composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Letter extends LetterComposite{
    private char c;

    @Override
    protected void printThisBefore() {
        System.out.println("c = " + c);
    }
}
