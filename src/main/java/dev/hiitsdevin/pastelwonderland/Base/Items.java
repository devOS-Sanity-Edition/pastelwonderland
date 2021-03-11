// 🦀 CRAB IN THE CODE 🦀

package dev.hiitsdevin.pastelwonderland.Base;

import dev.hiitsdevin.pastelwonderland.Base.Organization.ItemGroup;
import dev.hiitsdevin.pastelwonderland.PastelWonderland;
import dev.hiitsdevin.pastelwonderland.Tools.PastelArmors;
import dev.hiitsdevin.pastelwonderland.Tools.PastelAxeItem;
import dev.hiitsdevin.pastelwonderland.Tools.PastelHoeItem;
import dev.hiitsdevin.pastelwonderland.Tools.PastelPickItem;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;
import static dev.hiitsdevin.pastelwonderland.Tools.PastelTools.PASTEL_TOOLS;


public class Items {
    //Pastel Blocks
    public static final Item RED = register("red", Blocks.RED);
    public static final Item ORANGE = register("orange", Blocks.ORANGE);
    public static final Item YELLOW = register("yellow", Blocks.YELLOW);
    public static final Item GREEN = register("green", Blocks.GREEN);
    public static final Item BLUE = register("blue", Blocks.BLUE);
    public static final Item PURPLE = register("purple", Blocks.PURPLE);
    public static final Item MAGENTA = register("magenta", Blocks.MAGENTA);
    public static final Item BLACK = register("black", Blocks.BLACK);
    public static final Item GRAY = register("gray", Blocks.GRAY);
    public static final Item BROWN = register("brown", Blocks.BROWN);
    public static final Item WHITE = register("white", Blocks.WHITE);

    //Pastel Powders
    public static final Item RED_POWDER = register("red_powder", Blocks.RED_POWDER);
    public static final Item ORANGE_POWDER = register("orange_powder", Blocks.ORANGE_POWDER);
    public static final Item YELLOW_POWDER = register("yellow_powder", Blocks.YELLOW_POWDER);
    public static final Item GREEN_POWDER = register("green_powder", Blocks.GREEN_POWDER);
    public static final Item BLUE_POWDER = register("blue_powder", Blocks.BLUE_POWDER);
    public static final Item PURPLE_POWDER = register("purple_powder", Blocks.PURPLE_POWDER);
    public static final Item MAGENTA_POWDER = register("magenta_powder", Blocks.MAGENTA_POWDER);
    public static final Item BLACK_POWDER = register("black_powder", Blocks.BLACK_POWDER);
    public static final Item GRAY_POWDER = register("gray_powder", Blocks.GRAY_POWDER);
    public static final Item BROWN_POWDER = register("brown_powder", Blocks.BROWN_POWDER);
    public static final Item WHITE_POWDER = register("white_powder", Blocks.WHITE_POWDER);

    //Pastel Glass
    public static final Item WHITE_GLASS = register("white_glass", Blocks.WHITE_GLASS);

    //Pastel Glass Pane
    public static final Item WHITE_GLASS_PANE = register("white_glass_pane", Blocks.WHITE_GLASS_PANE);

    //Terrain
    public static final Item DIRT = register("dirt", Blocks.DIRT);
    public static final Item GRASS = register("grass", Blocks.GRASS);
    public static final Item STONE = register("stone", Blocks.STONE);
    public static final Item PASTEL_ORE = register("pastel_ore", Blocks.PASTEL_ORE);
    public static final Item SAND = register("sand", Blocks.SAND);

    //Trees
    public static final Item BLUE_LEAF = register("blue_leaves", Blocks.BLUE_LEAF);
    public static final Item RED_LEAF = register("red_leaves", Blocks.RED_LEAF);
    public static final Item GREEN_LEAF = register("green_leaves", Blocks.GREEN_LEAF);
    public static final Item YELLOW_LEAF = register("yellow_leaves", Blocks.YELLOW_LEAF);
    public static final Item LOG = register("log", Blocks.LOG);

    //Pastel Glowstone
    public static final Item RED_PASTEL_GLOWSTONE = register("red_pastel_glowstone", Blocks.RED_PASTEL_GLOWSTONE);
    public static final Item BLUE_PASTEL_GLOWSTONE = register("blue_pastel_glowstone", Blocks.BLUE_PASTEL_GLOWSTONE);

    //Actual Items
    public static final Item PASTEL_POWDER = register("pastel_powder", new Item(ItemGroup.pwMisc()));
    public static final Item PASTEL_INGOT = register("pastel_ingot", new Item(ItemGroup.pwMisc()));
    public static final Item MALLARD_SPAWN_EGG = register("mallard_spawn_egg", new SpawnEggItem(PastelWonderland.MALLARD, 0x297c48, 0xb6a99d, ItemGroup.pwMisc()));

    //Tools and Armor
    public static final ArmorMaterial pastelArmor = new PastelArmors();
    public static final Item PASTEL_HEAD = register("pastel_helmet", new ArmorItem(pastelArmor, EquipmentSlot.HEAD, ItemGroup.pwArmourAndTools()));
    public static final Item PASTEL_CHEST = register("pastel_chestplate", new ArmorItem(pastelArmor, EquipmentSlot.CHEST, ItemGroup.pwArmourAndTools()));
    public static final Item PASTEL_LEGS = register("pastel_leggings", new ArmorItem(pastelArmor, EquipmentSlot.LEGS, ItemGroup.pwArmourAndTools()));
    public static final Item PASTEL_FEET = register("pastel_boots", new ArmorItem(pastelArmor, EquipmentSlot.FEET, ItemGroup.pwArmourAndTools()));
    public static final Item PASTEL_SWORD = register("pastel_sword", new SwordItem(PASTEL_TOOLS, 3, -2.4f, ItemGroup.pwArmourAndTools()));
    public static final Item PASTEL_SHOVEL = register("pastel_shovel", new ShovelItem(PASTEL_TOOLS, 1, -3f, ItemGroup.pwArmourAndTools()));
    public static final Item PASTEL_PICK = register("pastel_pickaxe", new PastelPickItem(PASTEL_TOOLS, 3, -2f, ItemGroup.pwArmourAndTools()));
    public static final Item PASTEL_AXE = register("pastel_axe", new PastelAxeItem(PASTEL_TOOLS, 7, -2f, ItemGroup.pwArmourAndTools()));
    public static final Item PASTEL_HOE = register("pastel_hoe", new PastelHoeItem(PASTEL_TOOLS, 1, -3f, ItemGroup.pwArmourAndTools()));

    //Food
    public static final Item MALLARD_RAW = register("raw_mallard", new Item(ItemGroup.pwMisc().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.5f).build())));
    public static final Item MALLARD_COOKED = register("cooked_mallard", new Item(ItemGroup.pwMisc().food(new FoodComponent.Builder().hunger(4).saturationModifier(3f).build())));
    public static final Item VANILLA_MOCHI = register("vanilla_mochi", new Item(ItemGroup.pwMisc().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.5f).build())));
    public static final Item CHOCO_MOCHI = register("chocolate_mochi", new Item(ItemGroup.pwMisc().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.5f).build())));
    public static final Item STRAWBERRY_MOCHI = register("strawberry_mochi", new Item(ItemGroup.pwMisc().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.5f).build())));
    public static final Item GAY_CANDY = register("rainbow_cotton_candy", new Item(ItemGroup.pwMisc().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build())));


    //registered so i guess i can do /give @p pastelwonderland:colorhere bc fuck you too ig
    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }
    private static Item register(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), new BlockItem(block, ItemGroup.pwBlocks()));
    }

    public static void init() {

    }

}
