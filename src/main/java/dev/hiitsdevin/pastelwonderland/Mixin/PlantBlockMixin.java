package dev.hiitsdevin.pastelwonderland.Mixin;

import net.minecraft.block.*;
import dev.hiitsdevin.pastelwonderland.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlantBlock.class)
public class PlantBlockMixin {

    @Inject(method = "canPlantOnTop", at = @At("TAIL"), cancellable = true)
    public void canPlantOnTop(BlockState block, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        boolean isSand = block.isOf(Blocks.SAND);
        boolean isDirt = block.isOf(Blocks.DIRT)|| block.isOf(Blocks.GRASS);
        if (isDirt || isSand) {
            cir.setReturnValue(true);
            cir.cancel();
        }
    }
}
