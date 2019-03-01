package com.yiyun._7_adapter;

public class FishingBoatAdapter implements RowingBoat {
    private FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
