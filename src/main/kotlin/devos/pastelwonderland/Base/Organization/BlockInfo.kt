package devos.pastelwonderland.Base.Organization

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.*
import net.minecraft.util.DyeColor

object BlockInfo {
    fun LeavesBlock(): LeavesBlock {
        return LeavesBlock(
            FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()//.blockVision(Blocks::never).suffocates(Blocks::never)
        )
    }

    fun ConcreteBlock(): Block {
        return Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE))
    }

    fun GlassBlock(): Block {
        return GlassBlock(
            FabricBlockSettings.copy(Blocks.WHITE_STAINED_GLASS).nonOpaque()//.blockVision(Blocks::never)
            //.suffocates(Blocks::never)
        )
    }

    fun GlassPaneBlock(GlassColor: DyeColor?): Block {
        return StainedGlassPaneBlock(
            GlassColor,
            FabricBlockSettings.copy(Blocks.WHITE_STAINED_GLASS_PANE).nonOpaque()//.blockVision(Blocks::never)
            //.suffocates(Blocks::never)
        )
    }

    fun PastelGlowstone(): Block {
        return Block(FabricBlockSettings.copy(Blocks.GLOWSTONE).luminance { state: BlockState? -> 15 })
    }
}