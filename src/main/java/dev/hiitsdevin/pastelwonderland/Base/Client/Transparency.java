package dev.hiitsdevin.pastelwonderland.Base.Client;

import dev.hiitsdevin.pastelwonderland.Base.Blocks;
import dev.hiitsdevin.pastelwonderland.Base.Items;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class Transparency {
    public static void init() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), Blocks.WHITE_GLASS, Blocks.WHITE_GLASS_PANE);
        BlockRenderLayerMap.INSTANCE.putItems(RenderLayer.getTranslucent(), Items.WHITE_GLASS, Items.WHITE_GLASS_PANE);
    }
}
