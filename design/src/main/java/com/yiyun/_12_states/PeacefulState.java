package com.yiyun._12_states;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@AllArgsConstructor
public class PeacefulState implements State {
    private static final Logger LOGGER=LoggerFactory.getLogger(App.class);
    private Mammoth mammoth;
    @Override
    public void onEnterState() {
        LOGGER.info("{} is calm and peaceful.", mammoth);
    }

    @Override
    public void observe() {
        LOGGER.info("{} calms down.", mammoth);
    }
}
