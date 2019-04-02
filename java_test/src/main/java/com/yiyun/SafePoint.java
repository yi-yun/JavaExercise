package com.yiyun;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SafePoint {

    private int x,y;
    private SafePoint(int [] a){
        this(a[0],a[1]);
    }
    public SafePoint(SafePoint point){
        this(point.get());
    }
    public synchronized int[] get() {
        return new int[]{x,y};
    }
    public synchronized void set(int x,int y){
        this.x=x;
        this.y=y;
    }
}
