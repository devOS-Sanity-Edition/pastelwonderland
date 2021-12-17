package community.devos.nautical.pastelwonderland.common;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import javax.swing.text.html.BlockView;

import static community.devos.nautical.pastelwonderland.PastelWonderland.MOD_ID;

public class Blocks {
    public static final Block RED = register("red", BlockInfo.ConcreteBlock());

    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }

    public static void init() {

    }
}
