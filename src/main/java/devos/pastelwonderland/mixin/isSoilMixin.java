package devos.pastelwonderland.mixin;

import devos.pastelwonderland.Base.Gameplay.Blocks;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.Feature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Feature.class)
public class isSoilMixin {
    private static void isSoil(Block block, CallbackInfoReturnable<Boolean> cir)
    {
        if (block == Blocks.INSTANCE.getPASTEL_DIRT() || block == Blocks.INSTANCE.getPASTEL_GRASS()) {
            cir.setReturnValue(true);
        }
    }
}
