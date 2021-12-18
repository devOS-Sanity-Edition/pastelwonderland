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

    public static final Block PASTEL_DIRT = register("dirt", new Block(BlockBehaviour.Properties.copy(DIRT)));
    public static final Block PASTEL_GRASS = register("grass", new GrassBlock(BlockBehaviour.Properties.copy(GRASS_BLOCK)));
    public static final Block PASTEL_STONE = register("stone", new Block(BlockBehaviour.Properties.copy(STONE)));
    public static final Block PASTEL_SAND = register("sand", new SandBlock(14269048, BlockBehaviour.Properties.copy(SAND)));
    public static final Block PASTEL_ORE = register("pastel_ore", new OreBlock(BlockBehaviour.Properties.copy(IRON_ORE)));
    public static final Block LIGHT_BLUE_LEAVES = register("light_blue_leaves",LeavesBlock());
    public static final Block LIGHT_RED_LEAVES = register("light_red_leaves", LeavesBlock());
    public static final Block YELLOW_LEAVES = register("yellow_leaves", LeavesBlock());
    public static final Block LIGHT_GREEN_LEAVES = register("light_green_leaves", LeavesBlock());

    //Powder Blocks
    public static final Block LIGHT_RED_POWDER = register("light_red_powder", new ConcretePowderBlock(LIGHT_RED, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block RED_POWDER = register("red_powder", new ConcretePowderBlock(RED, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block ORANGE_POWDER = register("orange_powder", new ConcretePowderBlock(ORANGE, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block YELLOW_POWDER = register("yellow_powder", new ConcretePowderBlock(YELLOW, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block LIGHT_GREEN_POWDER = register("light_green_powder", new ConcretePowderBlock(LIGHT_GREEN, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block GREEN_POWDER = register("green_powder", new ConcretePowderBlock(GREEN, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block LIGHT_BLUE_POWDER = register("light_blue_powder", new ConcretePowderBlock(LIGHT_BLUE, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block BLUE_POWDER = register("blue_powder", new ConcretePowderBlock(BLUE, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block PURPLE_POWDER = register("purple_powder", new ConcretePowderBlock(PURPLE, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block MAGENTA_POWDER = register("magenta_powder", new ConcretePowderBlock(MAGENTA, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block BLACK_POWDER = register("black_powder", new ConcretePowderBlock(BLACK, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block LIGHT_GRAY_POWDER = register("light_gray_powder", new ConcretePowderBlock(LIGHT_GRAY, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block GRAY_POWDER = register("gray_powder", new ConcretePowderBlock(GRAY, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block PASTEL_BASE_POWDER = register("pastel_base_powder", new ConcretePowderBlock(PASTEL_BASE, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));
    public static final Block BROWN_POWDER = register("brown_powder", new ConcretePowderBlock(BROWN, BlockBehaviour.Properties.copy(WHITE_CONCRETE_POWDER)));

    //Fences
    public static final Block LIGHT_RED_FENCE = register("light_red_fence", PastelFence());
    public static final Block RED_FENCE = register("red_fence", PastelFence());
    public static final Block ORANGE_FENCE = register("orange_fence", PastelFence());
    public static final Block YELLOW_FENCE = register("yellow_fence", PastelFence());
    public static final Block LIGHT_GREEN_FENCE = register("light_green_fence", PastelFence());
    public static final Block GREEN_FENCE = register("green_fence", PastelFence());
    public static final Block LIGHT_BLUE_FENCE = register("light_blue_fence", PastelFence());
    public static final Block BLUE_FENCE = register("blue_fence", PastelFence());
    public static final Block PURPLE_FENCE = register("purple_fence", PastelFence());
    public static final Block MAGENTA_FENCE = register("magenta_fence", PastelFence());
    public static final Block BLACK_FENCE = register("black_fence", PastelFence());
    public static final Block LIGHT_GRAY_FENCE = register("light_gray_fence", PastelFence());
    public static final Block GRAY_FENCE = register("gray_fence", PastelFence());
    public static final Block PASTEL_BASE_FENCE = register("pastel_base_fence", PastelFence());
    public static final Block BROWN_FENCE = register("brown_fence", PastelFence());
    //Fence Gates
    public static final Block LIGHT_RED_FENCE_GATE = register("light_red_fence_gate", PastelFenceGates());
    public static final Block RED_FENCE_GATE = register("red_fence_gate", PastelFenceGates());
    public static final Block ORANGE_FENCE_GATE = register("orange_fence_gate", PastelFenceGates());
    public static final Block YELLOW_FENCE_GATE = register("yellow_fence_gate", PastelFenceGates());
    public static final Block LIGHT_GREEN_FENCE_GATE = register("light_green_fence_gate", PastelFenceGates());
    public static final Block GREEN_FENCE_GATE = register("green_fence_gate", PastelFenceGates());
    public static final Block LIGHT_BLUE_FENCE_GATE = register("light_blue_fence_gate", PastelFenceGates());
    public static final Block BLUE_FENCE_GATE = register("blue_fence_gate", PastelFenceGates());
    public static final Block PURPLE_FENCE_GATE = register("purple_fence_gate", PastelFenceGates());
    public static final Block MAGENTA_FENCE_GATE = register("magenta_fence_gate", PastelFenceGates());
    public static final Block BLACK_FENCE_GATE = register("black_fence_gate", PastelFenceGates());
    public static final Block LIGHT_GRAY_FENCE_GATE = register("light_gray_fence_gate", PastelFenceGates());
    public static final Block GRAY_FENCE_GATE = register("gray_fence_gate", PastelFenceGates());
    public static final Block PASTEL_BASE_FENCE_GATE = register("pastel_base_fence_gate", PastelFenceGates());
    public static final Block BROWN_FENCE_GATE = register("brown_fence_gate", PastelFenceGates());

    //Glass
    public static final Block LIGHT_RED_GLASS = register("light_red_glass", GlassBlock());
    public static final Block RED_GLASS = register("red_glass", GlassBlock());
    public static final Block ORANGE_GLASS = register("orange_glass", GlassBlock());;
    public static final Block YELLOW_GLASS = register("yellow_glass", GlassBlock());
    public static final Block LIGHT_GREEN_GLASS = register("light_green_glass", GlassBlock());
    public static final Block GREEN_GLASS = register("green_glass", GlassBlock());
    public static final Block LIGHT_BLUE_GLASS = register("light_blue_glass", GlassBlock());
    public static final Block BLUE_GLASS = register("blue_glass", GlassBlock());
    public static final Block PURPLE_GLASS = register("purple_glass", GlassBlock());
    public static final Block MAGENTA_GLASS = register("magenta_glass", GlassBlock());
    public static final Block BLACK_GLASS = register("black_glass", GlassBlock());
    public static final Block LIGHT_GRAY_GLASS = register("light_gray_glass", GlassBlock());
    public static final Block GRAY_GLASS = register("gray_glass", GlassBlock());
    public static final Block PASTEL_BASE_GLASS = register("pastel_base_glass", GlassBlock());
    public static final Block BROWN_GLASS = register("brown_glass", GlassBlock());

    public static final Block LIGHT_RED_GLASS_ITEM = register("light_red_glass", LIGHT_RED_GLASS);
    public static final Block RED_GLASS_ITEM = register("red_glass", RED_GLASS);
    public static final Block ORANGE_GLASS_ITEM = register("orange_glass", ORANGE_GLASS);
    public static final Block YELLOW_GLASS_ITEM = register("yellow_glass", YELLOW_GLASS);
    public static final Block LIGHT_GREEN_GLASS_ITEM = register("light_green_glass", LIGHT_GREEN_GLASS);
    public static final Block GREEN_GLASS_ITEM = register("green_glass", GREEN_GLASS);
    public static final Block LIGHT_BLUE_GLASS_ITEM = register("light_blue_glass", LIGHT_BLUE_GLASS);
    public static final Block BLUE_GLASS_ITEM = register("blue_glass", BLUE_GLASS);
    public static final Block PURPLE_GLASS_ITEM = register("purple_glass", PURPLE_GLASS);
    public static final Block MAGENTA_GLASS_ITEM = register("magenta_glass", MAGENTA_GLASS);
    public static final Block BLACK_GLASS_ITEM = register("black_glass", BLACK_GLASS);
    public static final Block LIGHT_GRAY_GLASS_ITEM = register("light_gray_glass", LIGHT_GRAY_GLASS);
    public static final Block GRAY_GLASS_ITEM = register("gray_glass", GRAY_GLASS);
    public static final Block PASTEL_BASE_GLASS_ITEM = register("pastel_base_glass", PASTEL_BASE_GLASS);
    public static final Block BROWN_GLASS_ITEM = register("brown_glass", BROWN_GLASS);


    //Glowstone
    public static final Block LIGHT_RED_GLOWSTONE = register("light_red_glowstone", PastelGlowstone());

    //Slabs
    public static final Block LIGHT_RED_SLAB = register("light_red_slab", PastelSlabs());
    public static final Block RED_SLAB = register("red_slab", PastelSlabs());
    public static final Block ORANGE_SLAB = register("orange_slab", PastelSlabs());
    public static final Block YELLOW_SLAB = register("yellow_slab", PastelSlabs());
    public static final Block LIGHT_GREEN_SLAB = register("light_green_slab", PastelSlabs());
    public static final Block GREEN_SLAB = register("green_slab", PastelSlabs());
    public static final Block LIGHT_BLUE_SLAB = register("light_blue_slab", PastelSlabs());
    public static final Block BLUE_SLAB = register("blue_slab", PastelSlabs());
    public static final Block PURPLE_SLAB = register("purple_slab", PastelSlabs());
    public static final Block MAGENTA_SLAB = register("magenta_slab", PastelSlabs());
    public static final Block BLACK_SLAB = register("black_slab", PastelSlabs());
    public static final Block LIGHT_GRAY_SLAB = register("light_gray_slab", PastelSlabs());
    public static final Block GRAY_SLAB = register("gray_slab", PastelSlabs());
    public static final Block PASTEL_BASE_SLAB = register("pastel_base_slab", PastelSlabs());
    public static final Block BROWN_SLAB = register("brown_slab", PastelSlabs());

    public static final Block LIGHT_RED_STAIRS = register("light_red_stairs", new PastelStairs(LIGHT_RED.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block RED_STAIRS = register("red_stairs", new PastelStairs(RED.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block ORANGE_STAIRS = register("orange_stairs", new PastelStairs(ORANGE.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block YELLOW_STAIRS = register("yellow_stairs", new PastelStairs(YELLOW.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block LIGHT_GREEN_STAIRS = register("light_green_stairs", new PastelStairs(LIGHT_GREEN.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block GREEN_STAIRS = register("green_stairs", new PastelStairs(GREEN.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block LIGHT_BLUE_STAIRS = register("light_blue_stairs", new PastelStairs(LIGHT_BLUE.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block BLUE_STAIRS = register("blue_stairs", new PastelStairs(BLUE.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block PURPLE_STAIRS = register("purple_stairs", new PastelStairs(PURPLE.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block MAGENTA_STAIRS = register("magenta_stairs", new PastelStairs(MAGENTA.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block BLACK_STAIRS = register("black_stairs", new PastelStairs(BLACK.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block LIGHT_GRAY_STAIRS = register("light_gray_stairs", new PastelStairs(LIGHT_GRAY.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block GRAY_STAIRS = register("gray_stairs", new PastelStairs(GRAY.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block PASTEL_BASE_STAIRS = register("pastel_base_stairs", new PastelStairs(PASTEL_BASE.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public static final Block BROWN_STAIRS = register("brown_stairs", new PastelStairs(BROWN.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));

    public static LeavesBlock LeavesBlock() {
        return new LeavesBlock(BlockBehaviour.Properties.copy(OAK_LEAVES).noOcclusion().isSuffocating(Blocks::never).isViewBlocking(Blocks::never));
    }

    public static Block ConcreteBlock() {
        return new Block(BlockBehaviour.Properties.copy(WHITE_CONCRETE));
    }

    public static GlassBlock GlassBlock() {
        return new GlassBlock(BlockBehaviour.Properties.copy(WHITE_STAINED_GLASS));
    }

    public static StainedGlassPaneBlock StainedGlassBlock(DyeColor GlassColor) {
        return new StainedGlassPaneBlock(GlassColor, BlockBehaviour.Properties.copy(WHITE_STAINED_GLASS).isSuffocating(Blocks::never));
    }

    public static Block PastelGlowstone() {
        return new Block(BlockBehaviour.Properties.copy(GLOWSTONE));
    }

    public static FenceBlock PastelFence() {
        return new FenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE).isSuffocating(Blocks::never));
    }

    public static FenceGateBlock PastelFenceGates() {
        return new FenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE).isSuffocating(Blocks::never));
    }

    public static SlabBlock PastelSlabs() {
        return new SlabBlock(BlockBehaviour.Properties.copy(STONE_SLAB));
    }

    public StairBlock PastelStairs() {
        return new PastelStairs(STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS));
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
