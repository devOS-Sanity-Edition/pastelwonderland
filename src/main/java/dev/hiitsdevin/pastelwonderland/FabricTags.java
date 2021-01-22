package dev.hiitsdevin.pastelwonderland;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class FabricTags {
    public static final Tag<Block> DIRT = blockTagRegister("dirt");
    public static Tag<Block> blockTagRegister(String id) {
        return TagRegistry.block(new Identifier("c", id));
    }
}
