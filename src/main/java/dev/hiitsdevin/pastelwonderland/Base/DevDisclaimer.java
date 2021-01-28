package dev.hiitsdevin.pastelwonderland.Base;

import dev.hiitsdevin.pastelwonderland.PastelWonderland;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.client.MinecraftClient;

public class DevDisclaimer {
    public static void init() {
        // disclaimer text only shows in dev environment as of jan 27th. production build doesnt have it.
        //if (FabricLoader.INSTANCE.isDevelopmentEnvironment()) {}
        HudRenderCallback.EVENT.register((matrices, delta) -> {
            MinecraftClient.getInstance().textRenderer
                    .drawWithShadow(matrices, PastelWonderland.PastelWonderlandVersion, 1, 1, 0xFFFFFF); // shoot me where it hurts most please.
        });

        // renders Distribution text
        HudRenderCallback.EVENT.register((matrices, delta) -> {
            MinecraftClient.getInstance().textRenderer
                    .drawWithShadow(matrices, PastelWonderland.PastelWonderlandDistribution, 1, 10, 0xFFFFFF);
        });

        // Game FPS
        HudRenderCallback.EVENT.register((matrices, delta) -> {
            MinecraftClient.getInstance().textRenderer
                    .drawWithShadow(matrices, PastelWonderland.PastelWonderlandFPSDevelopment, 1, 20, 0xFFFFFF);
        });

        if (FabricLoader.INSTANCE.isDevelopmentEnvironment()) {
            // renders Distribution text
            HudRenderCallback.EVENT.register((matrices, delta) -> {
                MinecraftClient.getInstance().textRenderer
                        .drawWithShadow(matrices, PastelWonderland.PastelWonderlandViewDisclaimer, 1, 30, 0xFF4040);
            });
        }
    }
}
