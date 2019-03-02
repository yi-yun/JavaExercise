package com.yiyun._7_adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishingBoat {
    private static final Logger LOGGER=LoggerFactory.getLogger(FishingBoat.class);
    public void sail() {
        LOGGER.info("test log");
        System.out.println("The fishing boat is sailing");
    }
}
