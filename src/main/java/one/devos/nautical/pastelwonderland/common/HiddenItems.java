package one.devos.nautical.pastelwonderland.common;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static one.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;

public class HiddenItems {
    public static final Item LOGO = Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "logo"), new Item(new Item.Properties().stacksTo(-1))); //I really don't know a better way to do this for the haha funny itemGroup icon
    public static final Item RED_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "red_block"), new Item(new Item.Properties().stacksTo(-1)));
}
