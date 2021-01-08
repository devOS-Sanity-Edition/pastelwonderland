package dev.hiitsdevin.devinsuselessmod;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Items {
    // todo: add an item texture that corresponds to devin:icon
    private static final Item ICON = Registry.register(Registry.ITEM, new Identifier("devin", "icon"), new Item(new Item.Settings()));

    private static final ItemGroup DEVIN_GROUP = FabricItemGroupBuilder.build(new Identifier("devin", "group"), () -> new ItemStack(ICON));

    private static Item.Settings itemSettings() {
        return new Item.Settings().group(DEVIN_GROUP);
    }

    public static final Item RED = new Item(itemSettings());
    public static final Item ORANGE = new Item(itemSettings());
    public static final Item YELLOW = new Item(itemSettings());
    public static final Item GREEN = new Item(itemSettings());
    public static final Item BLUE = new Item(itemSettings());
    public static final Item PURPLE = new Item(itemSettings());
    public static final Item MAGENTA = new Item(itemSettings());
    public static final Item BLACK = new Item(itemSettings());
    public static final Item GRAY = new Item(itemSettings());
    public static final Item MICHAEL_REEVES = new Item(itemSettings());


    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("devin", name), item);
    }

    public static void init() {
        final HashMap<String, Item> items = new HashMap() {{
            put("red", RED);
            put("orange", ORANGE);
            put("yellow", YELLOW);
            put("green", GREEN);
            put("blue", BLUE);
            put("purple", PURPLE);
            put("magenta", MAGENTA);
            put("black", BLACK);
            put("gray", GRAY);
            put("michael_reeves", MICHAEL_REEVES);
        }};

        for (Map.Entry<String, Item> entry : items.entrySet()) register(entry.getKey(), entry.getValue());
    }

}
