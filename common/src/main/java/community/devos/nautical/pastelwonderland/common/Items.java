package community.devos.nautical.pastelwonderland.common;

import community.devos.nautical.pastelwonderland.PastelWonderland;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static community.devos.nautical.pastelwonderland.PastelWonderland.MOD_ID;
import static net.minecraft.commands.arguments.item.ItemArgument.item;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);

    public static final Item LIGHT_RED = register("light_red", new BlockItem(Blocks.LIGHT_RED, ItemGroups.pwBlocks()));
    public static final Item RED = register("red", new BlockItem(Blocks.RED, ItemGroups.pwBlocks()));
    public static final Item ORANGE = register("orange", new BlockItem(Blocks.ORANGE, ItemGroups.pwBlocks()));
    public static final Item YELLOW = register("yellow", new BlockItem(Blocks.YELLOW, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GREEN = register("light_green", new BlockItem(Blocks.LIGHT_GREEN, ItemGroups.pwBlocks()));
    public static final Item GREEN = register("green", new BlockItem(Blocks.GREEN, ItemGroups.pwBlocks()));
    public static final Item LIGHT_BLUE = register("light_blue", new BlockItem(Blocks.LIGHT_BLUE, ItemGroups.pwBlocks()));
    public static final Item BLUE = register("blue", new BlockItem(Blocks.BLUE, ItemGroups.pwBlocks()));
    public static final Item PURPLE = register("purple", new BlockItem(Blocks.PURPLE, ItemGroups.pwBlocks()));
    public static final Item MAGENTA = register("magenta", new BlockItem(Blocks.MAGENTA, ItemGroups.pwBlocks()));
    public static final Item BLACK = register("black", new BlockItem(Blocks.BLACK, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GRAY = register("light_gray", new BlockItem(Blocks.LIGHT_GRAY, ItemGroups.pwBlocks()));
    public static final Item GRAY = register("gray", new BlockItem(Blocks.GRAY, ItemGroups.pwBlocks()));
    public static final Item PASTEL_BASE = register("pastel_base", new BlockItem(Blocks.PASTEL_BASE, ItemGroups.pwBlocks()));
    public static final Item BROWN = register("brown", new BlockItem(Blocks.BROWN, ItemGroups.pwBlocks()));


    private static final Item register(String name, Item item) {
        RegistrySupplier<Item> itemSupplied = ITEMS.register(name, () -> item);
        return item;
    }

    public static void init() {
        ITEMS.register();
    }
}
