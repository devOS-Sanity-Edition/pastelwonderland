package one.devos.nautical.pastelwonderland.mixin;

import one.devos.nautical.pastelwonderland.Pastelwonderland;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.components.DebugScreenOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(DebugScreenOverlay.class)
public class DevEnvDebugMenu {


    @Inject(method = "getSystemInformation", at = @At("RETURN"))
    private void appendInfo(CallbackInfoReturnable<List<String>> cir) {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            List<String> messages = cir.getReturnValue();

            messages.add("");
            messages.add("[Pastel Wonderland - Dev Env]");
            messages.add("Version: " + Pastelwonderland.VERSION);
            messages.add("");
        }
    }
}

