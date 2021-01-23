package dev.hiitsdevin.pastelwonderland.Mixin;

import dev.hiitsdevin.pastelwonderland.Blocks;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.Feature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Feature.class)
public class isSoil {
    @Inject(method="isSoil", at=@At("HEAD"), cancellable = true)
    private static void isSoil(Block block, CallbackInfoReturnable<Boolean> cir) {
        if (block == Blocks.DIRT || block == Blocks.GRASS) {
            cir.setReturnValue(true);
        }
    }
}
