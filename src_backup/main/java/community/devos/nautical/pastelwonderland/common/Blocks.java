package community.devos.nautical.pastelwonderland.common;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.dedicated.Settings;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.util.Locals;

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

    public static final Block PASTEL_DIRT = register("dirt", new Block(FabricBlockSettings.copy(DIRT)));
    public static final Block PASTEL_GRASS = register("grass", new GrassBlock(FabricBlockSettings.copy(GRASS_BLOCK)));
    public static final Block PASTEL_STONE = register("stone", new Block(FabricBlockSettings.copy(STONE)));
    public static final Block PASTEL_SAND = register("sand", new SandBlock(14269048, FabricBlockSettings.copy(SAND)));
    public static final Block PASTEL_ORE = register("pastel_ore", new OreBlock(FabricBlockSettings.copy(IRON_ORE)));
    public static final Block LIGHT_BLUE_LEAVES = register("light_blue_leaves",LeavesBlock());
    public static final Block LIGHT_RED_LEAVES = register("light_red_leaves", LeavesBlock());
    public static final Block YELLOW_LEAVES = register("yellow_leaves", LeavesBlock());
    public static final Block LIGHT_GREEN_LEAVES = register("light_green_leaves", LeavesBlock());

    //Fences
    public static final Block LIGHT_RED_FENCE = register("light_red_fence", PastelFence());
    public static final Block RED_FENCE = register("red_fence", PastelFence());
    public static final Block ORANGE_FENCE = register("orange_fence", PastelFence());
    public static final Block YELLOW_FENCE = register("yellow_fence", PastelFence());
    public static final Block LIGHT_GREEN__FENCE = register("light_green_fence", PastelFence());
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
//    temp comment out bc
//    1. broken [one end wants static, one end wants non-static. it's annoying.
//    2. Architectury port.

    //Stairs
    public static final Block LIGHT_RED_STAIRS = register("light_red_stairs", PastelStairs());
    public static final Block RED_STAIRS = register("red_stairs", PastelStairs());
    public static final Block ORANGE_STAIRS = register("orange_stairs", PastelStairs());
    public static final Block YELLOW_STAIRS = register("yellow_stairs", PastelStairs());
    public static final Block LIGHT_GREEN_STAIRS = register("light_green_stairs", PastelStairs());
    public static final Block GREEN_STAIRS = register("green_stairs", PastelStairs());
    public static final Block LIGHT_BLUE_STAIRS = register("light_blue_stairs", PastelStairs());
    public static final Block BLUE_STAIRS = register("blue_stairs", PastelStairs());
    public static final Block PURPLE_STAIRS = register("purple_stairs", PastelStairs());
    public static final Block MAGENTA_STAIRS = register("magenta_stairs", PastelStairs());
    public static final Block BLACK_STAIRS = register("black_stairs", PastelStairs());
    public static final Block LIGHT_GRAY_STAIRS = register("light_gray_stairs", PastelStairs());
    public static final Block GRAY_STAIRS = register("gray_stairs", PastelStairs());
    public static final Block PASTEL_BASE_STAIRS = register("pastel_base_stairs", PastelStairs());
    public static final Block BROWN_STAIRS = register("brown_stairs", PastelStairs());
//
//    //Walls
    public static final Block LIGHT_RED_WALL = register("light_red_wall", PastelWalls())
    public static final Block RED_WALL = register("red_wall", PastelWalls())
    public static final Block ORANGE_WALL = register("orange_wall", PastelWalls())
    public static final Block YELLOW_WALL = register("yellow_wall", PastelWalls())
    public static final Block LIGHT_GREEN__WALL = register("light_green_wall", PastelWalls())
    public static final Block GREEN_WALL = register("green_wall", PastelWalls())
    public static final Block LIGHT_BLUE_WALL = register("light_blue_wall", PastelWalls())
    public static final Block BLUE_WALL = register("blue_wall", PastelWalls())
    public static final Block PURPLE_WALL = register("purple_wall", PastelWalls())
    public static final Block MAGENTA_WALL = register("magenta_wall", PastelWalls())
    public static final Block BLACK_WALL = register("black_wall", PastelWalls())
    public static final Block LIGHT_GRAY_WALL = register("light_gray_wall", PastelWalls())
    public static final Block GRAY_WALL = register("gray_wall", PastelWalls())
    public static final Block PASTEL_BASE_WALL = register("pastel_base_wall", PastelWalls())
    public static final Block BROWN_WALL = register("brown_wall", PastelWalls())
//
//    //Wools
//    public static final Block LIGHT_RED_WOOL = register("light_red_wool", PastelWool())
//    public static final Block RED_WOOL = register("red_wool", PastelWool())
//    public static final Block ORANGE_WOOL = register("orange_wool", PastelWool())
//    public static final Block YELLOW_WOOL = register("yellow_wool", PastelWool())
//    public static final Block LIGHT_GREEN_WOOL = register("light_green_wool", PastelWool())
//    public static final Block GREEN_WOOL = register("green_wool", PastelWool())
//    public static final Block LIGHT_BLUE_WOOL = register("light_blue_wool", PastelWool())
//    public static final Block BLUE_WOOL = register("blue_wool", PastelWool())
//    public static final Block PURPLE_WOOL = register("purple_wool", PastelWool())
//    public static final Block MAGENTA_WOOL = register("magenta_wool", PastelWool())
//    public static final Block BLACK_WOOL = register("black_wool", PastelWool())
//    public static final Block LIGHT_GRAY_WOOL = register("light_gray_wool", PastelWool())
//    public static final Block GRAY_WOOL = register("gray_wool", PastelWool())
//    public static final Block PASTEL_BASE_WOOL = register("pastel_base_wool", PastelWool())
//    public static final Block BROWN_WOOL = register("brown_wool", PastelWool())
//
//    // Start of Wood Varients
//
//    //Logs
//    public static final Block LIGHT_RED_LOG = register("light_red_log", PastelWoodLogs())
//    public static final Block LIGHT_GREEN_LOG = register("light_green_log", PastelWoodLogs())
//    public static final Block LIGHT_BLUE_LOG = register("light_blue_log", PastelWoodLogs())
//    public static final Block YELLOW_LOG = register("yellow_log", PastelWoodLogs())
//
//    //Planks
//    public static final Block LIGHT_RED_PLANK = register("light_red_plank", PastelWoodPlanks())
//    public static final Block LIGHT_GREEN_PLANK = register("light_green_plank", PastelWoodPlanks())
//    public static final Block LIGHT_BLUE_PLANK = register("light_blue_plank", PastelWoodPlanks())
//    public static final Block YELLOW_PLANK = register("yellow_plank", PastelWoodPlanks())
//
//    //Plank Stairs
//    public static final Block LIGHT_RED_PLANK_STAIRS = register("light_red_plank_stairs", PastelStairs())
//    public static final Block LIGHT_GREEN_PLANK_STAIRS = register("light_green_plank_stairs", PastelStairs())
//    public static final Block LIGHT_BLUE_PLANK_STAIRS = register("light_blue_plank_stairs", PastelStairs())
//    public static final Block YELLOW_PLANK_STAIRS = register("yellow_plank_stairs", PastelStairs())

    //Plank Slabs
    public static final Block LIGHT_RED_PLANK_SLAB = register("light_red_plank_slab", PastelSlabs());
    public static final Block LIGHT_GREEN_PLANK_SLAB = register("light_green_plank_slab", PastelSlabs());
    public static final Block LIGHT_BLUE_PLANK_SLAB = register("light_blue_plank_slab", PastelSlabs());
    public static final Block YELLOW_PLANK_SLAB = register("yellow_plank_slab", PastelSlabs());

    //Plank Fence Gates
    public static final Block LIGHT_RED_PLANK_FENCE_GATE = register("light_red_plank_fence_gate", PastelFenceGates());
    public static final Block LIGHT_GREEN_PLANK_FENCE_GATE = register("light_green_plank_fence_gate", PastelFenceGates());
    public static final Block LIGHT_BLUE_PLANK_FENCE_GATE = register("light_blue_plank_fence_gate", PastelFenceGates());
    public static final Block YELLOW_PLANK_FENCE_GATE = register("yellow_plank_fence_gate", PastelFenceGates());

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

    public static FenceBlock PastelFence() {
        return new FenceBlock(FabricBlockSettings.copy(OAK_FENCE));
    }

    public static FenceGateBlock PastelFenceGates() {
        return new FenceGateBlock(FabricBlockSettings.copy(OAK_FENCE_GATE));
    }

    public static SlabBlock PastelSlabs() {
        return new SlabBlock(FabricBlockSettings.copy(OAK_SLAB));
    }

    class PastelStairs extends StairBlock {
        public PastelStairs(BlockState baseBlockState, Properties settings) {
            super(baseBlockState, settings);
        }
    }

    public StairBlock PastelStairs() {
        return new PastelStairs(OAK_STAIRS.defaultBlockState(), FabricBlockSettings.copy(OAK_STAIRS));
    }

    private static Block register(String name, Block block) {
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, ItemGroup.pwBlocks()));
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }

    public static void init() {

    }
}
