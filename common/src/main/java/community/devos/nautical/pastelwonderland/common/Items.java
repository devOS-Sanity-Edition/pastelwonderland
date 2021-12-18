package community.devos.nautical.pastelwonderland.common;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import org.lwjgl.system.CallbackI;

import static community.devos.nautical.pastelwonderland.PastelWonderland.MOD_ID;

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

    //Pastel Powders
    public static final Item LIGHT_RED_POWDER = register("light_red_powder", new BlockItem(Blocks.LIGHT_RED_POWDER, ItemGroups.pwBlocks()));
    public static final Item RED_POWDER = register("red_powder", new BlockItem(Blocks.RED_POWDER, ItemGroups.pwBlocks()));
    public static final Item ORANGE_POWDER = register("orange_powder", new BlockItem(Blocks.ORANGE_POWDER, ItemGroups.pwBlocks()));
    public static final Item YELLOW_POWDER = register("yellow_powder", new BlockItem(Blocks.YELLOW_POWDER, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GREEN_POWDER = register("light_green_powder", new BlockItem(Blocks.LIGHT_GREEN_POWDER, ItemGroups.pwBlocks()));
    public static final Item GREEN_POWDER = register("green_powder", new BlockItem(Blocks.GREEN_POWDER, ItemGroups.pwBlocks()));
    public static final Item LIGHT_BLUE_POWDER = register("light_blue_powder", new BlockItem(Blocks.LIGHT_BLUE_POWDER, ItemGroups.pwBlocks()));
    public static final Item BLUE_POWDER = register("blue_powder", new BlockItem(Blocks.BLUE_POWDER, ItemGroups.pwBlocks()));
    public static final Item PURPLE_POWDER = register("purple_powder", new BlockItem(Blocks.PURPLE_POWDER, ItemGroups.pwBlocks()));
    public static final Item MAGENTA_POWDER = register("magenta_powder", new BlockItem(Blocks.MAGENTA_POWDER, ItemGroups.pwBlocks()));
    public static final Item BLACK_POWDER = register("black_powder", new BlockItem(Blocks.BLACK_POWDER, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GRAY_POWDER = register("light_gray_powder", new BlockItem(Blocks.LIGHT_GRAY_POWDER, ItemGroups.pwBlocks()));
    public static final Item GRAY_POWDER = register("gray_powder", new BlockItem(Blocks.GRAY_POWDER, ItemGroups.pwBlocks()));
    public static final Item PASTEL_BASE_POWDER = register("pastel_base_powder", new BlockItem(Blocks.PASTEL_BASE_POWDER, ItemGroups.pwBlocks()));
    public static final Item BROWN_POWDER = register("brown_powder", new BlockItem(Blocks.BROWN_POWDER, ItemGroups.pwBlocks()));

    public static final Item PASTEL_DIRT = register("dirt", new BlockItem(Blocks.PASTEL_DIRT, ItemGroups.pwBlocks()));
    public static final Item PASTEL_GRASS = register("grass", new BlockItem(Blocks.PASTEL_GRASS, ItemGroups.pwBlocks()));
    public static final Item PASTEL_STONE = register("stone", new BlockItem(Blocks.PASTEL_STONE, ItemGroups.pwBlocks()));
    public static final Item PASTEL_SAND = register("sand", new BlockItem(Blocks.PASTEL_SAND, ItemGroups.pwBlocks()));
    public static final Item PASTEL_ORE = register("pastel_ore", new BlockItem(Blocks.PASTEL_ORE, ItemGroups.pwBlocks()));
    public static final Item LIGHT_BLUE_LEAVES = register("light_blue_leaves", new BlockItem(Blocks.LIGHT_BLUE_LEAVES, ItemGroups.pwBlocks()));
    public static final Item LIGHT_RED_LEAVES = register("light_red_leaves", new BlockItem(Blocks.LIGHT_RED_LEAVES, ItemGroups.pwBlocks()));
    public static final Item YELLOW_LEAVES = register("yellow_leaves", new BlockItem(Blocks.YELLOW_LEAVES, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GREEN_LEAVES =register("light_green_leaves", new BlockItem(Blocks.LIGHT_GREEN_LEAVES, ItemGroups.pwBlocks()));

    public static final Item PASTEL_POWDER = register("pastel_powder", new Item(ItemGroups.pwMisc()));
    public static final Item PASTEL_INGOT = register("pastel_ingot", new Item(ItemGroups.pwMisc()));

    private static final Item register(String name, Item item) {
        RegistrySupplier<Item> itemSupplied = ITEMS.register(name, () -> item);
        return item;
    }

    public static void init() {
        ITEMS.register();
    }
}
