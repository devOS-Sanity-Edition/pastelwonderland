package dev.hiitsdevin.pastelwonderland.Base;

import dev.hiitsdevin.pastelwonderland.Base.Organization.ItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;
import static net.minecraft.block.Blocks.GRASS_BLOCK;

public class Blocks {

    public static final Block RED = register("red", new GrassBlock(FabricBlockSettings.copy(GRASS_BLOCK)));

    private static Block register(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), new BlockItem(block, ItemGroup.pwBlocks()));
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }
    public static void init() {

    }
}