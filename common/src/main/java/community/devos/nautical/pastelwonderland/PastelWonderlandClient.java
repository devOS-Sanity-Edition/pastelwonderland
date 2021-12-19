package community.devos.nautical.pastelwonderland;

import community.devos.nautical.pastelwonderland.common.Blocks;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public class PastelWonderlandClient {
    public static void init() {
        RenderTypeRegistry.register(RenderType.cutout(),
                Blocks.LIGHT_RED_GLASS,
                Blocks.RED_GLASS,
                Blocks.ORANGE_GLASS,
                Blocks.YELLOW_GLASS,
                Blocks.LIGHT_GREEN_GLASS,
                Blocks.GREEN_GLASS,
                Blocks.LIGHT_BLUE_GLASS,
                Blocks.BLUE_GLASS,
                Blocks.PURPLE_GLASS,
                Blocks.MAGENTA_GLASS,
                Blocks.BLACK_GLASS,
                Blocks.LIGHT_GRAY_GLASS,
                Blocks.GRAY_GLASS,
                Blocks.PASTEL_BASE_GLASS,
                Blocks.BROWN_GLASS
                /*Blocks.LIGHT_RED_GLASS_PANE*/);
        RenderTypeRegistry.register(RenderType.translucent(), Blocks.LIGHT_RED_GLASS,
                Blocks.RED_GLASS,
                Blocks.ORANGE_GLASS,
                Blocks.YELLOW_GLASS,
                Blocks.LIGHT_GREEN_GLASS,
                Blocks.GREEN_GLASS,
                Blocks.LIGHT_BLUE_GLASS,
                Blocks.BLUE_GLASS,
                Blocks.PURPLE_GLASS,
                Blocks.MAGENTA_GLASS,
                Blocks.BLACK_GLASS,
                Blocks.LIGHT_GRAY_GLASS,
                Blocks.GRAY_GLASS,
                Blocks.PASTEL_BASE_GLASS,
                Blocks.BROWN_GLASS
                /*Blocks.LIGHT_RED_GLASS_PANE*/);
    }
}
