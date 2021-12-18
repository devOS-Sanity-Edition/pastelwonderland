package community.devos.nautical.pastelwonderland.common;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static community.devos.nautical.pastelwonderland.PastelWonderland.MOD_ID;

public class ItemGroups {
    public static final CreativeModeTab PW_BLOCK_GROUP = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "blocks"), () ->
            new ItemStack(Blocks.LIGHT_RED));
    public static final CreativeModeTab PW_ARMOURS_AND_TOOLS_GROUP = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "armourandtools"), () ->
            new ItemStack(Blocks.LIGHT_RED));
    public static final CreativeModeTab PW_MISC = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "misc"), () ->
            new ItemStack(Blocks.LIGHT_RED));
    public static final CreativeModeTab PW_FOOD = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "food"), () ->
            new ItemStack(Blocks.LIGHT_RED));

    public static Item.Properties pwBlocks() {
        return new Item.Properties().tab(PW_BLOCK_GROUP);
    }

    public static Item.Properties pwItems() {
        return new Item.Properties().tab(PW_ARMOURS_AND_TOOLS_GROUP);
    }

    public static Item.Properties pwMisc() {
        return new Item.Properties().tab(PW_MISC);
    }

    public static Item.Properties pwFood() {
        return new Item.Properties().tab(PW_FOOD);
    }

    public static void init() {

    }
}
