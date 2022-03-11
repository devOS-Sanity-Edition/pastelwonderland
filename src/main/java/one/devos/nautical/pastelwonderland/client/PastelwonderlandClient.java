package one.devos.nautical.pastelwonderland.client;

import one.devos.nautical.pastelwonderland.common.GlassBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

@Environment(EnvType.CLIENT)
public class PastelwonderlandClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Block[] block_colors = {GlassBlocks.PASTEL_BASE_GLASS, GlassBlocks.LIGHT_RED_GLASS, GlassBlocks.RED_GLASS, GlassBlocks.ORANGE_GLASS, GlassBlocks.YELLOW_GLASS, GlassBlocks.LIGHT_GREEN_GLASS, GlassBlocks.GREEN_GLASS, GlassBlocks.LIGHT_BLUE_GLASS, GlassBlocks.BLUE_GLASS, GlassBlocks.PURPLE_GLASS, GlassBlocks.MAGENTA_GLASS, GlassBlocks.BROWN_GLASS, GlassBlocks.BLACK_GLASS, GlassBlocks.LIGHT_GRAY_GLASS, GlassBlocks.GRAY_GLASS};
        BlockItem[] item_colors = {GlassBlocks.PASTEL_BASE_GLASS_ITEM, GlassBlocks.LIGHT_RED_GLASS_ITEM, GlassBlocks.RED_GLASS_ITEM, GlassBlocks.ORANGE_GLASS_ITEM, GlassBlocks.YELLOW_GLASS_ITEM, GlassBlocks.LIGHT_GREEN_GLASS_ITEM, GlassBlocks.GREEN_GLASS_ITEM, GlassBlocks.LIGHT_BLUE_GLASS_ITEM, GlassBlocks.BLUE_GLASS_ITEM, GlassBlocks.PURPLE_GLASS_ITEM, GlassBlocks.MAGENTA_GLASS_ITEM, GlassBlocks.BROWN_GLASS_ITEM, GlassBlocks.BLACK_GLASS_ITEM, GlassBlocks.LIGHT_GRAY_GLASS_ITEM, GlassBlocks.GRAY_GLASS_ITEM};

        Block[] pane_block_colors = {GlassBlocks.PASTEL_BASE_GLASS_PANE, GlassBlocks.LIGHT_RED_GLASS_PANE, GlassBlocks.RED_GLASS_PANE, GlassBlocks.ORANGE_GLASS_PANE, GlassBlocks.YELLOW_GLASS_PANE, GlassBlocks.LIGHT_GREEN_GLASS_PANE, GlassBlocks.GREEN_GLASS_PANE, GlassBlocks.LIGHT_BLUE_GLASS_PANE, GlassBlocks.BLUE_GLASS_PANE, GlassBlocks.PURPLE_GLASS_PANE, GlassBlocks.MAGENTA_GLASS_PANE, GlassBlocks.BROWN_GLASS_PANE, GlassBlocks.BLACK_GLASS_PANE, GlassBlocks.LIGHT_GRAY_GLASS_PANE, GlassBlocks.GRAY_GLASS_PANE};
        BlockItem[] pane_item_colors = {GlassBlocks.PASTEL_BASE_GLASS_PANE_ITEM, GlassBlocks.LIGHT_RED_GLASS_PANE_ITEM, GlassBlocks.RED_GLASS_PANE_ITEM, GlassBlocks.ORANGE_GLASS_PANE_ITEM, GlassBlocks.YELLOW_GLASS_PANE_ITEM, GlassBlocks.LIGHT_GREEN_GLASS_PANE_ITEM, GlassBlocks.GREEN_GLASS_PANE_ITEM, GlassBlocks.LIGHT_BLUE_GLASS_PANE_ITEM, GlassBlocks.BLUE_GLASS_PANE_ITEM, GlassBlocks.PURPLE_GLASS_PANE_ITEM, GlassBlocks.MAGENTA_GLASS_PANE_ITEM, GlassBlocks.BROWN_GLASS_PANE_ITEM, GlassBlocks.BLACK_GLASS_PANE_ITEM, GlassBlocks.LIGHT_GRAY_GLASS_PANE_ITEM, GlassBlocks.GRAY_GLASS_PANE_ITEM};

        for (Block block: block_colors) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
        }
        for (BlockItem blockItem: item_colors) {
            BlockRenderLayerMap.INSTANCE.putItem(blockItem, RenderType.translucent());
        }

        for (Block block: pane_block_colors) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
        }
        for (BlockItem blockItem: pane_item_colors) {
            BlockRenderLayerMap.INSTANCE.putItem(blockItem, RenderType.translucent());
        }
    }
}
