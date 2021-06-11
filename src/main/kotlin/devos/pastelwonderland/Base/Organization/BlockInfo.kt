package devos.pastelwonderland.Base.Organization

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.*
import net.minecraft.util.DyeColor
import net.minecraft.util.math.BlockPos
import net.minecraft.world.BlockView


object BlockInfo {
    fun PastelLeaves(): LeavesBlock {
        return LeavesBlock(
            FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()
                .blockVision { obj: BlockState?, blockState: BlockView?, blockView: BlockPos? ->
                    never(
                        blockState,
                        blockView
                    )
                }.suffocates { obj: BlockState?, blockState: BlockView?, blockView: BlockPos? ->
                    never(
                        blockState,
                        blockView
                    )
                })
    }

    fun never(blockState: BlockView?, blockView: BlockPos?): Boolean {
        return false;
    }

    fun PastelConcreteBlock(): Block {
        return Block(FabricBlockSettings.of(Material.STONE))
    }

    fun PastelFence(): FenceBlock {
        return FenceBlock(FabricBlockSettings.of(Material.STONE))
    }

    fun PastelFenceGates(): FenceGateBlock {
        return FenceGateBlock(FabricBlockSettings.of(Material.STONE))
    }

    fun PastelGlassBlock(): Block {
        return GlassBlock(
            FabricBlockSettings.copy(Blocks.WHITE_STAINED_GLASS).nonOpaque().blockVision { obj: BlockState?, blockState: BlockView?, blockView: BlockPos? ->
                never(
                    blockState,
                    blockView
                )
            }.suffocates { obj: BlockState?, blockState: BlockView?, blockView: BlockPos? ->
                never(
                    blockState,
                    blockView
                )
            }
        )
    }

    fun PastelGlassPaneBlock(GlassColor: DyeColor?): Block {
        return StainedGlassPaneBlock(
            GlassColor,
            FabricBlockSettings.copy(Blocks.WHITE_STAINED_GLASS_PANE).nonOpaque().blockVision { obj: BlockState?, blockState: BlockView?, blockView: BlockPos? ->
                never(
                    blockState,
                    blockView
                )
            }.suffocates { obj: BlockState?, blockState: BlockView?, blockView: BlockPos? ->
                never(
                    blockState,
                    blockView
                )
            }
        )
    }

    fun PastelGlowstone(): Block {
        return Block(FabricBlockSettings.copy(Blocks.GLOWSTONE).luminance { state: BlockState? -> 15 })
    }

    fun PastelSlabs(): SlabBlock {
        return SlabBlock(FabricBlockSettings.of(Material.STONE))
    }

    class PastelStairsInfo(baseBlockState: BlockState?, settings: Settings?) :
        StairsBlock(baseBlockState, settings)

    fun PastelStairs(): StairsBlock {
        return PastelStairsInfo(Blocks.STONE.defaultState, FabricBlockSettings.of(Material.STONE))
    }

    fun PastelWalls(): WallBlock {
        return WallBlock(FabricBlockSettings.of(Material.STONE))
    }

    fun PastelWool(): Block {
        return Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL))
    }

    // Wood Varients below

    fun PastelWoodPlanks(): Block {
        return Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS))
    }

    fun PastelWoodLogs(): Block {
        return PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG))
    }
}