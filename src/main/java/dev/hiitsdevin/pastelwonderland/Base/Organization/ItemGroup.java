package dev.hiitsdevin.pastelwonderland.Base.Organization;

import dev.hiitsdevin.pastelwonderland.Base.Blocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;

public class ItemGroup {
    public static final net.minecraft.item.ItemGroup PW_BLOCK_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "blocks"), () -> new ItemStack(Blocks.RED));
    public static Item.Settings pwBlocks() {
        return new Item.Settings().group(PW_BLOCK_GROUP);
    }
}
