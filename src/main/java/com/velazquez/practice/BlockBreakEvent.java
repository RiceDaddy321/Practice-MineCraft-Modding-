package com.velazquez.practice;

import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakEvent {

    @SubscribeEvent
    public void sendEXP(BreakEvent event) {
        event.getPlayer().addExperience(2000);

    }
}
