package community.devos.nautical.pastelwonderland.common;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static community.devos.nautical.pastelwonderland.PastelWonderland.MOD_ID;

public class ItemGroups {
    public static final CreativeModeTab PW_BLOCK_GROUP = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "pastelwonderlandtab1"), () ->
            new ItemStack(Blocks.LIGHT_RED));

    public static Item.Properties pwBlocks() {
        return new Item.Properties().tab(PW_BLOCK_GROUP);
    }

    public static void init() {

    }
}
