// 🦀 CRAB IN THE CODE 🦀

package dev.hiitsdevin.pastelwonderland;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;


public class Items {
    // todo: add an item texture that corresponds to pastelwonderland:icon
    private static final Item ICON = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "icon"), new Item(new Item.Settings()));
    // imagine needing a dedicated icon pffffffffft
    // i am horrible

    // creating that new ✨ item group ✨ and that new tab
    private static final ItemGroup DEVIN_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "group"), () -> new ItemStack(Blocks.RED));

    private static Item.Settings itemSettings() {
        return new Item.Settings().group(DEVIN_GROUP);
    }

    // all the blocks that are being added
    public static final Item RED = new BlockItem(Blocks.RED, itemSettings());
    public static final Item ORANGE = new BlockItem(Blocks.ORANGE, itemSettings());
    public static final Item YELLOW = new BlockItem(Blocks.YELLOW, itemSettings());
    public static final Item GREEN = new BlockItem(Blocks.GREEN, itemSettings());
    public static final Item BLUE = new BlockItem(Blocks.BLUE, itemSettings());
    public static final Item PURPLE = new BlockItem(Blocks. PURPLE, itemSettings());
    public static final Item MAGENTA = new BlockItem(Blocks.MAGENTA, itemSettings());
    public static final Item BLACK = new BlockItem(Blocks.BLACK, itemSettings());
    public static final Item GRAY = new BlockItem(Blocks.GRAY, itemSettings());

    //registered so i guess i can do /give @p pastelwonderland:colorhere bc fuck you too ig
    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    // registered into the ItemGroup
    // this is  c l e a n  and i thank lizzy so much uwu
    public static void init() {
        final HashMap<String, Item> items = new HashMap<String, Item>() {{
            put("red", RED);
            put("orange", ORANGE);
            put("yellow", YELLOW);
            put("green", GREEN);
            put("blue", BLUE);
            put("purple", PURPLE);
            put("magenta", MAGENTA);
            put("black", BLACK);
            put("gray", GRAY);
        }};

        for (Map.Entry<String, Item> entry : items.entrySet()) register(entry.getKey(), entry.getValue());
    }

}
