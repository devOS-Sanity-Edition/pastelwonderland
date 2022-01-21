package community.devos.nautical.pastelwonderland.common;

import community.devos.nautical.pastelwonderland.Pastelwonderland;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;


import static community.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;
import static community.devos.nautical.pastelwonderland.Pastelwonderland.locate;
import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.*;

public class PastelwonderlandBlocks {

    protected static final BlockBehaviour.StatePredicate never = (state, view, pos) -> false;

    private static Properties pastel_block() { return copy(WHITE_CONCRETE); }
    private static Properties pastel_powder() { return copy(WHITE_CONCRETE_POWDER); }

    public static final Block PASTEL_BASE_BLOCK = register("pastel_base_block", new Block(pastel_block()), 0);
    public static final Block PASTEL_BASE_POWDER = register("pastel_base_powder", new ConcretePowderBlock(PASTEL_BASE_BLOCK, pastel_powder()), 0);
    //    public static final _SLAB = register("_pastel_slab", new SlabBlock(pastel_block()));                   //saving for later, after dimensions get working...

    public static final Block LIGHT_RED_PASTEL_BLOCK = register("light_red_pastel_block", new Block(pastel_block()), 0);
    public static final Block LIGHT_RED_PASTEL_POWDER = register("light_red_pastel_powder", new ConcretePowderBlock(LIGHT_RED_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block RED_PASTEL_BLOCK = register("red_pastel_block", new Block(pastel_block()), 0);
    public static final Block RED_PASTEL_POWDER = register("red_pastel_powder", new ConcretePowderBlock(RED_PASTEL_BLOCK, pastel_powder()), 0);


    public static final Block ORANGE_PASTEL_BLOCK = register("orange_pastel_block", new Block(pastel_block()), 0);
    public static final Block ORANGE_PASTEL_POWDER = register("orange_pastel_powder", new ConcretePowderBlock(ORANGE_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block YELLOW_PASTEL_BLOCK = register("yellow_pastel_block", new Block(pastel_block()), 0);
    public static final Block YELLOW_PASTEL_POWDER = register("yellow_pastel_powder", new ConcretePowderBlock(YELLOW_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block LIGHT_GREEN_PASTEL_BLOCK = register("light_green_pastel_block", new Block(pastel_block()), 0);
    public static final Block LIGHT_GREEN_PASTEL_POWDER = register("light_green_pastel_powder", new ConcretePowderBlock(LIGHT_GREEN_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block GREEN_PASTEL_BLOCK = register("green_pastel_block", new Block(pastel_block()), 0);
    public static final Block GREEN_PASTEL_POWDER = register("green_pastel_powder", new ConcretePowderBlock(GREEN_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block LIGHT_BLUE_PASTEL_BLOCK = register("light_blue_pastel_block", new Block(pastel_block()), 0);
    public static final Block LIGHT_BLUE_PASTEL_POWDER = register("light_blue_pastel_powder", new ConcretePowderBlock(LIGHT_BLUE_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block BLUE_PASTEL_BLOCK = register("blue_pastel_block", new Block(pastel_block()), 0);
    public static final Block BLUE_PASTEL_POWDER = register("blue_pastel_powder", new ConcretePowderBlock(BLUE_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block PURPLE_PASTEL_BLOCK = register("purple_pastel_block", new Block(pastel_block()), 0);
    public static final Block PURPLE_PASTEL_POWDER = register("purple_pastel_powder", new ConcretePowderBlock(PURPLE_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block MAGENTA_PASTEL_BLOCK = register("magenta_pastel_block", new Block(pastel_block()), 0);
    public static final Block MAGENTA_PASTEL_POWDER = register("magenta_pastel_powder", new ConcretePowderBlock(MAGENTA_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block BROWN_PASTEL_BLOCK = register("brown_pastel_block", new Block(pastel_block()), 0);
    public static final Block BROWN_PASTEL_POWDER = register("brown_pastel_powder", new ConcretePowderBlock(BROWN_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block BLACK_PASTEL_BLOCK = register("black_pastel_block", new Block(pastel_block()), 0);
    public static final Block BLACK_PASTEL_POWDER = register("black_pastel_powder", new ConcretePowderBlock(BLACK_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block LIGHT_GRAY_PASTEL_BLOCK = register("light_gray_pastel_block", new Block(pastel_block()), 0);
    public static final Block LIGHT_GRAY_PASTEL_POWDER = register("light_gray_pastel_powder", new ConcretePowderBlock(LIGHT_GRAY_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block GRAY_PASTEL_BLOCK = register("gray_pastel_block", new Block(pastel_block()), 0);
    public static final Block GRAY_PASTEL_POWDER = register("gray_pastel_powder", new ConcretePowderBlock(GRAY_PASTEL_BLOCK, pastel_powder()), 0);

    private static Properties dirt_like() { return copy(DIRT); }
    private static Properties pastel_leaves() {return copy(OAK_LEAVES).noOcclusion().isViewBlocking(never).isSuffocating(never); }

    public static final Block PASTEL_GRASS = register("pastel_grass", new GrassBlock(dirt_like()), 3);
    public static final Block PASTEL_DIRT = register("pastel_dirt", new GrassBlock(dirt_like()), 3);
    public static final Block PASTEL_STONE = register("pastel_stone", new GrassBlock(copy(STONE)), 3);
    public static final Block PASTEL_SAND = register("pastel_sand", new GrassBlock(copy(SAND)), 3);
    public static final Block PASTEL_LOG = register("pastel_log", new RotatedPillarBlock(copy(OAK_LOG)), 3);
    public static final Block PASTEL_ORE = register("pastel_ore", new Block(copy(IRON_ORE)), 3);
    public static final Block LIGHT_BLUE_LEAVES = register("light_blue_leaves", new Block(pastel_leaves()), 3);
    public static final Block LIGHT_RED_LEAVES = register("light_red_leaves", new Block(pastel_leaves()), 3);
    public static final Block LIGHT_GREEN_LEAVES = register("light_green_leaves", new Block(pastel_leaves()), 3);
    public static final Block YELLOW_LEAVES = register("yellow_leaves", new Block(pastel_leaves()), 3);



    public static final PastelwonderlandPortalBlock PASTEL_PORTAL_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, "red_pastel_portal_block"), new PastelwonderlandPortalBlock(copy(NETHER_PORTAL).noOcclusion().isViewBlocking(never)));





    public static void init() {
        String[] colors = {"pastel_base", "light_red", "red", "orange", "yellow", "light_green", "green", "light_blue", "blue", "purple", "magenta", "brown", "black", "light_gray", "gray"};
        for (String color : colors) {
            //Block PASTEL_BLOCK = register(color, new Block(copy(WHITE_CONCRETE)));
            //Block PASTEL_POWDER_BLOCK = register(color + "_powder", new ConcretePowderBlock(PASTEL_BLOCK, copy(WHITE_CONCRETE_POWDER)));
            Block PASTEL_FENCE_BLOCK = register(color + "_fence", new FenceBlock(copy(WHITE_CONCRETE)), 1);
            Block PASTEL_FENCE_GATE_BLOCK = register(color + "_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE)), 1);
            Block PASTEL_WALL_BLOCK = register(color + "_wall", new WallBlock(copy(WHITE_CONCRETE)), 1);
            Block PASTEL_SLAB_BLOCK = register(color + "_slab", new SlabBlock(copy(WHITE_CONCRETE)), 0);
            Block PASTEL_STAIR_BLOCK = register(color + "_stairs", new PastelStairs(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE)), 0);
            Block PASTEL_WOOL_BLOCK = register(color + "_wool", new Block(copy(WHITE_WOOL)), 0);
        }


    }

    private static Block register(String name, Block block, int tab) {
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new OwoItemSettings().group(Pastelwonderland.PW_ITEM_GROUP).tab(tab)));
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }
}
