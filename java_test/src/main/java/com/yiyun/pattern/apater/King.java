package com.yiyun.pattern.apater;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class King implements RowBoating{
    private RowBoating rowBoating;

    @Override
    public void row() {
        rowBoating.row();
    }
}
