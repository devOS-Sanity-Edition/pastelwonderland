package one.devos.nautical.pastelwonderland.common;

import one.devos.nautical.pastelwonderland.Pastelwonderland;
import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.StainedGlassPaneBlock;

import static one.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;
import static net.minecraft.world.level.block.Blocks.WHITE_STAINED_GLASS;

public class GlassBlocks {

    // Glass is a special child and i have to call each one manually elsewhere soooooooooo
    public static final Block PASTEL_BASE_GLASS = register_glass_block("pastel_base_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block LIGHT_RED_GLASS = register_glass_block("light_red_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block RED_GLASS = register_glass_block("red_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block ORANGE_GLASS = register_glass_block("orange_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block YELLOW_GLASS = register_glass_block("yellow_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block LIGHT_GREEN_GLASS = register_glass_block("light_green_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block GREEN_GLASS = register_glass_block("green_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_GLASS = register_glass_block("light_blue_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block BLUE_GLASS = register_glass_block("blue_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block PURPLE_GLASS = register_glass_block("purple_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block MAGENTA_GLASS = register_glass_block("magenta_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block BROWN_GLASS = register_glass_block("brown_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block BLACK_GLASS = register_glass_block("black_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_GLASS = register_glass_block("light_gray_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block GRAY_GLASS = register_glass_block("gray_glass", new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS)));

    public static final BlockItem PASTEL_BASE_GLASS_ITEM = register_glass_blockitem("pastel_base_glass", PASTEL_BASE_GLASS);
    public static final BlockItem LIGHT_RED_GLASS_ITEM = register_glass_blockitem("light_red_glass", LIGHT_RED_GLASS);
    public static final BlockItem RED_GLASS_ITEM = register_glass_blockitem("red_glass", RED_GLASS);
    public static final BlockItem ORANGE_GLASS_ITEM = register_glass_blockitem("orange_glass", ORANGE_GLASS);
    public static final BlockItem YELLOW_GLASS_ITEM = register_glass_blockitem("yellow_glass", YELLOW_GLASS);
    public static final BlockItem LIGHT_GREEN_GLASS_ITEM = register_glass_blockitem("light_green_glass", LIGHT_GREEN_GLASS);
    public static final BlockItem GREEN_GLASS_ITEM = register_glass_blockitem("green_glass", GREEN_GLASS);
    public static final BlockItem LIGHT_BLUE_GLASS_ITEM = register_glass_blockitem("light_blue_glass", LIGHT_BLUE_GLASS);
    public static final BlockItem BLUE_GLASS_ITEM = register_glass_blockitem("blue_glass", BLUE_GLASS);
    public static final BlockItem PURPLE_GLASS_ITEM = register_glass_blockitem("purple_glass", PURPLE_GLASS);
    public static final BlockItem MAGENTA_GLASS_ITEM = register_glass_blockitem("magenta_glass", MAGENTA_GLASS);
    public static final BlockItem BROWN_GLASS_ITEM = register_glass_blockitem("brown_glass", BROWN_GLASS);
    public static final BlockItem BLACK_GLASS_ITEM = register_glass_blockitem("black_glass", BLACK_GLASS);
    public static final BlockItem LIGHT_GRAY_GLASS_ITEM = register_glass_blockitem("light_gray_glass", LIGHT_GRAY_GLASS);
    public static final BlockItem GRAY_GLASS_ITEM = register_glass_blockitem("gray_glass", GRAY_GLASS);

    public static final Block PASTEL_BASE_GLASS_PANE = register_glass_block("pastel_base_glass_pane", new StainedGlassPaneBlock(DyeColor.WHITE, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block LIGHT_RED_GLASS_PANE = register_glass_block("light_red_glass_pane", new StainedGlassPaneBlock(DyeColor.PINK, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block RED_GLASS_PANE = register_glass_block("red_glass_pane", new StainedGlassPaneBlock(DyeColor.RED, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block ORANGE_GLASS_PANE = register_glass_block("orange_glass_pane", new StainedGlassPaneBlock(DyeColor.ORANGE, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block YELLOW_GLASS_PANE = register_glass_block("yellow_glass_pane", new StainedGlassPaneBlock(DyeColor.YELLOW, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block LIGHT_GREEN_GLASS_PANE = register_glass_block("light_green_glass_pane", new StainedGlassPaneBlock(DyeColor.LIME, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block GREEN_GLASS_PANE = register_glass_block("green_glass_pane", new StainedGlassPaneBlock(DyeColor.GREEN, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block LIGHT_BLUE_GLASS_PANE = register_glass_block("light_blue_glass_pane", new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block BLUE_GLASS_PANE = register_glass_block("blue_glass_pane", new StainedGlassPaneBlock(DyeColor.BLUE, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block PURPLE_GLASS_PANE = register_glass_block("purple_glass_pane", new StainedGlassPaneBlock(DyeColor.PURPLE, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block MAGENTA_GLASS_PANE = register_glass_block("magenta_glass_pane", new StainedGlassPaneBlock(DyeColor.MAGENTA, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block BROWN_GLASS_PANE = register_glass_block("brown_glass_pane", new StainedGlassPaneBlock(DyeColor.BROWN, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block BLACK_GLASS_PANE = register_glass_block("black_glass_pane", new StainedGlassPaneBlock(DyeColor.BLACK, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block LIGHT_GRAY_GLASS_PANE = register_glass_block("light_gray_glass_pane", new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));
    public static final Block GRAY_GLASS_PANE = register_glass_block("gray_glass_pane", new StainedGlassPaneBlock(DyeColor.GRAY, FabricBlockSettings.copy(WHITE_STAINED_GLASS)));

    public static final BlockItem PASTEL_BASE_GLASS_PANE_ITEM = register_glass_blockitem("pastel_base_glass_pane", PASTEL_BASE_GLASS_PANE);
    public static final BlockItem LIGHT_RED_GLASS_PANE_ITEM = register_glass_blockitem("light_red_glass_pane", LIGHT_RED_GLASS_PANE);
    public static final BlockItem RED_GLASS_PANE_ITEM = register_glass_blockitem("red_glass_pane", RED_GLASS_PANE);
    public static final BlockItem ORANGE_GLASS_PANE_ITEM = register_glass_blockitem("orange_glass_pane", ORANGE_GLASS_PANE);
    public static final BlockItem YELLOW_GLASS_PANE_ITEM = register_glass_blockitem("yellow_glass_pane", YELLOW_GLASS_PANE);
    public static final BlockItem LIGHT_GREEN_GLASS_PANE_ITEM = register_glass_blockitem("light_green_glass_pane", LIGHT_GREEN_GLASS_PANE);
    public static final BlockItem GREEN_GLASS_PANE_ITEM = register_glass_blockitem("green_glass_pane", GREEN_GLASS_PANE);
    public static final BlockItem LIGHT_BLUE_GLASS_PANE_ITEM = register_glass_blockitem("light_blue_glass_pane", LIGHT_BLUE_GLASS_PANE);
    public static final BlockItem BLUE_GLASS_PANE_ITEM = register_glass_blockitem("blue_glass_pane", BLUE_GLASS_PANE);
    public static final BlockItem PURPLE_GLASS_PANE_ITEM = register_glass_blockitem("purple_glass_pane", PURPLE_GLASS_PANE);
    public static final BlockItem MAGENTA_GLASS_PANE_ITEM = register_glass_blockitem("magenta_glass_pane", MAGENTA_GLASS_PANE);
    public static final BlockItem BROWN_GLASS_PANE_ITEM = register_glass_blockitem("brown_glass_pane", BROWN_GLASS_PANE);
    public static final BlockItem BLACK_GLASS_PANE_ITEM = register_glass_blockitem("black_glass_pane", BLACK_GLASS_PANE);
    public static final BlockItem LIGHT_GRAY_GLASS_PANE_ITEM = register_glass_blockitem("light_gray_glass_pane", LIGHT_GRAY_GLASS_PANE);
    public static final BlockItem GRAY_GLASS_PANE_ITEM = register_glass_blockitem("gray_glass_pane", GRAY_GLASS_PANE);

    public static void init() {}

    private static Block register_glass_block(String name, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }
    private static BlockItem register_glass_blockitem(String name, Block block) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new OwoItemSettings().group(Pastelwonderland.PW_ITEM_GROUP).tab(1)));
    }
}
