package community.devos.nautical.pastelwonderland.common;

import community.devos.nautical.pastelwonderland.PastelWonderland;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import static community.devos.nautical.pastelwonderland.PastelWonderland.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_REGISTRY);

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
        return new LeavesBlock(BlockBehaviour.Properties.copy(OAK_LEAVES));
    }

    public static Block ConcreteBlock() {
        return new Block(BlockBehaviour.Properties.copy(WHITE_CONCRETE));
    }

    public static GlassBlock GlassBlock() {
        return new GlassBlock(BlockBehaviour.Properties.copy(WHITE_STAINED_GLASS));
    }

    public static StainedGlassPaneBlock StainedGlassBlock(DyeColor GlassColor) {
        return new StainedGlassPaneBlock(GlassColor, BlockBehaviour.Properties.copy(WHITE_STAINED_GLASS));
    }

    public static Block PastelGlowstone() {
        return new Block(BlockBehaviour.Properties.copy(GLOWSTONE));
    }

    public static FenceBlock PastelFence() {
        return new FenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE));
    }

    public static FenceGateBlock PastelFenceGates() {
        return new FenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE));
    }

    public static SlabBlock PastelSlabs() {
        return new SlabBlock(BlockBehaviour.Properties.copy(OAK_SLAB));
    }

    class PastelStairs extends StairBlock {
        public PastelStairs(BlockState baseBlockState, Properties settings) {
            super(baseBlockState, settings);
        }
    }

    public StairBlock PastelStairs() {
        return new PastelStairs(OAK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(OAK_STAIRS));
    }

    private static Block register(String name, Block block) {
        RegistrySupplier<Block> blockSupplied = BLOCKS.register(name, () -> block);
        return block;
    }

    public static boolean never(BlockState blockState, BlockGetter blockView, BlockPos blockPos) {
        return false;
    }

    public static void init() {
        BLOCKS.register();
    }
}
