package dev.hiitsdevin.pastelwonderland.Mixin;

import dev.hiitsdevin.pastelwonderland.Base.Blocks;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.Feature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Feature.class)
class IsSoilMixin {
    @Inject(method = "isSoil(Lnet/minecraft/block/Block;)Z", at = @At(value = "HEAD"), cancellable = true)
    private static void isSoil(Block block, CallbackInfoReturnable<Boolean> cir)
    {
        if (block == Blocks.DIRT || block == Blocks.GRASS) {
            cir.setReturnValue(true);
        }
    }
}