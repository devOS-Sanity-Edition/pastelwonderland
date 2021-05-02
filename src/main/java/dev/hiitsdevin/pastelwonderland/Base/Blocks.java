package dev.hiitsdevin.pastelwonderland.Base;

import dev.hiitsdevin.pastelwonderland.Base.Organization.ItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;
import static net.minecraft.block.Blocks.WHITE_CONCRETE;

public class Blocks {

    public static final Block RED = register("red", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block BLUE = register("blue", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block GREEN = register("green", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block BLACK = register("black", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block WHITE = register("white", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block GRAY = register("gray", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block MAGENTA = register("magenta", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block PURPLE = register("purple", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block ORANGE = register("orange", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block YELLOW = register("yellow", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block BROWN = register("brown", new GrassBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));

    private static Block register(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), new BlockItem(block, ItemGroup.pwBlocks()));
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }
    public static void init() {

    }
}
