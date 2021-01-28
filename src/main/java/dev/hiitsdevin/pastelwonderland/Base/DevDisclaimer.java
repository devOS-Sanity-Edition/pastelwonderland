package dev.hiitsdevin.pastelwonderland.Base;

import dev.hiitsdevin.pastelwonderland.PastelWonderland;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.client.MinecraftClient;

public class DevDisclaimer {
    public static void init() {
        // disclaimer text only shows in dev environment as of jan 27th. production build doesnt have it.
        if (FabricLoader.INSTANCE.isDevelopmentEnvironment()) {
            HudRenderCallback.EVENT.register((matrices, delta) -> {
                MinecraftClient.getInstance().textRenderer
                        .drawWithShadow(matrices, PastelWonderland.PrototypePastelVersion, 1, 1, 0xFFFFFF); // shoot me where it hurts most please.
            });

            // renders Distribution text
            HudRenderCallback.EVENT.register((matrices, delta) -> {
                MinecraftClient.getInstance().textRenderer
                        .drawWithShadow(matrices, PastelWonderland.PrototypePastelDistribution, 1, 11, 0xFFFFFF);
            });

            // renders Distribution text
            HudRenderCallback.EVENT.register((matrices, delta) -> {
                MinecraftClient.getInstance().textRenderer
                        .drawWithShadow(matrices, PastelWonderland.PrototypePastelViewDisclaimer, 1, 21, 0xFF4040);
            });
        }
    }
}
