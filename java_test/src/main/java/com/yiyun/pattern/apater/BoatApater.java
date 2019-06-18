package com.yiyun.pattern.apater;

public class BoatApater implements RowBoating {
    private FishingBoat fishingBoat;

    public BoatApater() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
