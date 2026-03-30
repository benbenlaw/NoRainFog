package com.benbenlaw.nofog.event;

import com.benbenlaw.nofog.NoFog;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ViewportEvent;

@EventBusSubscriber(value = Dist.CLIENT, modid = NoFog.MOD_ID)

public class RenderFogEvent {

    @SubscribeEvent
    public static void onRenderFog(ViewportEvent.RenderFog event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null) {
            // Disable fog by extending fog distances so it's effectively invisible
            event.setNearPlaneDistance(0f);
            event.setFarPlaneDistance(100000f);
        }
    }
}
