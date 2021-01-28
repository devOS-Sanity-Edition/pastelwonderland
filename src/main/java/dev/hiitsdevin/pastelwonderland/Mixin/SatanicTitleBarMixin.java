package dev.hiitsdevin.pastelwonderland.Mixin;

import net.fabricmc.loader.FabricLoader;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class SatanicTitleBarMixin {
    @Inject(method = "updateWindowTitle()V", at = @At("HEAD"), cancellable = true)
    private void updateTitle(CallbackInfo info) {
        if (FabricLoader.INSTANCE.isDevelopmentEnvironment()) info.cancel();
    }
}
