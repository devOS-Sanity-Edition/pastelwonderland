package community.devos.nautical.pastelwonderland.common;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static community.devos.nautical.pastelwonderland.PastelWonderland.MOD_ID;

public class ItemGroup {
    public static final CreativeModeTab PW_BLOCK_GROUP = FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID), () -> new ItemStack(Blocks.RED));
    public static Item.Properties pwBlocks() {
        return new Item.Properties().tab(PW_BLOCK_GROUP);
    }
}
