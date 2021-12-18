package community.devos.nautical.pastelwonderland.common;

import community.devos.nautical.pastelwonderland.PastelWonderland;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static community.devos.nautical.pastelwonderland.PastelWonderland.MOD_ID;
import static net.minecraft.commands.arguments.item.ItemArgument.item;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);

    private static final Item register(String name, Item item) {
        RegistrySupplier<Item> itemSupplied = ITEMS.register(name, () ->
                new Item(new Item.Properties().tab(ItemGroups.PW_BLOCK_GROUP)));
        return item;
    }

//    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
//            new Item(new Item.Properties().tab(PastelWonderland.EXAMPLE_TAB)));

    public static void init() {
        ITEMS.register();
    }
}
