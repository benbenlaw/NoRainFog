package com.benbenlaw.rainfog;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(RainFog.MOD_ID)
public class RainFog {
    public static final String MOD_ID = "rainfog";
    public static final Logger LOGGER = LogUtils.getLogger();


    public RainFog(final IEventBus eventBus, final ModContainer modContainer) {

    }
}
