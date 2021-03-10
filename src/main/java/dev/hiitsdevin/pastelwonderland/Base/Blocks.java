// 🦀 CRAB IN THE CODE 🦀

package dev.hiitsdevin.pastelwonderland.Base;

import dev.hiitsdevin.pastelwonderland.Base.Organization.BlockInfo;
import dev.hiitsdevin.pastelwonderland.GrassStuff.Grass;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;
import static net.minecraft.block.Blocks.*;

public class Blocks {

    //Pastel Blocks
    public static final Block RED = register("red", BlockInfo.ConcreteBlock());
    public static final Block ORANGE = register("orange", BlockInfo.ConcreteBlock());
    public static final Block YELLOW = register("yellow", BlockInfo.ConcreteBlock());
    public static final Block GREEN = register("green", BlockInfo.ConcreteBlock());
    public static final Block BLUE = register("blue", BlockInfo.ConcreteBlock());
    public static final Block PURPLE = register("purple", BlockInfo.ConcreteBlock());
    public static final Block MAGENTA = register("magenta", BlockInfo.ConcreteBlock());
    public static final Block GRAY = register("gray", BlockInfo.ConcreteBlock());
    public static final Block BLACK = register("black", BlockInfo.ConcreteBlock());
    public static final Block BROWN = register("brown", BlockInfo.ConcreteBlock());
    public static final Block WHITE = register("white", BlockInfo.ConcreteBlock());

    //Pastel Powder
    public static final Block RED_POWDER = register("red_powder", new ConcretePowderBlock(RED, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
    public static final Block ORANGE_POWDER = register("orange_powder", new ConcretePowderBlock(ORANGE, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
    public static final Block YELLOW_POWDER = register("yellow_powder", new ConcretePowderBlock(YELLOW, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
    public static final Block GREEN_POWDER = register("green_powder", new ConcretePowderBlock(GREEN, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
    public static final Block BLUE_POWDER = register("blue_powder", new ConcretePowderBlock(BLUE, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
    public static final Block PURPLE_POWDER = register("purple_powder", new ConcretePowderBlock(PURPLE, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
    public static final Block MAGENTA_POWDER = register("magenta_powder", new ConcretePowderBlock(MAGENTA, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
    public static final Block GRAY_POWDER = register("gray_powder", new ConcretePowderBlock(GRAY, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
    public static final Block BLACK_POWDER = register("black_powder", new ConcretePowderBlock(BLACK, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
    public static final Block BROWN_POWDER = register("brown_powder", new ConcretePowderBlock(BROWN, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
    public static final Block WHITE_POWDER = register("white_powder", new ConcretePowderBlock(WHITE, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));

    //Pastel Glass
    public static final Block WHITE_GLASS = register("white_glass", BlockInfo.GlassBlock());

    //Pastel Glass Pane
    public static final Block WHITE_GLASS_PANE = register("white_glass_pane", BlockInfo.GlassPaneBlock());


    //Terrain
    public static final Block DIRT = register("dirt", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.DIRT)));
    public static final Block GRASS = register("grass", new Grass(FabricBlockSettings.copy(GRASS_BLOCK)));
    public static final Block STONE = register("stone", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.STONE)));
    public static final Block PASTEL_ORE = register("pastel_ore", new Block(FabricBlockSettings.copy(IRON_ORE)));
    public static final Block SAND = register("sand", new SandBlock(14269048, FabricBlockSettings.copy(net.minecraft.block.Blocks.SAND)));

    //Tree
    public static final Block BLUE_LEAF = register("blue_leaves", BlockInfo.LeavesBlock());
    public static final Block RED_LEAF = register("red_leaves", BlockInfo.LeavesBlock());
    public static final Block YELLOW_LEAF = register("yellow_leaves", BlockInfo.LeavesBlock());
    public static final Block GREEN_LEAF = register("green_leaves", BlockInfo.LeavesBlock());
    public static final Block LOG = register("log", new PillarBlock(FabricBlockSettings.copy(OAK_LOG)));

    public static final Block RED_PASTEL_GLOWSTONE = register("red_pastel_glowstone", BlockInfo.PastelGlowstone());
    public static final Block BLUE_PASTEL_GLOWSTONE = register("blue_pastel_glowstone", BlockInfo.PastelGlowstone());

    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return false;
    }

    public static void init() {

    }
}