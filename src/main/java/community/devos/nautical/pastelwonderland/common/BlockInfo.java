package community.devos.nautical.pastelwonderland.common;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.StainedGlassPaneBlock;

import static net.minecraft.world.level.block.Blocks.*;

public class BlockInfo {
    public static LeavesBlock LeavesBlock() {
        return new LeavesBlock(FabricBlockSettings.copy(OAK_LEAVES)); //todo: revisit this to make it non-suffocatable, non-opaque, and can view through
    }

    public static Block ConcreteBlock() {
        return new Block(FabricBlockSettings.copy(WHITE_CONCRETE));
    }

    public static GlassBlock GlassBlock() {
        return new GlassBlock(FabricBlockSettings.copy(WHITE_STAINED_GLASS));
    }

    public static StainedGlassPaneBlock StainedGlassBlock(DyeColor GlassColor) {
        return new StainedGlassPaneBlock(GlassColor, FabricBlockSettings.copy(WHITE_STAINED_GLASS));
    }

    public static Block PastelGlowstone() {
        return new Block(FabricBlockSettings.copy(GLOWSTONE));
    }
}
