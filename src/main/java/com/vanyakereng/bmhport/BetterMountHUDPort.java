package com.vanyakereng.bmhport;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;


@Mod(BetterMountHUDPort.MODID)
public class BetterMountHUDPort {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "bettermounthudport";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    public BetterMountHUDPort(IEventBus modEventBus, ModContainer modContainer) {
    }
}
