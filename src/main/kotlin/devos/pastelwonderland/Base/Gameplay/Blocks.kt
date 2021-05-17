package devos.pastelwonderland.Base.Gameplay

import devos.pastelwonderland.Base.Organization.BlockInfo.ConcreteBlock
import devos.pastelwonderland.Base.Organization.ItemGroup
import devos.pastelwonderland.PastelWonderland.Companion.PW_MOD_ID
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.*
import net.minecraft.block.Blocks
import net.minecraft.item.BlockItem
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.registry.Registry
import net.minecraft.world.BlockView

//Copy these block settings
object Blocks {
    @kotlin.jvm.JvmField
    //Full blocks
    val RED = register("red", ConcreteBlock())
    val DARK_RED = register("dark_red", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val BLUE = register("blue", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val GREEN = register("green", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val BLACK = register("black", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val WHITE = register("white", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val GRAY = register("gray", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val MAGENTA = register("magenta", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val PURPLE = register("purple", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val ORANGE = register("orange", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val YELLOW = register("yellow", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val BROWN = register("brown", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))

    //Powder Blocks
    val RED_POWDER = register("red_powder", ConcretePowderBlock(RED, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val DARK_RED_POWDER = register("dark_red_powder", ConcretePowderBlock(DARK_RED, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val ORANGE_POWDER = register("orange_powder", ConcretePowderBlock(ORANGE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val YELLOW_POWDER = register("yellow_powder", ConcretePowderBlock(YELLOW, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val GREEN_POWDER = register("green_powder", ConcretePowderBlock(GREEN, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BLUE_POWDER = register("blue_powder", ConcretePowderBlock(BLUE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val PURPLE_POWDER = register("purple_powder", ConcretePowderBlock(PURPLE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val MAGENTA_POWDER = register("magenta_powder", ConcretePowderBlock(MAGENTA, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val GRAY_POWDER = register("gray_powder", ConcretePowderBlock(GRAY, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BLACK_POWDER = register("black_powder", ConcretePowderBlock(BLACK, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BROWN_POWDER = register("brown_powder", ConcretePowderBlock(BROWN, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val WHITE_POWDER = register("white_powder", ConcretePowderBlock(WHITE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))

    //Nature Blocks
    val PASTEL_DIRT = register("dirt", Block(FabricBlockSettings.copy(Blocks.DIRT)))
    val PASTEL_GRASS = register("grass", GrassBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK)))
    val PASTEL_STONE = register("stone", Block(FabricBlockSettings.copy(Blocks.STONE)))
    val PASTEL_SAND = register("sand", SandBlock(14269048, FabricBlockSettings.copy(Blocks.SAND)))
    val PASTEL_LOG = register("log", PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)))
    val BLUE_LEAVES = register("blue_leaves", Leaves())
    val RED_LEAVES = register("red_leaves", Leaves())
    val YELLOW_LEAVES = register("yellow_leaves", Leaves())
    val GREEN_LEAVES = register("green_leaves", Leaves())

    //Functions
    private fun register(name: String, block: Block): Block {
        Registry.register(Registry.ITEM, Identifier(PW_MOD_ID, name), BlockItem(block, ItemGroup.pwBlocks()))
        return Registry.register(Registry.BLOCK, Identifier(PW_MOD_ID, name), block)
    }

    fun Leaves(): LeavesBlock {
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

    private fun never(blockState: BlockView?, blockView: BlockPos?): Boolean {
        return false;
    }

    fun init() {

    }
}
