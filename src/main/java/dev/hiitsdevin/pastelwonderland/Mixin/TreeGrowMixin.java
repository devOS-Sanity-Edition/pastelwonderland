/*package dev.hiitsdevin.pastelwonderland.Mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import static dev.hiitsdevin.pastelwonderland.Mixin.isSoil.*;

@Mixin(TreeFeature.class)
public class TreeGrowMixin {

    @Inject(method="isDirtOrGrass", at = @At("TAIL"), cancellable = true)
    private static boolean isDirtOrGrass(TestableWorld world, BlockPos pos) {
        return world.testBlockState(pos, (state) -> {
            return isSoil(state) || state.isOf(Blocks.FARMLAND);
        });
    }
}*/
