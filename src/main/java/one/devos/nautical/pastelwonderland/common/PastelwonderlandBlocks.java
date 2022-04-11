package one.devos.nautical.pastelwonderland.common;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import one.devos.nautical.pastelwonderland.Pastelwonderland;

import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy;
import static one.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;

public class PastelwonderlandBlocks {

    protected static final BlockBehaviour.StatePredicate never = (state, view, pos) -> false;

    public static final int pastel_sand_color = 16246726;
    private static Properties pastel_block() { return copy(WHITE_CONCRETE); }
    private static Properties pastel_powder() { return copy(WHITE_CONCRETE_POWDER); }

    public static final Block PASTEL_BASE_BLOCK = register("pastel_base_block", new Block(pastel_block()), 0);
    public static final Block PASTEL_BASE_POWDER_BLOCK = register("pastel_base_powder_block", new ConcretePowderBlock(PASTEL_BASE_BLOCK, pastel_powder()), 0);
    //    public static final _SLAB = register("_pastel_slab", new SlabBlock(pastel_block()));                   //saving for later, after dimensions get working...

    public static final Block LIGHT_RED_PASTEL_BLOCK = register("light_red_pastel_block", new Block(pastel_block()), 0);
    public static final Block LIGHT_RED_PASTEL_POWDER_BLOCK = register("light_red_pastel_powder_block", new ConcretePowderBlock(LIGHT_RED_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block RED_PASTEL_BLOCK = register("red_pastel_block", new Block(pastel_block()), 0);
    public static final Block RED_PASTEL_POWDER_BLOCK = register("red_pastel_powder_block", new ConcretePowderBlock(RED_PASTEL_BLOCK, pastel_powder()), 0);


    public static final Block ORANGE_PASTEL_BLOCK = register("orange_pastel_block", new Block(pastel_block()), 0);
    public static final Block ORANGE_PASTEL_POWDER_BLOCK = register("orange_pastel_powder_block", new ConcretePowderBlock(ORANGE_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block YELLOW_PASTEL_BLOCK = register("yellow_pastel_block", new Block(pastel_block()), 0);
    public static final Block YELLOW_PASTEL_POWDER_BLOCK = register("yellow_pastel_powder_block", new ConcretePowderBlock(YELLOW_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block LIGHT_GREEN_PASTEL_BLOCK = register("light_green_pastel_block", new Block(pastel_block()), 0);
    public static final Block LIGHT_GREEN_PASTEL_POWDER_BLOCK = register("light_green_pastel_powder_block", new ConcretePowderBlock(LIGHT_GREEN_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block GREEN_PASTEL_BLOCK = register("green_pastel_block", new Block(pastel_block()), 0);
    public static final Block GREEN_PASTEL_POWDER_BLOCK = register("green_pastel_powder_block", new ConcretePowderBlock(GREEN_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block LIGHT_BLUE_PASTEL_BLOCK = register("light_blue_pastel_block", new Block(pastel_block()), 0);
    public static final Block LIGHT_BLUE_PASTEL_POWDER_BLOCK = register("light_blue_pastel_powder_block", new ConcretePowderBlock(LIGHT_BLUE_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block BLUE_PASTEL_BLOCK = register("blue_pastel_block", new Block(pastel_block()), 0);
    public static final Block BLUE_PASTEL_POWDER_BLOCK = register("blue_pastel_powder_block", new ConcretePowderBlock(BLUE_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block PURPLE_PASTEL_BLOCK = register("purple_pastel_block", new Block(pastel_block()), 0);
    public static final Block PURPLE_PASTEL_POWDER_BLOCK = register("purple_pastel_powder_block", new ConcretePowderBlock(PURPLE_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block MAGENTA_PASTEL_BLOCK = register("magenta_pastel_block", new Block(pastel_block()), 0);
    public static final Block MAGENTA_PASTEL_POWDER_BLOCK = register("magenta_pastel_powder_block", new ConcretePowderBlock(MAGENTA_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block BROWN_PASTEL_BLOCK = register("brown_pastel_block", new Block(pastel_block()), 0);
    public static final Block BROWN_PASTEL_POWDER_BLOCK = register("brown_pastel_powder_block", new ConcretePowderBlock(BROWN_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block BLACK_PASTEL_BLOCK = register("black_pastel_block", new Block(pastel_block()), 0);
    public static final Block BLACK_PASTEL_POWDER_BLOCK = register("black_pastel_powder_block", new ConcretePowderBlock(BLACK_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block LIGHT_GRAY_PASTEL_BLOCK = register("light_gray_pastel_block", new Block(pastel_block()), 0);
    public static final Block LIGHT_GRAY_PASTEL_POWDER_BLOCK = register("light_gray_pastel_powder_block", new ConcretePowderBlock(LIGHT_GRAY_PASTEL_BLOCK, pastel_powder()), 0);

    public static final Block GRAY_PASTEL_BLOCK = register("gray_pastel_block", new Block(pastel_block()), 0);
    public static final Block GRAY_PASTEL_POWDER_BLOCK = register("gray_pastel_powder_block", new ConcretePowderBlock(GRAY_PASTEL_BLOCK, pastel_powder()), 0);

    private static Properties dirt_like() { return copy(DIRT); }
    private static Properties pastel_leaves() {return copy(OAK_LEAVES).noOcclusion().isViewBlocking(never).isSuffocating(never); }
    private static Properties sand_like() { return Properties.of(Material.SAND).strength(0.5F).sound(SoundType.SAND) ; }

    public static final Block PASTEL_GRASS = register("pastel_grass", new GrassBlock(dirt_like()), 3);
    public static final Block PASTEL_DIRT = register("pastel_dirt", new Block(dirt_like()), 3);
    public static final Block PASTEL_STONE = register("pastel_stone", new Block(copy(STONE)), 3);
    public static final Block PASTEL_SAND = register("pastel_sand", new SandBlock(pastel_sand_color, sand_like()), 3);
    public static final Block PASTEL_LOG = register("pastel_log", new RotatedPillarBlock(copy(OAK_LOG)), 3);
    public static final Block PASTEL_ORE = register("pastel_ore", new Block(copy(IRON_ORE)), 3);
    public static final Block LIGHT_BLUE_LEAVES = register("light_blue_leaves", new LeavesBlock(pastel_leaves()), 3);
    public static final Block LIGHT_RED_LEAVES = register("light_red_leaves", new LeavesBlock(pastel_leaves()), 3);
    public static final Block LIGHT_GREEN_LEAVES = register("light_green_leaves", new LeavesBlock(pastel_leaves()), 3);
    public static final Block YELLOW_LEAVES = register("yellow_leaves", new LeavesBlock(pastel_leaves()), 3);

    public static final PastelwonderlandPortalBlock PASTEL_PORTAL_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, "red_pastel_portal_block"), new PastelwonderlandPortalBlock(copy(NETHER_PORTAL).noOcclusion().isViewBlocking(never)));

    private static Block register(String name, Block block, int tab) {
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new OwoItemSettings().group(Pastelwonderland.PW_ITEM_GROUP).tab(tab)));
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

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
}
