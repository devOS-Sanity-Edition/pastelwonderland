package dev.hiitsdevin.devinsuselessmod;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;

public class DevDisclaimer {
    public static void init() {
        // renders version text [pls try to keep this to dev environment, comment this out if you're using in production/release. thank you ♥
        HudRenderCallback.EVENT.register((matrices, delta) -> { // i literally have no idea what a matrices and why delta is here but fuck it whatever
            MinecraftClient.getInstance().textRenderer
                    .drawWithShadow(matrices, Devinsuselessmod.PrototypePastelVersion, 1, 1, 0xFFFFFFFF); //this literally doesnt work if it's not 8 fucking characters, even tho typical hex codes are 6. *screaming*
        });

        // renders Distribution text
        HudRenderCallback.EVENT.register((matrices, delta) -> {
            MinecraftClient.getInstance().textRenderer
                    .drawWithShadow(matrices, Devinsuselessmod.PrototypePastelDistribution, 1, 11, 0xFFFFFFFF);
        });

    }
}
