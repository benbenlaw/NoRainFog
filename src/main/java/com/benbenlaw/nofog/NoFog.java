package com.benbenlaw.nofog;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(NoFog.MOD_ID)
public class NoFog {
    public static final String MOD_ID = "nofog";
    public static final Logger LOGGER = LogUtils.getLogger();


    public NoFog(final IEventBus eventBus, final ModContainer modContainer) {

    }
}
