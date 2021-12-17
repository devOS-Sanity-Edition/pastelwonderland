package community.devos.nautical.pastelwonderland.common;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static community.devos.nautical.pastelwonderland.PastelWonderland.MOD_ID;
import static net.minecraft.core.Registry.register;

public class Items {
    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), item);
    }
    private static Item register(String name, Block block) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, ItemGroup.pwBlocks()));
    }

    public static void init() {

    }
}
