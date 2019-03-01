package com.yiyun._7_adapter;

public class Captain implements RowingBoat {
    private RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    @Override
    public void row() {
        rowingBoat.row();
    }
}
