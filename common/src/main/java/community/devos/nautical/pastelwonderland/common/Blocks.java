package community.devos.nautical.pastelwonderland.common;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
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

    //Walls
    public static final Block LIGHT_RED_WALL = register("light_red_wall", PastelWalls());
    public static final Block RED_WALL = register("red_wall", PastelWalls());
    public static final Block ORANGE_WALL = register("orange_wall", PastelWalls());
    public static final Block YELLOW_WALL = register("yellow_wall", PastelWalls());
    public static final Block LIGHT_GREEN_WALL = register("light_green_wall", PastelWalls());
    public static final Block GREEN_WALL = register("green_wall", PastelWalls());
    public static final Block LIGHT_BLUE_WALL = register("light_blue_wall", PastelWalls());
    public static final Block BLUE_WALL = register("blue_wall", PastelWalls());
    public static final Block PURPLE_WALL = register("purple_wall", PastelWalls());
    public static final Block MAGENTA_WALL = register("magenta_wall", PastelWalls());
    public static final Block BLACK_WALL = register("black_wall", PastelWalls());
    public static final Block LIGHT_GRAY_WALL = register("light_gray_wall", PastelWalls());
    public static final Block GRAY_WALL = register("gray_wall", PastelWalls());
    public static final Block PASTEL_BASE_WALL = register("pastel_base_wall", PastelWalls());
    public static final Block BROWN_WALL = register("brown_wall", PastelWalls());

    //Glass
    public static final Block LIGHT_RED_GLASS = register("light_red_glass", GlassBlock());
    public static final Block RED_GLASS = register("red_glass", GlassBlock());
    public static final Block ORANGE_GLASS = register("orange_glass", GlassBlock());
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

    // waiting until i can find an easy way to do the models bc im not about to go through 100+ JSON files again.
//    public static final Block LIGHT_RED_GLASS_PANE = register("light_red_glass_pane", GlassPaneBlock(DyeColor.RED));
//    public static final Block PASTEL_BASE_GLASS_PANE = register("pastel_base_glass_pane", GlassPaneBlock(DyeColor.WHITE));


    //Glowstone
    public static final Block LIGHT_RED_GLOWSTONE = register("light_red_glowstone", PastelGlowstone());
    public static final Block LIGHT_BLUE_GLOWSTONE = register("light_blue_glowstone", PastelGlowstone());

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

    //Wools
    public final static Block LIGHT_RED_WOOL = register("light_red_wool", PastelWool());
    public final static Block RED_WOOL = register("red_wool", PastelWool());
    public final static Block ORANGE_WOOL = register("orange_wool", PastelWool());
    public final static Block YELLOW_WOOL = register("yellow_wool", PastelWool());
    public final static Block LIGHT_GREEN_WOOL = register("light_green_wool", PastelWool());
    public final static Block GREEN_WOOL = register("green_wool", PastelWool());
    public final static Block LIGHT_BLUE_WOOL = register("light_blue_wool", PastelWool());
    public final static Block BLUE_WOOL = register("blue_wool", PastelWool());
    public final static Block PURPLE_WOOL = register("purple_wool", PastelWool());
    public final static Block MAGENTA_WOOL = register("magenta_wool", PastelWool());
    public final static Block BLACK_WOOL = register("black_wool", PastelWool());
    public final static Block LIGHT_GRAY_WOOL = register("light_gray_wool", PastelWool());
    public final static Block GRAY_WOOL = register("gray_wool", PastelWool());
    public final static Block PASTEL_BASE_WOOL = register("pastel_base_wool", PastelWool());
    public final static Block BROWN_WOOL = register("brown_wool", PastelWool());

    // Start of Wood Varients

    //Logs
    public final static Block LIGHT_RED_LOG = register("light_red_log", PastelWoodLogs());
    public final static Block LIGHT_GREEN_LOG = register("light_green_log", PastelWoodLogs());
    public final static Block LIGHT_BLUE_LOG = register("light_blue_log", PastelWoodLogs());
    public final static Block YELLOW_LOG = register("yellow_log", PastelWoodLogs());

    //Planks
    public final static Block LIGHT_RED_PLANK = register("light_red_plank", PastelWoodPlanks());
    public final static Block LIGHT_GREEN_PLANK = register("light_green_plank", PastelWoodPlanks());
    public final static Block LIGHT_BLUE_PLANK = register("light_blue_plank", PastelWoodPlanks());
    public final static Block YELLOW_PLANK = register("yellow_plank", PastelWoodPlanks());

    //Plank Stairs
    public final static Block LIGHT_RED_PLANK_STAIRS = register("light_red_plank_stairs", new PastelStairs(LIGHT_RED_PLANK.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public final static Block LIGHT_GREEN_PLANK_STAIRS = register("light_green_plank_stairs", new PastelStairs(LIGHT_GREEN_PLANK.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public final static Block LIGHT_BLUE_PLANK_STAIRS = register("light_blue_plank_stairs", new PastelStairs(LIGHT_BLUE_PLANK.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));
    public final static Block YELLOW_PLANK_STAIRS = register("yellow_plank_stairs", new PastelStairs(YELLOW_PLANK.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS)));

    //Plank Slabs
    public final static Block LIGHT_RED_PLANK_SLAB = register("light_red_plank_slab", PastelSlabs());
    public final static Block LIGHT_GREEN_PLANK_SLAB = register("light_green_plank_slab", PastelSlabs());
    public final static Block LIGHT_BLUE_PLANK_SLAB = register("light_blue_plank_slab", PastelSlabs());
    public final static Block YELLOW_PLANK_SLAB = register("yellow_plank_slab", PastelSlabs());

    //Plank Fence Gates
    public final static Block LIGHT_RED_PLANK_FENCE_GATE = register("light_red_plank_fence_gate", PastelFenceGates());
    public final static Block LIGHT_GREEN_PLANK_FENCE_GATE = register("light_green_plank_fence_gate", PastelFenceGates());
    public final static Block LIGHT_BLUE_PLANK_FENCE_GATE = register("light_blue_plank_fence_gate", PastelFenceGates());
    public final static Block YELLOW_PLANK_FENCE_GATE = register("yellow_plank_fence_gate", PastelFenceGates());

    public final static Block LIGHT_RED_TNT = register("light_red_tnt", PastelTntBlocks());

    public static LeavesBlock LeavesBlock() {
        return new LeavesBlock(BlockBehaviour.Properties.copy(OAK_LEAVES).noOcclusion().isSuffocating(Blocks::never).isViewBlocking(Blocks::never));
    }

    public static Block ConcreteBlock() {
        return new Block(BlockBehaviour.Properties.copy(WHITE_CONCRETE));
    }

    public static GlassBlock GlassBlock() {
        return new GlassBlock(BlockBehaviour.Properties.copy(WHITE_STAINED_GLASS));
    }

    public static StainedGlassPaneBlock GlassPaneBlock(DyeColor GlassColor) {
        return new StainedGlassPaneBlock(GlassColor, BlockBehaviour.Properties.copy(WHITE_STAINED_GLASS).isSuffocating(Blocks::never));
    }

    public static Block PastelGlowstone() {
        return new Block(BlockBehaviour.Properties.copy(GLOWSTONE).lightLevel((blockStatex) -> {return 15;}));
    }

    public static FenceBlock PastelFence() {
        return new FenceBlock(BlockBehaviour.Properties.copy(OAK_FENCE).isSuffocating(Blocks::never));
    }

    public static FenceGateBlock PastelFenceGates() {
        return new FenceGateBlock(BlockBehaviour.Properties.copy(OAK_FENCE_GATE).isSuffocating(Blocks::never));
    }

    public static WallBlock PastelWalls() {
        return new WallBlock(BlockBehaviour.Properties.copy(STONE_BRICK_WALL).isSuffocating(Blocks::never));
    }

    public static SlabBlock PastelSlabs() {
        return new SlabBlock(BlockBehaviour.Properties.copy(STONE_SLAB));
    }

    public StairBlock PastelStairs() {
        return new PastelStairs(STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(STONE_STAIRS));
    }

    public static Block PastelWool() {
        return new Block(BlockBehaviour.Properties.copy(WHITE_WOOL));
    }

    public static Block PastelWoodLogs() {
        return new RotatedPillarBlock(BlockBehaviour.Properties.copy(OAK_LOG));
    }

    public static Block PastelWoodPlanks() {
        return new Block(BlockBehaviour.Properties.copy(OAK_PLANKS));
    }

    public static TntBlock PastelTntBlocks() { return new PastelTnt(TNT.defaultBlockState(), BlockBehaviour.Properties.copy(TNT).instabreak()); }

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
