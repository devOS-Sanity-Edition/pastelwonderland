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
    // all the blocks that are being added
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
