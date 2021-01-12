// 🦀 CRAB IN THE CODE 🦀
// live laugh taze

package dev.hiitsdevin.devinsuselessmod;

import com.mojang.blaze3d.platform.GlStateManager;
import dev.hiitsdevin.devinsuselessmod.client.DevinsuselessmodClient;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Devinsuselessmod implements ModInitializer {

    String PrototypePastelVersion = "Devin's Useless Mod - Development Build v0.1.0";
    String PrototypePastelDistribution = "If this build isn't public, and you got it from Devin, please do not redistribute!";

    @Override
    public void onInitialize() {

        // renders version text [pls try to keep this to dev environment, comment this out if you're using in production/release. thank you ♥
        HudRenderCallback.EVENT.register((matrices, delta) -> {
            MinecraftClient.getInstance().textRenderer
                    .drawWithShadow(matrices, PrototypePastelVersion, 1, 1, 0xFFFFFFFF);
        });

        // renders Distribution text
        HudRenderCallback.EVENT.register((matrices, delta) -> {
            MinecraftClient.getInstance().textRenderer
                    .drawWithShadow(matrices, PrototypePastelDistribution, 1, 11, 0xFFFFFFFF);
        });

        // registers portal ability, probably more blocks soon, idk.
        CustomPortalApiRegistry.addPortal(Blocks.BLACK, new Identifier("devin", "devin"), 63, 63, 63);
        CustomPortalApiRegistry.addPortal(Blocks.RED, new Identifier("devin", "devin"), 253,174,187);

        // modularity who
        // each separate class for organizational reasons, this is great
        Items.init();
        Blocks.init();
    }
}
