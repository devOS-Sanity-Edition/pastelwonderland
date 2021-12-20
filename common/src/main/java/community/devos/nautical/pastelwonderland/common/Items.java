package community.devos.nautical.pastelwonderland.common;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

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

    public static final Item PASTEL_DIRT = register("dirt", new BlockItem(Blocks.PASTEL_DIRT, ItemGroups.pwBlocks()));
    public static final Item PASTEL_GRASS = register("grass", new BlockItem(Blocks.PASTEL_GRASS, ItemGroups.pwBlocks()));
    public static final Item PASTEL_STONE = register("stone", new BlockItem(Blocks.PASTEL_STONE, ItemGroups.pwBlocks()));
    public static final Item PASTEL_SAND = register("sand", new BlockItem(Blocks.PASTEL_SAND, ItemGroups.pwBlocks()));
    public static final Item PASTEL_ORE = register("pastel_ore", new BlockItem(Blocks.PASTEL_ORE, ItemGroups.pwBlocks()));
    public static final Item LIGHT_BLUE_LEAVES = register("light_blue_leaves", new BlockItem(Blocks.LIGHT_BLUE_LEAVES, ItemGroups.pwBlocks()));
    public static final Item LIGHT_RED_LEAVES = register("light_red_leaves", new BlockItem(Blocks.LIGHT_RED_LEAVES, ItemGroups.pwBlocks()));
    public static final Item YELLOW_LEAVES = register("yellow_leaves", new BlockItem(Blocks.YELLOW_LEAVES, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GREEN_LEAVES =register("light_green_leaves", new BlockItem(Blocks.LIGHT_GREEN_LEAVES, ItemGroups.pwBlocks()));

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

    public static final Item LIGHT_RED_FENCE = register("light_red_fence", new BlockItem(Blocks.LIGHT_RED_FENCE, ItemGroups.pwBlocks()));
    public static final Item RED_FENCE = register("red_fence", new BlockItem(Blocks.RED_FENCE, ItemGroups.pwBlocks()));
    public static final Item ORANGE_FENCE = register("orange_fence", new BlockItem(Blocks.ORANGE_FENCE, ItemGroups.pwBlocks()));
    public static final Item YELLOW_FENCE = register("yellow_fence", new BlockItem(Blocks.YELLOW_FENCE, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GREEN_FENCE = register("light_green_fence", new BlockItem(Blocks.LIGHT_GREEN_FENCE, ItemGroups.pwBlocks()));
    public static final Item GREEN_FENCE = register("green_fence", new BlockItem(Blocks.GREEN_FENCE, ItemGroups.pwBlocks()));
    public static final Item LIGHT_BLUE_FENCE = register("light_blue_fence", new BlockItem(Blocks.LIGHT_BLUE_FENCE, ItemGroups.pwBlocks()));
    public static final Item BLUE_FENCE = register("blue_fence", new BlockItem(Blocks.BLUE_FENCE, ItemGroups.pwBlocks()));
    public static final Item PURPLE_FENCE = register("purple_fence", new BlockItem(Blocks.PURPLE_FENCE, ItemGroups.pwBlocks()));
    public static final Item MAGENTA_FENCE = register("magenta_fence", new BlockItem(Blocks.MAGENTA_FENCE, ItemGroups.pwBlocks()));
    public static final Item BLACK_FENCE = register("black_fence", new BlockItem(Blocks.BLACK_FENCE, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GRAY_FENCE = register("light_gray_fence", new BlockItem(Blocks.LIGHT_GRAY_FENCE, ItemGroups.pwBlocks()));
    public static final Item GRAY_FENCE = register("gray_fence", new BlockItem(Blocks.GRAY_FENCE, ItemGroups.pwBlocks()));
    public static final Item PASTEL_BASE_FENCE = register("pastel_base_fence", new BlockItem(Blocks.PASTEL_BASE_FENCE, ItemGroups.pwBlocks()));
    public static final Item BROWN_FENCE = register("brown_fence", new BlockItem(Blocks.BROWN_FENCE, ItemGroups.pwBlocks()));

    public static final Item LIGHT_RED_FENCE_GATE = register("light_red_fence_gate", new BlockItem(Blocks.LIGHT_RED_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item RED_FENCE_GATE = register("red_fence_gate", new BlockItem(Blocks.RED_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item ORANGE_FENCE_GATE = register("orange_fence_gate", new BlockItem(Blocks.ORANGE_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item YELLOW_FENCE_GATE = register("yellow_fence_gate", new BlockItem(Blocks.YELLOW_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GREEN_FENCE_GATE = register("light_green_fence_gate", new BlockItem(Blocks.LIGHT_GREEN_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item GREEN_FENCE_GATE = register("green_fence_gate", new BlockItem(Blocks.GREEN_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item LIGHT_BLUE_FENCE_GATE = register("light_blue_fence_gate", new BlockItem(Blocks.LIGHT_BLUE_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item BLUE_FENCE_GATE = register("blue_fence_gate", new BlockItem(Blocks.BLUE_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item PURPLE_FENCE_GATE = register("purple_fence_gate", new BlockItem(Blocks.PURPLE_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item MAGENTA_FENCE_GATE = register("magenta_fence_gate", new BlockItem(Blocks.MAGENTA_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item BLACK_FENCE_GATE = register("black_fence_gate", new BlockItem(Blocks.BLACK_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GRAY_FENCE_GATE = register("light_gray_fence_gate", new BlockItem(Blocks.LIGHT_GRAY_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item GRAY_FENCE_GATE = register("gray_fence_gate", new BlockItem(Blocks.GRAY_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item PASTEL_BASE_FENCE_GATE = register("pastel_base_fence_gate", new BlockItem(Blocks.PASTEL_BASE_FENCE_GATE, ItemGroups.pwBlocks()));
    public static final Item BROWN_FENCE_GATE = register("brown_fence_gate", new BlockItem(Blocks.BROWN_FENCE_GATE, ItemGroups.pwBlocks()));

    public static final Item LIGHT_RED_WALL = register("light_red_wall", new BlockItem(Blocks.LIGHT_RED_WALL, ItemGroups.pwBlocks()));
    public static final Item RED_WALL = register("red_wall", new BlockItem(Blocks.RED_WALL, ItemGroups.pwBlocks()));
    public static final Item ORANGE_WALL = register("orange_wall", new BlockItem(Blocks.ORANGE_WALL, ItemGroups.pwBlocks()));
    public static final Item YELLOW_WALL = register("yellow_wall", new BlockItem(Blocks.YELLOW_WALL, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GREEN_WALL = register("light_green_wall", new BlockItem(Blocks.LIGHT_GREEN_WALL, ItemGroups.pwBlocks()));
    public static final Item GREEN_WALL = register("green_wall", new BlockItem(Blocks.GREEN_WALL, ItemGroups.pwBlocks()));
    public static final Item LIGHT_BLUE_WALL = register("light_blue_wall", new BlockItem(Blocks.LIGHT_BLUE_WALL, ItemGroups.pwBlocks()));
    public static final Item BLUE_WALL = register("blue_wall", new BlockItem(Blocks.BLUE_WALL, ItemGroups.pwBlocks()));
    public static final Item PURPLE_WALL = register("purple_wall", new BlockItem(Blocks.PURPLE_WALL, ItemGroups.pwBlocks()));
    public static final Item MAGENTA_WALL = register("magenta_wall", new BlockItem(Blocks.MAGENTA_WALL, ItemGroups.pwBlocks()));
    public static final Item BLACK_WALL = register("black_wall", new BlockItem(Blocks.BLACK_WALL, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GRAY_WALL = register("light_gray_wall", new BlockItem(Blocks.LIGHT_GRAY_WALL, ItemGroups.pwBlocks()));
    public static final Item GRAY_WALL = register("gray_wall", new BlockItem(Blocks.GRAY_WALL, ItemGroups.pwBlocks()));
    public static final Item PASTEL_BASE_WALL = register("pastel_base_wall", new BlockItem(Blocks.PASTEL_BASE_WALL, ItemGroups.pwBlocks()));
    public static final Item BROWN_WALL = register("brown_wall", new BlockItem(Blocks.BROWN_WALL, ItemGroups.pwBlocks()));

    public static final Item LIGHT_RED_GLASS = register("light_red_glass", new BlockItem(Blocks.LIGHT_RED_GLASS, ItemGroups.pwBlocks()));
    public static final Item RED_GLASS = register("red_glass", new BlockItem(Blocks.RED_GLASS, ItemGroups.pwBlocks()));
    public static final Item ORANGE_GLASS = register("orange_glass", new BlockItem(Blocks.ORANGE_GLASS, ItemGroups.pwBlocks()));
    public static final Item YELLOW_GLASS = register("yellow_glass", new BlockItem(Blocks.YELLOW_GLASS, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GREEN_GLASS = register("light_green_glass", new BlockItem(Blocks.LIGHT_GREEN_GLASS, ItemGroups.pwBlocks()));
    public static final Item GREEN_GLASS = register("green_glass", new BlockItem(Blocks.GREEN_GLASS, ItemGroups.pwBlocks()));
    public static final Item LIGHT_BLUE_GLASS = register("light_blue_glass", new BlockItem(Blocks.LIGHT_BLUE_GLASS, ItemGroups.pwBlocks()));
    public static final Item BLUE_GLASS = register("blue_glass", new BlockItem(Blocks.BLUE_GLASS, ItemGroups.pwBlocks()));
    public static final Item PURPLE_GLASS = register("purple_glass", new BlockItem(Blocks.PURPLE_GLASS, ItemGroups.pwBlocks()));
    public static final Item MAGENTA_GLASS = register("magenta_glass", new BlockItem(Blocks.MAGENTA_GLASS, ItemGroups.pwBlocks()));
    public static final Item BLACK_GLASS = register("black_glass", new BlockItem(Blocks.BLACK_GLASS, ItemGroups.pwBlocks()));
    public static final Item LIGHT_GRAY_GLASS = register("light_gray_glass", new BlockItem(Blocks.LIGHT_GRAY_GLASS, ItemGroups.pwBlocks()));
    public static final Item GRAY_GLASS = register("gray_glass", new BlockItem(Blocks.GRAY_GLASS, ItemGroups.pwBlocks()));
    public static final Item PASTEL_BASE_GLASS = register("pastel_base_glass", new BlockItem(Blocks.PASTEL_BASE_GLASS, ItemGroups.pwBlocks()));
    public static final Item BROWN_GLASS = register("brown_glass", new BlockItem(Blocks.BROWN_GLASS, ItemGroups.pwBlocks()));

    public static final Item LIGHT_RED_GLOWSTONE = register("light_red_glowstone", new BlockItem(Blocks.LIGHT_RED_GLOWSTONE, ItemGroups.pwBlocks()));
    public static final Item LIGHT_BLUE_GLOWSTONE = register("light_blue_glowstone", new BlockItem(Blocks.LIGHT_BLUE_GLOWSTONE, ItemGroups.pwBlocks()));

    public final static Item LIGHT_RED_SLAB = register("light_red_slab", new BlockItem(Blocks.LIGHT_RED_SLAB, ItemGroups.pwBlocks()));
    public final static Item RED_SLAB = register("red_slab", new BlockItem(Blocks.RED_SLAB, ItemGroups.pwBlocks()));
    public final static Item ORANGE_SLAB = register("orange_slab", new BlockItem(Blocks.ORANGE_SLAB, ItemGroups.pwBlocks()));
    public final static Item YELLOW_SLAB = register("yellow_slab", new BlockItem(Blocks.YELLOW_SLAB, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GREEN_SLAB = register("light_green_slab", new BlockItem(Blocks.LIGHT_GREEN_SLAB, ItemGroups.pwBlocks()));
    public final static Item GREEN_SLAB = register("green_slab", new BlockItem(Blocks.GREEN_SLAB, ItemGroups.pwBlocks()));
    public final static Item LIGHT_BLUE_SLAB = register("light_blue_slab", new BlockItem(Blocks.LIGHT_BLUE_SLAB, ItemGroups.pwBlocks()));
    public final static Item BLUE_SLAB = register("blue_slab", new BlockItem(Blocks.BLUE_SLAB, ItemGroups.pwBlocks()));
    public final static Item PURPLE_SLAB = register("purple_slab", new BlockItem(Blocks.PURPLE_SLAB, ItemGroups.pwBlocks()));
    public final static Item MAGENTA_SLAB = register("magenta_slab", new BlockItem(Blocks.MAGENTA_SLAB, ItemGroups.pwBlocks()));
    public final static Item BLACK_SLAB = register("black_slab", new BlockItem(Blocks.BLACK_SLAB, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GRAY_SLAB = register("light_gray_slab", new BlockItem(Blocks.LIGHT_GRAY_SLAB, ItemGroups.pwBlocks()));
    public final static Item GRAY_SLAB = register("gray_slab", new BlockItem(Blocks.GRAY_SLAB, ItemGroups.pwBlocks()));
    public final static Item PASTEL_BASE_SLAB = register("pastel_base_slab", new BlockItem(Blocks.PASTEL_BASE_SLAB, ItemGroups.pwBlocks()));
    public final static Item BROWN_SLAB = register("brown_slab", new BlockItem(Blocks.BROWN_SLAB, ItemGroups.pwBlocks()));

    public final static Item LIGHT_RED_STAIRS = register("light_red_stairs", new BlockItem(Blocks.LIGHT_RED_STAIRS, ItemGroups.pwBlocks()));
    public final static Item RED_STAIRS = register("red_stairs", new BlockItem(Blocks.RED_STAIRS, ItemGroups.pwBlocks()));
    public final static Item ORANGE_STAIRS = register("orange_stairs", new BlockItem(Blocks.ORANGE_STAIRS, ItemGroups.pwBlocks()));
    public final static Item YELLOW_STAIRS = register("yellow_stairs", new BlockItem(Blocks.YELLOW_STAIRS, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GREEN_STAIRS = register("light_green_stairs", new BlockItem(Blocks.LIGHT_GREEN_STAIRS, ItemGroups.pwBlocks()));
    public final static Item GREEN_STAIRS = register("green_stairs", new BlockItem(Blocks.GREEN_STAIRS, ItemGroups.pwBlocks()));
    public final static Item LIGHT_BLUE_STAIRS = register("light_blue_stairs", new BlockItem(Blocks.LIGHT_BLUE_STAIRS, ItemGroups.pwBlocks()));
    public final static Item BLUE_STAIRS = register("blue_stairs", new BlockItem(Blocks.BLUE_STAIRS, ItemGroups.pwBlocks()));
    public final static Item PURPLE_STAIRS = register("purple_stairs", new BlockItem(Blocks.PURPLE_STAIRS, ItemGroups.pwBlocks()));
    public final static Item MAGENTA_STAIRS = register("magenta_stairs", new BlockItem(Blocks.MAGENTA_STAIRS, ItemGroups.pwBlocks()));
    public final static Item BLACK_STAIRS = register("black_stairs", new BlockItem(Blocks.BLACK_STAIRS, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GRAY_STAIRS = register("light_gray_stairs", new BlockItem(Blocks.LIGHT_GRAY_STAIRS, ItemGroups.pwBlocks()));
    public final static Item GRAY_STAIRS = register("gray_stairs", new BlockItem(Blocks.GRAY_STAIRS, ItemGroups.pwBlocks()));
    public final static Item PASTEL_BASE_STAIRS = register("pastel_base_stairs", new BlockItem(Blocks.PASTEL_BASE_STAIRS, ItemGroups.pwBlocks()));
    public final static Item BROWN_STAIRS = register("brown_stairs", new BlockItem(Blocks.BROWN_STAIRS, ItemGroups.pwBlocks()));

    public final static Item LIGHT_RED_WOOL = register("light_red_wool", new BlockItem(Blocks.LIGHT_RED_WOOL, ItemGroups.pwBlocks()));
    public final static Item RED_WOOL = register("red_wool", new BlockItem(Blocks.RED_WOOL, ItemGroups.pwBlocks()));
    public final static Item ORANGE_WOOL = register("orange_wool", new BlockItem(Blocks.ORANGE_WOOL, ItemGroups.pwBlocks()));
    public final static Item YELLOW_WOOL = register("yellow_wool", new BlockItem(Blocks.YELLOW_WOOL, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GREEN_WOOL = register("light_green_wool", new BlockItem(Blocks.LIGHT_GREEN_WOOL, ItemGroups.pwBlocks()));
    public final static Item GREEN_WOOL = register("green_wool", new BlockItem(Blocks.GREEN_WOOL, ItemGroups.pwBlocks()));
    public final static Item LIGHT_BLUE_WOOL = register("light_blue_wool", new BlockItem(Blocks.LIGHT_BLUE_WOOL, ItemGroups.pwBlocks()));
    public final static Item BLUE_WOOL = register("blue_wool", new BlockItem(Blocks.BLUE_WOOL, ItemGroups.pwBlocks()));
    public final static Item PURPLE_WOOL = register("purple_wool", new BlockItem(Blocks.PURPLE_WOOL, ItemGroups.pwBlocks()));
    public final static Item MAGENTA_WOOL = register("magenta_wool", new BlockItem(Blocks.MAGENTA_WOOL, ItemGroups.pwBlocks()));
    public final static Item BLACK_WOOL = register("black_wool", new BlockItem(Blocks.BLACK_WOOL, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GRAY_WOOL = register("light_gray_wool", new BlockItem(Blocks.LIGHT_GRAY_WOOL, ItemGroups.pwBlocks()));
    public final static Item GRAY_WOOL = register("gray_wool", new BlockItem(Blocks.GRAY_WOOL, ItemGroups.pwBlocks()));
    public final static Item PASTEL_BASE_WOOL = register("pastel_base_wool", new BlockItem(Blocks.PASTEL_BASE_WOOL, ItemGroups.pwBlocks()));
    public final static Item BROWN_WOOL = register("brown_wool", new BlockItem(Blocks.BROWN_WOOL, ItemGroups.pwBlocks()));

    public final static Item LIGHT_RED_LOG = register("light_red_log", new BlockItem(Blocks.LIGHT_RED_LOG, ItemGroups.pwBlocks()));
    public final static Item YELLOW_LOG = register("yellow_log", new BlockItem(Blocks.YELLOW_LOG, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GREEN_LOG = register("light_green_log", new BlockItem(Blocks.LIGHT_GREEN_LOG, ItemGroups.pwBlocks()));
    public final static Item LIGHT_BLUE_LOG = register("light_blue_log", new BlockItem(Blocks.LIGHT_BLUE_LOG, ItemGroups.pwBlocks()));

    public final static Item LIGHT_RED_PLANK = register("light_red_plank", new BlockItem(Blocks.LIGHT_RED_PLANK, ItemGroups.pwBlocks()));
    public final static Item YELLOW_PLANK = register("yellow_plank", new BlockItem(Blocks.YELLOW_PLANK, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GREEN_PLANK = register("light_green_plank", new BlockItem(Blocks.LIGHT_GREEN_PLANK, ItemGroups.pwBlocks()));
    public final static Item LIGHT_BLUE_PLANK = register("light_blue_plank", new BlockItem(Blocks.LIGHT_BLUE_PLANK, ItemGroups.pwBlocks()));

    public final static Item LIGHT_RED_PLANK_STAIRS = register("light_red_plank_stairs", new BlockItem(Blocks.LIGHT_RED_PLANK_STAIRS, ItemGroups.pwBlocks()));
    public final static Item YELLOW_PLANK_STAIRS = register("yellow_plank_stairs", new BlockItem(Blocks.YELLOW_PLANK_STAIRS, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GREEN_PLANK_STAIRS = register("light_green_plank_stairs", new BlockItem(Blocks.LIGHT_GREEN_PLANK_STAIRS, ItemGroups.pwBlocks()));
    public final static Item LIGHT_BLUE_PLANK_STAIRS = register("light_blue_plank_stairs", new BlockItem(Blocks.LIGHT_BLUE_PLANK_STAIRS, ItemGroups.pwBlocks()));

    public final static Item LIGHT_RED_PLANK_SLAB = register("light_red_plank_slab", new BlockItem(Blocks.LIGHT_RED_PLANK_SLAB, ItemGroups.pwBlocks()));
    public final static Item YELLOW_PLANK_SLAB = register("yellow_plank_slab", new BlockItem(Blocks.YELLOW_PLANK_SLAB, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GREEN_PLANK_SLAB = register("light_green_plank_slab", new BlockItem(Blocks.LIGHT_GREEN_PLANK_SLAB, ItemGroups.pwBlocks()));
    public final static Item LIGHT_BLUE_PLANK_SLAB = register("light_blue_plank_slab", new BlockItem(Blocks.LIGHT_BLUE_PLANK_SLAB, ItemGroups.pwBlocks()));

    public final static Item LIGHT_RED_PLANK_FENCE_GATE = register("light_red_plank_fence_gate", new BlockItem(Blocks.LIGHT_RED_PLANK_FENCE_GATE, ItemGroups.pwBlocks()));
    public final static Item YELLOW_PLANK_FENCE_GATE = register("yellow_plank_fence_gate", new BlockItem(Blocks.YELLOW_PLANK_FENCE_GATE, ItemGroups.pwBlocks()));
    public final static Item LIGHT_GREEN_PLANK_FENCE_GATE = register("light_green_plank_fence_gate", new BlockItem(Blocks.LIGHT_GREEN_PLANK_FENCE_GATE, ItemGroups.pwBlocks()));
    public final static Item LIGHT_BLUE_PLANK_FENCE_GATE = register("light_blue_plank_fence_gate", new BlockItem(Blocks.LIGHT_BLUE_PLANK_FENCE_GATE, ItemGroups.pwBlocks()));

    public static final Item PASTEL_POWDER = register("pastel_powder", new Item(ItemGroups.pwMisc()));
    public static final Item PASTEL_INGOT = register("pastel_ingot", new Item(ItemGroups.pwMisc()));

    public static final Item MALLARD_RAW = register("raw_mallard", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(2).saturationMod(1.5f).build())));
    public static final Item MALLARD_COOKED = register("cooked_mallard", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(3).saturationMod(3f).build())));
    public static final Item VANILLA_MOCHI = register("vanilla_mochi", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(3).saturationMod(1.5f).build())));
    public static final Item CHOCOLATE_MOCHI = register("chocolate_mochi", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(3).saturationMod(1.5f).build())));
    public static final Item COTTON_CANDY_MOCHI = register("cotton_candy_mochi", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(3).saturationMod(1.5f).build())));
    public static final Item STRAWBERRY_MOCHI = register("strawberry_mochi", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(3).saturationMod(1.5f).build())));
    public static final Item COTTON_CANDY = register("rainbow_cotton_candy", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).build())));
    public static final Item COTTON_CANDY_ICE_CREAM = register("cotton_candy_ice_cream", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).alwaysEat().build())));
    public static final Item CHOCOLATE_ICE_CREAM = register("chocolate_ice_cream", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).alwaysEat().build())));
    public static final Item VANILLA_ICE_CREAM = register("vanilla_ice_cream", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).alwaysEat().build())));
    public static final Item STRAWBERRY_ICE_CREAM = register("strawberry_ice_cream", new Item(ItemGroups.pwMisc().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).alwaysEat().build())));

    public static final Item LIGHT_RED_TNT = register("light_red_tnt", new BlockItem(Blocks.LIGHT_RED_TNT, ItemGroups.pwMisc()));


    private static final Item register(String name, Item item) {
        RegistrySupplier<Item> itemSupplied = ITEMS.register(name, () -> item);
        return item;
    }

    public static void init() {
        ITEMS.register();
    }
}
