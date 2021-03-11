package dev.hiitsdevin.pastelwonderland.Base.Organization;

import dev.hiitsdevin.pastelwonderland.Base.Blocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.util.DyeColor;

import static net.minecraft.block.Blocks.*;

public class BlockInfo {
    public static LeavesBlock LeavesBlock() {
        return new LeavesBlock(FabricBlockSettings.copy(OAK_LEAVES).nonOpaque().blockVision(Blocks::never).suffocates(Blocks::never));
    }

    public static Block ConcreteBlock() {
        return new Block(FabricBlockSettings.copy(WHITE_CONCRETE));
    }

    public static Block GlassBlock() {
        return new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS).nonOpaque().blockVision(Blocks::never).suffocates(Blocks::never));
    }

    public static Block GlassPaneBlock(DyeColor GlassColor) {
        return new StainedGlassPaneBlock(GlassColor, FabricBlockSettings.copy(WHITE_STAINED_GLASS_PANE).nonOpaque().blockVision(Blocks::never).suffocates(Blocks::never));
    }

    public static Block PastelGlowstone() {
        return new Block(FabricBlockSettings.copy(GLOWSTONE).luminance((state) -> { return 15; }));
    }
}
