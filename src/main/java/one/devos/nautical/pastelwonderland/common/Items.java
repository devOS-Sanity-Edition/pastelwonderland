package one.devos.nautical.pastelwonderland.common;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static one.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;
import static one.devos.nautical.pastelwonderland.Pastelwonderland.PW_ITEM_GROUP;

public class Items {


    public static void init() {}

    private static Item register(String name) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2)));
    }
}
