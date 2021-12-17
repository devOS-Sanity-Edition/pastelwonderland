package community.devos.nautical.pastelwonderland.common;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraft.world.level.block.state.BlockState;

import javax.swing.text.html.BlockView;

import static community.devos.nautical.pastelwonderland.PastelWonderland.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class Blocks {
    public static final Block LIGHT_RED = register("light_red", ConcreteBlock());
    public static final Block RED = register("red", ConcreteBlock());
    public static final Block ORANGE = register("orange", ConcreteBlock());
    public static final Block YELLOW = register("yellow", ConcreteBlock());
    public static final Block LIGHT_GREEN = register("light_green", ConcreteBlock());
    public static final Block GREEN = register("green", ConcreteBlock());
    public static final Block LIGHT_BLUE =register("light_blue", ConcreteBlock());
    public static final Block BLUE = register("blue", ConcreteBlock());
    public static final Block PURPLE = register("purple", ConcreteBlock());
    public static final Block MAGENTA = register("magenta", ConcreteBlock());
    public static final Block BLACK = register("black", ConcreteBlock());
    public static final Block LIGHT_GRAY = register("light_gray", ConcreteBlock());
    public static final Block GRAY = register("gray", ConcreteBlock());
    public static final Block PASTEL_BASE = register("pastel_base", ConcreteBlock());
    public static final Block BROWN = register("brown", ConcreteBlock());

    public static LeavesBlock LeavesBlock() {
        return new LeavesBlock(FabricBlockSettings.copy(OAK_LEAVES)); //todo: revisit this to make it non-suffocatable, non-opaque, and can view through
    }

    public static Block ConcreteBlock() {
        return new Block(FabricBlockSettings.copy(WHITE_CONCRETE));
    }

    public static GlassBlock GlassBlock() {
        return new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS));
    }

    public static StainedGlassPaneBlock StainedGlassBlock(DyeColor GlassColor) {
        return new StainedGlassPaneBlock(GlassColor, FabricBlockSettings.copy(WHITE_STAINED_GLASS));
    }

    public static Block PastelGlowstone() {
        return new Block(FabricBlockSettings.copy(GLOWSTONE));
    }

    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }

    public static void init() {

    }
}
