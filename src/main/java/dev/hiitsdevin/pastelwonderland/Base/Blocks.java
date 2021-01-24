// 🦀 CRAB IN THE CODE 🦀

package dev.hiitsdevin.pastelwonderland.Base;

import dev.hiitsdevin.pastelwonderland.GrassStuff.Grass;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;
import static net.minecraft.block.Blocks.*;

public class Blocks {

    // registering blocks into the game as if they actually existed [spoiler alert: they do ✨]
    public static final Block RED = register("red", new Block(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block ORANGE = register("orange", new Block(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block YELLOW = register("yellow", new Block(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block GREEN = register("green", new Block(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block BLUE = register("blue", new Block(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block PURPLE = register("purple", new Block(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block MAGENTA = register("magenta", new Block(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block GRAY = register("gray", new Block(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block BLACK = register("black", new Block(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block BROWN = register("brown", new Block(FabricBlockSettings.copy(BROWN_CONCRETE)));
    public static final Block DIRT = register("dirt", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.DIRT)));
    public static final Block GRASS = register("grass", new Grass(FabricBlockSettings.copy(GRASS_BLOCK)));
    public static final Block STONE = register("stone", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.STONE)));
    public static final Block PASTEL = register("pastel", new Block(FabricBlockSettings.copy(IRON_ORE)));
    public static final Block SAND = register("sand", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.SAND)));

    //Tree Stuff
    public static final Block BLUE_LEAF = register("blue_leaves", new LeavesBlock(FabricBlockSettings.copy(OAK_LEAVES)));
    public static final Block RED_LEAF = register("red_leaves", new LeavesBlock(FabricBlockSettings.copy(OAK_LEAVES)));
    public static final Block YELLOW_LEAF = register("yellow_leaves", new LeavesBlock(FabricBlockSettings.copy(OAK_LEAVES)));
    public static final Block GREEN_LEAF = register("green_leaves", new LeavesBlock(FabricBlockSettings.copy(OAK_LEAVES)));


    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static void init() {
    }

}
